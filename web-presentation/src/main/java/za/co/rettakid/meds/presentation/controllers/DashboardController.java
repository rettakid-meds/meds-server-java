package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.services.FieldService;
import za.co.rettakid.meds.services.PracticeFieldService;

/**
 * Created by Lwazi Prusent on 2015/10/20.
 */
@Controller
@RequestMapping("/dashboard")
public class DashboardController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(DashboardController.class);

    @Autowired
    private PracticeFieldService practiceFieldService;
    @Autowired
    private FieldService fieldService;

    @RequestMapping
    public String getDashboardPage(Model model) {
        LOGGER.debug("accessed dashboard page");
        model.addAttribute("fields",fieldService.getFields().getFieldList());
        model.addAttribute("practices",practiceFieldService.getPracticeFields().getPracticeFieldList());
        model.addAttribute("mapsApiWebKey", MAPS_API_WEB_KEY);
        return PageDirectory.DASHBOARD;
    }

}
