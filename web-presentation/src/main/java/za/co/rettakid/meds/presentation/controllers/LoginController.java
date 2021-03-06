package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import za.co.rettakid.meds.common.dto.UserDto;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.presentation.vo.LoginVo;

/**
 * Created by Lwazi Prusent on 2015/10/20.
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(LoginController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String getLoginPage(Model model) {
        LOGGER.info("accessed login");
        model.addAttribute("loginVo", new LoginVo());
        return PageDirectory.LOGIN;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String postLoginPage(@ModelAttribute("loginVo") LoginVo loginVo, BindingResult error, Model model) {
        LOGGER.info("post login");
        if (error.hasErrors())  {
            return PageDirectory.LOGIN;
        } else  {
            Authentication authentication = new UsernamePasswordAuthenticationToken(new UserDto(), null, null);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            return doRedirect(PageDirectory.DASHBOARD);
        }

    }

}
