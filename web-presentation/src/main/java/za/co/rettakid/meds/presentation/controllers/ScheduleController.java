package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.common.dto.AppointmentAvailability;
import za.co.rettakid.meds.common.dto.AppointmentDto;
import za.co.rettakid.meds.common.dto.DoctorDto;
import za.co.rettakid.meds.common.dto.UserDto;
import za.co.rettakid.meds.common.enums.PermissionEnum;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.presentation.common.ScheduleCreator;
import za.co.rettakid.meds.presentation.vo.AppointmentVo;
import za.co.rettakid.meds.presentation.vo.ScheduleVo;
import za.co.rettakid.meds.services.AppointmentService;
import za.co.rettakid.meds.services.DoctorService;
import za.co.rettakid.meds.services.DoctorUserService;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
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
        LOGGER.debug("accessed schedule page");
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

    @RequestMapping(value = "/{appointmentId}")
    public String getSchedulePage(Model model,@PathVariable("appointmentId") Long appointmentId) {
        LOGGER.debug("accessed schedule form");
        AppointmentDto appointment = appointmentService.getAppointments(appointmentId);
        if (!hasAnyPermission(PermissionEnum.DOCTOR_SCHEDULE_ITEM_READ.getCustomPermission(appointment.getDoctor().getDoctorId()),
                PermissionEnum.DOCTOR_SCHEDULE_OVERRIDE.name())) {
            return denyPermission(model);
        }
        model.addAttribute("user",appointment.getUser());
        model.addAttribute("appointment",appointment);
        model.addAttribute("pastAppointments",appointmentService.getAppointments(appointment.getUser().getUserId(),appointment.getDoctor().getDoctorId()).getAppointmentList());
        return PageDirectory.SCHEDULE_ITEM;
    }

    @RequestMapping(value = "/new")
    public String getNewSchedulePage(Model model,@RequestParam("doctorId") Long doctorId,@RequestParam("expectedFrm") Date expectedFrm,@RequestParam("expectedTo") Date expectedTo) {
        LOGGER.debug("accessed new schedule form");
        if (!hasAnyPermission(PermissionEnum.DOCTOR_SCHEDULE_ITEM_READ.getCustomPermission(doctorId),
                PermissionEnum.DOCTOR_SCHEDULE_OVERRIDE.name())) {
            return denyPermission(model);
        }
        AppointmentDto appointment = new AppointmentDto();
        appointment.setExpectedFrm(expectedFrm);
        appointment.setExpectedTo(expectedTo);
        appointment.setDoctor(doctorService.getDoctors(doctorId));
        model.addAttribute("user",new UserDto());
        model.addAttribute("appointment",appointment);
        model.addAttribute("pastAppointments",new ArrayList<>());
        return PageDirectory.SCHEDULE_ITEM;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String postSchedulePage(Model model, @ModelAttribute("appointment") @Valid AppointmentVo appointment, BindingResult errors, HttpServletResponse response) {
        LOGGER.debug("post schedule form");
        if (!hasAnyPermission(PermissionEnum.DOCTOR_SCHEDULE_ITEM_ADD.getCustomPermission(appointment.getDoctor().getDoctorId()),PermissionEnum.DOCTOR_SCHEDULE_OVERRIDE.name())
                && appointmentService.hasOwnership(appointment.getAppointmentId(),getPrinciple().getUserId())) {
            return denyPermission(model);
        }
        return PageDirectory.SCHEDULE_ITEM;
    }

    @RequestMapping(value = "/{appointmentId}",method = RequestMethod.POST)
    public String putSchedulePage(@PathVariable("appointmentId") Long appointmentId, Model model, @ModelAttribute("appointment") @Valid AppointmentVo appointment, BindingResult errors, HttpServletResponse response) {
        LOGGER.debug("put schedule form");
        if (!hasAnyPermission(PermissionEnum.DOCTOR_SCHEDULE_ITEM_ADD.getCustomPermission(appointment.getDoctor().getDoctorId()),PermissionEnum.DOCTOR_SCHEDULE_OVERRIDE.name())
                && appointmentService.hasOwnership(appointment.getAppointmentId(),getPrinciple().getUserId())) {
            return denyPermission(model);
        }
        if (errors.hasErrors()) {
            model.addAttribute("appointment",appointment);
            createErrorToast(model,response,errors.getFieldErrors());
            return PageDirectory.SCHEDULE_ITEM;
        } else  {
            model.addAttribute("appointment",appointment);
            createToast(model,"Appointment updated");
            return PageDirectory.SCHEDULE_ITEM;
        }
    }

    @RequestMapping(value = "/doctor/{doctorId}")
    public String getScheduledDoctorPage(Model model, @PathVariable("doctorId") final Long doctorId, @RequestParam("date") Date date) {
        LOGGER.debug("accessed schedule doctor page");
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
