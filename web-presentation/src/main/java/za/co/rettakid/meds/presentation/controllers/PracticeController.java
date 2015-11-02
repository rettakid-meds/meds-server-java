package za.co.rettakid.meds.presentation.controllers;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Decoder;
import za.co.rettakid.meds.common.dto.PracticeDto;
import za.co.rettakid.meds.presentation.common.ListDivider;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.services.PracticeService;

import java.io.IOException;
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

    @RequestMapping("/{practiceId}/form")
    public String getPracticeItemForm(Model model,@PathVariable("practiceId") Long practiceId) {
        LOGGER.info("retuning single practice form");
        model.addAttribute("practice", practiceService.getPractices(practiceId));
        model.addAttribute("tradingDay", practiceService.getPractices(practiceId).getTradingDay());
        model.addAttribute("mapsApiKey",MAPS_API_KEY);
        return PageDirectory.PRACTICES_FORM;
    }

    @RequestMapping(value = "/{practiceId}",method = RequestMethod.POST)
    public String putPracticeItem(@ModelAttribute("practice") PracticeDto practiceDto,BindingResult errors,Model model,
                                  @PathVariable("practiceId") Long practiceId,
                                  @RequestParam("imageFile") String imageFile) throws IOException {
        LOGGER.info("edit practice item");
        if(errors.hasErrors())  {
            model.addAttribute("practice", practiceDto);
            model.addAttribute("tradingDay", practiceDto.getTradingDay());
            model.addAttribute("mapsApiKey",MAPS_API_KEY);
            return PageDirectory.PRACTICES_FORM;
        } else  {
            imageFile = imageFile.substring(22);
            practiceService.putPractices(practiceDto,Base64.decodeBase64(imageFile.getBytes()));
            return doRedirect("/practices/" + practiceId);
        }
    }

}
