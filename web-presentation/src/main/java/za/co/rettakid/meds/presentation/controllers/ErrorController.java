package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.rettakid.meds.presentation.common.PageDirectory;

/**
 * Created by Lwazi Prusent on 2015/10/25.
 */
@Controller
@RequestMapping("/error")
public class ErrorController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(ErrorController.class);

    @RequestMapping("/403")
    public String get403Error(Model model) {
        LOGGER.info("Error 403");
        model.addAttribute("error","403 you are not authorised to view this page");
        return PageDirectory.ERROR;
    }

    @RequestMapping("/404")
    public String get404Error(Model model) {
        model.addAttribute("error","404 this page does not exist");
        LOGGER.info("Error 404");
        return PageDirectory.ERROR;
    }

}
