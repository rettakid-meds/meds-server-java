package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/appointments")
public class AppointmentRestController {

    @Autowired
    private AppointmentService appointmentService;
    
    @RequestMapping(method = RequestMethod.GET)
    public AppointmentListDto getAppointments()   {
        return appointmentService.getAppointments();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public AppointmentDto getAppointments(@PathVariable("id") Long id)   {
        return appointmentService.getAppointments(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public AppointmentDto postAppointments(@RequestBody AppointmentDto appointmentDto)   {
        return appointmentService.postAppointments(appointmentDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putAppointments(@PathVariable("id") Long id,@RequestBody AppointmentDto appointmentDto)   {
        appointmentService.putAppointments(appointmentDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteAppointments(@PathVariable("id") Long id)   {
        appointmentService.deleteAppointments(id);
    }

}