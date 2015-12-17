package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/doctorPractices")
public class DoctorPracticeRestController {

    @Autowired
    private DoctorPracticeService doctorPracticeService;
    
    @RequestMapping(method = RequestMethod.GET)
    public DoctorPracticeListDto getDoctorPractices()   {
        return doctorPracticeService.getDoctorPractices();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public DoctorPracticeDto getDoctorPractices(@PathVariable("id") Long id)   {
        return doctorPracticeService.getDoctorPractices(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public DoctorPracticeDto postDoctorPractices(@RequestBody DoctorPracticeDto doctorPracticeDto)   {
        return doctorPracticeService.postDoctorPractices(doctorPracticeDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putDoctorPractices(@PathVariable("id") Long id,@RequestBody DoctorPracticeDto doctorPracticeDto)   {
        doctorPracticeService.putDoctorPractices(doctorPracticeDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteDoctorPractices(@PathVariable("id") Long id)   {
        doctorPracticeService.deleteDoctorPractices(id);
    }

}