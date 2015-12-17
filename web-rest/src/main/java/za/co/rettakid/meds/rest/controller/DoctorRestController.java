package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/doctors")
public class DoctorRestController {

    @Autowired
    private DoctorService doctorService;
    
    @RequestMapping(method = RequestMethod.GET)
    public DoctorListDto getDoctors()   {
        return doctorService.getDoctors();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public DoctorDto getDoctors(@PathVariable("id") Long id)   {
        return doctorService.getDoctors(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public DoctorDto postDoctors(@RequestBody DoctorDto doctorDto)   {
        return doctorService.postDoctors(doctorDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putDoctors(@PathVariable("id") Long id,@RequestBody DoctorDto doctorDto)   {
        doctorService.putDoctors(doctorDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteDoctors(@PathVariable("id") Long id)   {
        doctorService.deleteDoctors(id);
    }

}