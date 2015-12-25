package za.co.rettakid.meds.presentation.controllers;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.common.dto.PracticeDto;
import za.co.rettakid.meds.common.enums.PermissionEnum;
import za.co.rettakid.meds.presentation.binding.BindPractice;
import za.co.rettakid.meds.presentation.binding.BindTradingDay;
import za.co.rettakid.meds.presentation.common.ListDivider;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.presentation.vo.PracticeVo;
import za.co.rettakid.meds.presentation.vo.TradingDayVo;
import za.co.rettakid.meds.services.PracticeService;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
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
        LOGGER.debug("accessed practice page");
        ListDivider<PracticeDto> listDivider = new ListDivider<>();
        List<List<PracticeDto>> practices = listDivider.divideList(practiceService.getPractices().getPracticeList(), 3);
        model.addAttribute("practices", practices);
        return PageDirectory.PRACTICES;
    }

    @RequestMapping("/{practiceId}")
    public String getPracticeItem(Model model, @PathVariable("practiceId") Long practiceId) {
        LOGGER.debug("retuning single practice item");
        PracticeDto practiceDto = practiceService.getPractices(practiceId);
        model.addAttribute("practice", practiceDto);
        model.addAttribute("tradingDay", practiceDto.getTradingDay());
        model.addAttribute("doctorPractices", practiceDto.getDoctorPracticePractices().getDoctorPracticeList());
        model.addAttribute("mapsApiWebKey", MAPS_API_WEB_KEY);
        return PageDirectory.PRACTICES_ITEM;
    }

    @RequestMapping("new/form")
    public String getPracticeItemForm(Model model) {
        LOGGER.debug("retuning new practice form");
        model.addAttribute("practice", new PracticeVo());
        model.addAttribute("tradingDay", new TradingDayVo());
        model.addAttribute("mapsApiWebKey", MAPS_API_WEB_KEY);
        model.addAttribute("mapsApiServiceKey", MAPS_API_SERVICE_KEY);
        return PageDirectory.PRACTICES_FORM;
    }

    @RequestMapping("/{practiceId}/form")
    public String getPracticeItemForm(Model model, @PathVariable("practiceId") Long practiceId) {
        LOGGER.debug("retuning single practice form");
        if (!hasAnyPermission(PermissionEnum.PRACTICE_ITEM_UPDATE.getCustomPermission(practiceId),
                PermissionEnum.PRACTICE_OVERRIDE.name())) {
            return denyPermission(model);
        }
        model.addAttribute("practice", BindPractice.bindPractice(practiceService.getPractices(practiceId)));
        model.addAttribute("tradingDay", BindTradingDay.bindTradingDay(practiceService.getPractices(practiceId).getTradingDay()));
        model.addAttribute("mapsApiWebKey", MAPS_API_WEB_KEY);
        model.addAttribute("mapsApiServiceKey", MAPS_API_SERVICE_KEY);
        return PageDirectory.PRACTICES_FORM;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createPracticeItem(@ModelAttribute("practice") @Valid PracticeVo practiceVo, BindingResult errors, Model model, HttpServletResponse response,
                                     @RequestParam("imageFile") String imageFile) throws IOException {
        LOGGER.debug("create practice item");
        if (imageFile == null || imageFile.length() <= 22) {
            errors.addError(new FieldError("practice", "image", "must be entered"));
        }
        if (errors.hasErrors()) {
            model.addAttribute("practice", practiceVo);
            model.addAttribute("tradingDay", practiceVo.getTradingDay());
            model.addAttribute("mapsApiWebKey", MAPS_API_WEB_KEY);
            createErrorToast(model, response,  errors.getFieldErrors());
            return PageDirectory.PRACTICES_FORM;
        } else {
            byte[] bytes = Base64.decodeBase64(imageFile.substring(22).getBytes());
            PracticeDto practiceDto = practiceService.postPractices(BindPractice.bindPractice(practiceVo), bytes);
            return doRedirect("/practices/" + practiceDto.getPracticeId());
        }
    }

    @RequestMapping(value = "/{practiceId}", method = RequestMethod.POST)
    public String updatePracticeItem(@ModelAttribute("practice") @Valid PracticeVo practiceVo, BindingResult errors,HttpServletResponse response, Model model,
                                     @PathVariable("practiceId") Long practiceId,
                                     @RequestParam("imageFile") String imageFile) throws IOException {
        LOGGER.debug("edit practice item");
        if (errors.hasErrors()) {
            model.addAttribute("practice", practiceVo);
            model.addAttribute("tradingDay", practiceVo.getTradingDay());
            model.addAttribute("mapsApiWebKey", MAPS_API_WEB_KEY);
            createErrorToast(model,response,errors.getFieldErrors());
            return PageDirectory.PRACTICES_FORM;
        } else {
            byte[] bytes = (imageFile != null && imageFile.length() > 22) ? Base64.decodeBase64(imageFile.substring(22).getBytes()) : null;
            practiceService.putPractices(BindPractice.bindPractice(practiceVo), bytes);
            return doRedirect("/practices/" + practiceId);
        }
    }

}
