package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import za.co.rettakid.meds.common.dto.PracticeDto;
import za.co.rettakid.meds.presentation.common.ListDivider;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.services.PracticeService;

import java.util.List;

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
        ListDivider<PracticeDto> listDivider = new ListDivider<>();
        List<List<PracticeDto>> practices = listDivider.divideList(practiceService.getPractices().getPracticeList());
        model.addAttribute("practices", practices);
        return PageDirectory.PRACTICES;
    }

    @RequestMapping("/{practiceId}")
    public String getPracticeItem(Model model,@PathVariable("practiceId") Long practiceId) {
        LOGGER.info("retuning single practice item");
        model.addAttribute("practice", practiceService.getPractices(practiceId));
        model.addAttribute("tradingDay", practiceService.getPractices(practiceId).getTradingDay());
        model.addAttribute("mapsApiKey",MAPS_API_KEY);
        return PageDirectory.PRACTICES_ITEM;
    }

    @RequestMapping(value = "/{practiceId}",method = RequestMethod.POST)
    public String putPracticeItem(Model model,@PathVariable("practiceId") Long practiceId,@ModelAttribute("practice") PracticeDto practiceDto,BindingResult errors) {
        LOGGER.info("edit practice item");
        if(errors.hasErrors())  {
            model.addAttribute("practice", practiceDto);
            model.addAttribute("tradingDay", practiceDto.getTradingDay());
            model.addAttribute("mapsApiKey",MAPS_API_KEY);
            return PageDirectory.PRACTICES_FORM;
        } else  {
            practiceService.putPractices(practiceDto);
            return PageDirectory.SUCCESS;
        }
    }

}
