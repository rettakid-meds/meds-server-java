package za.co.rettakid.meds.presentation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import za.co.rettakid.meds.common.dto.LoginDto;
import za.co.rettakid.meds.common.dto.PermissionDto;
import za.co.rettakid.meds.common.dto.UserDto;
import za.co.rettakid.meds.common.dto.UserPermissionDto;
import za.co.rettakid.meds.common.enums.PermissionEnum;
import za.co.rettakid.meds.common.error.MedsError;
import za.co.rettakid.meds.common.error.MedsErrorException;
import za.co.rettakid.meds.presentation.binding.BindLogin;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.presentation.vo.LoginVo;
import za.co.rettakid.meds.presentation.vo.UserVo;
import za.co.rettakid.meds.services.LoginService;
import za.co.rettakid.meds.services.UserPermissionService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwazi Prusent on 2015/10/20.
 */
public class BaseController {

    protected String FILE_DIR = "C:\\images\\";
    protected String MAPS_API_KEY = "AIzaSyAhibwMQzQFt92wgjriJs_Y9deAfmcMOAg";
    private static final String TOAST_TEXT = "toastText";

    @Autowired
    private LoginService loginService;
    @Autowired
    private UserPermissionService userPermissionService;

    protected void createToast(Model model, String toastText) {
        model.addAttribute(TOAST_TEXT, toastText);
    }

    protected String doRedirect(String page) {
        return String.format("redirect:/%s", page);
    }

    protected Boolean loginUser(LoginVo loginVo) {
        UserDto userDto = loginService.login(BindLogin.bindLogin(loginVo));
        if (userDto != null) {
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            UserPermissionDto userPermissionDto = new UserPermissionDto();
            userPermissionDto.setUser(userDto);
            for (final PermissionDto permissionDto : userPermissionService.getPermissionsForUser(userDto.getUserId()).getPermissionList()) {
                grantedAuthorities.add(
                        new GrantedAuthority() {
                            @Override
                            public String getAuthority() {
                                return permissionDto.getPermissionName();
                            }
                        }
                );
            }
            Authentication authentication = new UsernamePasswordAuthenticationToken(userDto, null, grantedAuthorities);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            return true;
        }
        return false;
    }

    /*errors*/
    @ExceptionHandler(MedsErrorException.class)
    public ModelAndView catchMedsError(MedsErrorException e) {
        ModelAndView model = new ModelAndView(PageDirectory.ERROR);
        switch (e.getMedsError()) {
            case LOGIN_DOES_NOT_EXIST:
                model.setViewName(PageDirectory.LOGIN);
                model.addObject("loginVO", new LoginVo());
                break;
            case USER_ALREADY_NOT_EXIST:
                model.setViewName(PageDirectory.REGISTER);
                model.addObject("userVo", new UserVo());
                model.addObject(TOAST_TEXT, MedsError.USER_ALREADY_NOT_EXIST.getError());
                break;
        }
        return model;
    }

}
