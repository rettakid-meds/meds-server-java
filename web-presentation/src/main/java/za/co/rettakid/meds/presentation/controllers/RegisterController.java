package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import za.co.rettakid.meds.common.dto.UserDto;
import za.co.rettakid.meds.common.Utilz;
import za.co.rettakid.meds.common.enums.PermissionSet;
import za.co.rettakid.meds.presentation.binding.BindUser;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.presentation.vo.UserVo;
import za.co.rettakid.meds.services.LoginService;
import za.co.rettakid.meds.services.UserService;

import javax.validation.Valid;

/**
 * Created by Lwazi Prusent on 2015/10/30.
 */
@Controller
@RequestMapping("/register")
public class RegisterController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(RegisterController.class);

    @Autowired
    private LoginService loginService;

    @RequestMapping(method = RequestMethod.GET)
    public String getRegister(Model model) {
        LOGGER.info("get register");
        model.addAttribute("userVo", new UserVo());
        return PageDirectory.REGISTER;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String postLoginPage(@ModelAttribute("userVo") @Valid UserVo userVo, BindingResult error, Model model,@RequestParam("confirm-password")String confirmPassword) {
        LOGGER.info("create user");
        if (error.hasErrors())  {
            createToast(model,"Please complete form.");
        } else  {
            if (userVo.getPassword().equals(confirmPassword)) {
                loginService.resister(BindUser.bindUser(userVo), PermissionSet.NORMAL);
                createToast(model, "Please login");
                return doRedirect(PageDirectory.LOGIN);
            } else  {
                createToast(model, "Please confirm password.");
            }
        }
        return PageDirectory.REGISTER;
    }

}
