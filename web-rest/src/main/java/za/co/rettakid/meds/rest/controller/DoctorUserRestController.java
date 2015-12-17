package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/doctorUsers")
public class DoctorUserRestController {

    @Autowired
    private DoctorUserService doctorUserService;
    
    @RequestMapping(method = RequestMethod.GET)
    public DoctorUserListDto getDoctorUsers()   {
        return doctorUserService.getDoctorUsers();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public DoctorUserDto getDoctorUsers(@PathVariable("id") Long id)   {
        return doctorUserService.getDoctorUsers(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public DoctorUserDto postDoctorUsers(@RequestBody DoctorUserDto doctorUserDto)   {
        return doctorUserService.postDoctorUsers(doctorUserDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putDoctorUsers(@PathVariable("id") Long id,@RequestBody DoctorUserDto doctorUserDto)   {
        doctorUserService.putDoctorUsers(doctorUserDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteDoctorUsers(@PathVariable("id") Long id)   {
        doctorUserService.deleteDoctorUsers(id);
    }

}