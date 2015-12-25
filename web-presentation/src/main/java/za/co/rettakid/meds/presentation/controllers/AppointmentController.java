package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.common.dto.AppointmentAvailability;
import za.co.rettakid.meds.common.dto.AppointmentDto;
import za.co.rettakid.meds.presentation.binding.BindAppointment;
import za.co.rettakid.meds.presentation.binding.BindDoctor;
import za.co.rettakid.meds.presentation.binding.BindUser;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.presentation.common.ScheduleCreator;
import za.co.rettakid.meds.presentation.vo.AppointmentVo;
import za.co.rettakid.meds.presentation.vo.DoctorVo;
import za.co.rettakid.meds.presentation.vo.ScheduleVo;
import za.co.rettakid.meds.services.AppointmentService;
import za.co.rettakid.meds.services.DoctorService;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by LWAZI8 on 13/11/2015.
 */
@Controller
@RequestMapping("/appointments")
public class AppointmentController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(AppointmentController.class);

    @Autowired
    private DoctorService doctorService;
    @Autowired
    private AppointmentService appointmentService;

    @RequestMapping(value = "/doctors/{doctorId}", method = RequestMethod.GET)
    public String getDoctorsAppointments(Model model, @PathVariable("doctorId") final Long doctorId,@RequestParam(value = "success",required = false) Boolean success) {
        LOGGER.debug("accessed doctor appointment page");
        if (success != null && success)    {
            createToast(model,"Appointment created");
        }
        List<List<ScheduleVo>> weekSchedule = new ArrayList<>();
        for (Date date : getUpcomingDates()) {
            weekSchedule.add(new ScheduleCreator() {
                @Override
                public AppointmentAvailability isOpen(Date startDate, Date endDate) {
                    return doctorService.isAvailable(doctorId, startDate, endDate);
                }
            }.getSchedule(date));
        }
        model.addAttribute("doctorId",doctorId);
        model.addAttribute("weekSchedule",weekSchedule);
        return PageDirectory.APPOINTMENTS;
    }

    @RequestMapping(value = "/doctors/new/form", method = RequestMethod.GET)
    public String getDoctorsAppointments(Model model, @RequestParam("expectedFrom") Date expectedFrom, @RequestParam("doctorId") Long doctorId) {
        LOGGER.debug("accessed doctor appointment form");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(expectedFrom);
        calendar.add(Calendar.MINUTE,30);

        AppointmentDto appointment = new AppointmentDto();
        appointment.setExpectedFrm(expectedFrom);
        appointment.setExpectedTo(calendar.getTime());
        appointment.setUser(getPrinciple());
        appointment.setDoctor(doctorService.getDoctors(doctorId));
        model.addAttribute("appointment",appointment);
        return PageDirectory.APPOINTMENTS_FORM;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String postAppointments(Model model, @ModelAttribute("appointment") @Valid AppointmentVo appointmentVo,BindingResult errors,HttpServletResponse response) {
        LOGGER.debug("post appointment");
        if (appointmentVo.getExpectedTo() == null || appointmentVo.getExpectedFrm() == null || !doctorService.isAvailable(appointmentVo.getDoctor().getDoctorId(),appointmentVo.getExpectedFrm(),appointmentVo.getExpectedTo()).getAvailable()) {
            errors.addError(new FieldError("appointment", "date", "is conflicting with another appointment"));
        }
        if (errors.hasErrors()) {
            appointmentVo.setDoctor(BindDoctor.bindDoctor(doctorService.getDoctors(appointmentVo.getDoctor().getDoctorId())));
            model.addAttribute("appointment",appointmentVo);
            createErrorToast(model,response,errors.getFieldErrors());
            return PageDirectory.APPOINTMENTS_FORM;
        } else  {
            appointmentService.postAppointments(BindAppointment.bindAppointment(appointmentVo));
            return PageDirectory.SUCCESS;
        }
    }

    private List<Date> getUpcomingDates() {
        List<Date> dates = new ArrayList<>(4);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        dates.add(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        dates.add(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        dates.add(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        dates.add(calendar.getTime());
        return dates;
    }


}
