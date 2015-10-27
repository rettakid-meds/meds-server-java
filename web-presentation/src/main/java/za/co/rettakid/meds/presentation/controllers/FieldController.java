package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.services.FieldService;

/**
 * Created by Lwazi Prusent on 2015/10/26.
 */
@Controller
@RequestMapping("/fields")
public class FieldController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(DashboardController.class);

    @Autowired
    private FieldService fieldService;

    @RequestMapping
    public String getDashboardPage(Model model) {
        LOGGER.info("accessed field page");
        model.addAttribute("fields",fieldService.getFields().getFieldList());
        return PageDirectory.FIELDS;
    }

}
