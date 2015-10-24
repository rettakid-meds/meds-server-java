package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Lwazi Prusent on 2015/10/20.
 */
@Controller
@RequestMapping("/dashboard")
public class DashboardController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(DashboardController.class);

    @RequestMapping
    public String getDashboardPage(Model model) {
        LOGGER.info("accessed dashboard");
        return DASHBOARD_PAGE;
    }

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public String postDashboardPage(Model model) {
        LOGGER.info("post dashboard");
        return doRedirect("/dashboard");
    }

}
