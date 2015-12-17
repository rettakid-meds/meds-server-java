package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.common.dto.AppointmentAvailability;
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
        LOGGER.info("accessed doctor appointment page");
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
        AppointmentVo appointmentVo = new AppointmentVo();
        DoctorVo doctorVo = BindDoctor.bindDoctor(doctorService.getDoctors(doctorId));
        doctorVo.setDoctorId(doctorId);
        appointmentVo.setDoctor(doctorVo);
        appointmentVo.setUser(BindUser.bindUser(getPrinciple()));
        model.addAttribute("appointment",appointmentVo);
        model.addAttribute("weekSchedule",weekSchedule);
        return PageDirectory.APPOINTMENTS;
    }

    @RequestMapping(value = "/doctors/addPossibleAppointment",method = RequestMethod.GET)
    public String checkDoctorAvailable(Model model,
                                       @RequestParam("doctorId") Long doctorId,
                                       @RequestParam("effTo") Date effTo)    {
        LOGGER.info("get next available time");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(effTo);
        calendar.add(Calendar.MINUTE,30);
        if (doctorService.isAvailable(doctorId,effTo,calendar.getTime()).getAvailable())   {
            model.addAttribute("effTo",calendar.getTime());
            model.addAttribute("effFrm",effTo);
            return PageDirectory.APPOINTMENTS_CARD_AVAILABLE;
        } else  {
            model.addAttribute("effTo",effTo);
            return PageDirectory.APPOINTMENTS_CARD_NOT_AVAILABLE;
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public String postAppointments(Model model, @ModelAttribute("appointment") @Valid AppointmentVo appointmentVo,BindingResult errors,HttpServletResponse response) {
        LOGGER.info("post appointment");
        if (errors.hasErrors()) {
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
