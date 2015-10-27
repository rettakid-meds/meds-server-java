package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.services.PracticeService;

/**
 * Created by Lwazi Prusent on 2015/10/26.
 */
@Controller
@RequestMapping("/practices")
public class PracticeController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(PracticeController.class);

    @Autowired
    private PracticeService practiceService;

    @RequestMapping
    public String getPracticePage(Model model) {
        LOGGER.info("accessed practice page");
        model.addAttribute("practices",practiceService.getPractices().getPracticeList());
        return PageDirectory.PRACTICES;
    }

    @RequestMapping("/{practiceId}")
    public String getPracticeItem(Model model,@PathVariable("practiceId") Long practiceId) {
        LOGGER.info("retuning single practice item");
        model.addAttribute("practice",practiceService.getPractices(practiceId));
        return PageDirectory.PRACTICES_ITEM;
    }

}
