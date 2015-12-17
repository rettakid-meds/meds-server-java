package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import za.co.rettakid.meds.common.dto.AppointmentAvailability;
import za.co.rettakid.meds.common.dto.DoctorDto;
import za.co.rettakid.meds.common.enums.PermissionEnum;
import za.co.rettakid.meds.presentation.common.ListDivider;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.presentation.common.ScheduleCreator;
import za.co.rettakid.meds.presentation.vo.ScheduleVo;
import za.co.rettakid.meds.services.AppointmentService;
import za.co.rettakid.meds.services.DoctorService;
import za.co.rettakid.meds.services.DoctorUserService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by LWAZI8 on 11/11/2015.
 */
@Controller
@RequestMapping("/schedules")
public class ScheduleController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(ScheduleController.class);

    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private DoctorUserService doctorUserService;
    @Autowired
    private DoctorService doctorService;

    @RequestMapping
    public String getSchedulePage(Model model) {
        LOGGER.info("accessed schedule page");
        List<DoctorDto> doctorDtos = doctorUserService.getDoctors(getPrinciple().getUserId()).getDoctorList();
        if (doctorDtos == null || doctorDtos.isEmpty()) {
            model.addAttribute("doctors", new ArrayList<>());
            return PageDirectory.SCHEDULE_DOCTOR_LIST;
        } else if (doctorDtos.size() == 1)  {
            return getScheduledDoctorPage(model,doctorDtos.get(0).getDoctorId(),new Date());
        } else  {
            model.addAttribute("doctors", doctorDtos);
            return PageDirectory.SCHEDULE_DOCTOR_LIST;
        }
    }

    @RequestMapping(value = "/{doctorId}")
    public String getScheduledDoctorPage(Model model, @PathVariable("doctorId") final Long doctorId, @RequestParam("date") Date date) {
        LOGGER.info("accessed schedule doctor page");
        if (!hasAnyPermission(PermissionEnum.DOCTOR_ITEM_UPDATE.getCustomPermission(doctorId),
                PermissionEnum.DOCTOR_OVERRIDE.name())) {
            return denyPermission(model);
        }
        List<ScheduleVo> fullDaySchedule = new ScheduleCreator(){
            @Override
            public AppointmentAvailability isOpen(Date startDate, Date endDate) {
                return doctorService.isAvailable(doctorId, startDate, endDate);
            }
        }.getSchedule(date);
        List<List<ScheduleVo>> hourGroupedSchedule = new ArrayList<>();
        for (int i = 0; i < fullDaySchedule.size(); i+=2) {
            List<ScheduleVo> hourScheduleVos = new ArrayList<>();
            for (int j = 0; j <= 1; j++) {
                hourScheduleVos.add(fullDaySchedule.get(i+j));
            }
            hourGroupedSchedule.add(hourScheduleVos);
        }
        model.addAttribute("schedule", hourGroupedSchedule);
        DoctorDto doctorDto = doctorService.getDoctors(doctorId);
        model.addAttribute("doctor", doctorDto);
        return PageDirectory.SCHEDULE;
    }

}
