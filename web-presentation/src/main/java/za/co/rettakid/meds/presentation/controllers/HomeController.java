package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.rettakid.meds.presentation.common.PageDirectory;

/**
 * Created by Lwazi Prusent on 2015/10/20.
 */
@Controller
@RequestMapping
public class HomeController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(HomeController.class);

    @RequestMapping
    public String getHomePage(Model model) {
        LOGGER.info("Accessed home page");
        return PageDirectory.HOME;
    }

}
