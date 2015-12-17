package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import za.co.rettakid.meds.common.dto.AppointmentAvailability;
import za.co.rettakid.meds.common.dto.DoctorDto;
import za.co.rettakid.meds.presentation.common.ListDivider;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.presentation.common.ScheduleCreator;
import za.co.rettakid.meds.presentation.vo.ScheduleVo;
import za.co.rettakid.meds.services.DoctorService;
import za.co.rettakid.meds.services.TradingDayService;

import java.security.Principal;
import java.util.Date;
import java.util.List;

/**
 * Created by LWAZI8 on 05/11/2015.
 */
@Controller
@RequestMapping("/doctors")
public class DoctorController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(DoctorController.class);

    @Autowired
    private DoctorService doctorService;

    @RequestMapping(method = RequestMethod.GET)
    public String getDoctors(Model model)  {
        LOGGER.info("accessed doctor page");
        ListDivider<DoctorDto> listDivider = new ListDivider<>();
        List<List<DoctorDto>> doctors = listDivider.divideList(doctorService.getDoctors().getDoctorList(),3);
        model.addAttribute("doctors", doctors);
        return PageDirectory.DOCTORS;
    }

    @RequestMapping("/{doctorId}")
    public String getDoctorItem(Model model,@PathVariable("doctorId") Long doctorId) {
        LOGGER.info("retuning single practice item");
        final DoctorDto doctorDto = doctorService.getDoctors(doctorId);
        model.addAttribute("doctor", doctorDto);
        model.addAttribute("tradingDay", doctorDto.getTradingDay());
        List<ScheduleVo> scheduleVos = new ScheduleCreator() {
            @Override
            public AppointmentAvailability isOpen(Date startDate, Date endDate) {
                return doctorService.isAvailable(doctorDto.getTradingDay().getTradingDayId(),startDate,endDate);
            }
        }.getSchedule(new Date());
        List<List<ScheduleVo>> schedule = new ListDivider<ScheduleVo>().divideList(scheduleVos, 4);
        model.addAttribute("schedule",schedule);
        return PageDirectory.DOCTORS_ITEM;
    }

}
