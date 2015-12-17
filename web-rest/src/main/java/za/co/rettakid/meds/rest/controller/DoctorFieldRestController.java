package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/doctorFields")
public class DoctorFieldRestController {

    @Autowired
    private DoctorFieldService doctorFieldService;
    
    @RequestMapping(method = RequestMethod.GET)
    public DoctorFieldListDto getDoctorFields()   {
        return doctorFieldService.getDoctorFields();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public DoctorFieldDto getDoctorFields(@PathVariable("id") Long id)   {
        return doctorFieldService.getDoctorFields(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public DoctorFieldDto postDoctorFields(@RequestBody DoctorFieldDto doctorFieldDto)   {
        return doctorFieldService.postDoctorFields(doctorFieldDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putDoctorFields(@PathVariable("id") Long id,@RequestBody DoctorFieldDto doctorFieldDto)   {
        doctorFieldService.putDoctorFields(doctorFieldDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteDoctorFields(@PathVariable("id") Long id)   {
        doctorFieldService.deleteDoctorFields(id);
    }

}