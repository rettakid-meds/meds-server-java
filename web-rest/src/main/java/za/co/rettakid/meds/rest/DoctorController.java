package za.co.rettakid.meds.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.common.dto.DoctorDto;
import za.co.rettakid.meds.common.dto.DoctorListDto;
import za.co.rettakid.meds.common.dto.UserDto;
import za.co.rettakid.meds.services.DoctorService;

/**
 * Created by Lwazi Prusent on 2015/10/17.
 */
@RestController
@RequestMapping("/doctors")
public class DoctorController {

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
    public void postDoctors(@RequestBody DoctorDto doctorDto)   {
        doctorService.postDoctors(doctorDto);
    }

}
