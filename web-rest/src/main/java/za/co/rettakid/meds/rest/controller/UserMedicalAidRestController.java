package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/userMedicalAids")
public class UserMedicalAidRestController {

    @Autowired
    private UserMedicalAidService userMedicalAidService;
    
    @RequestMapping(method = RequestMethod.GET)
    public UserMedicalAidListDto getUserMedicalAids()   {
        return userMedicalAidService.getUserMedicalAids();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public UserMedicalAidDto getUserMedicalAids(@PathVariable("id") Long id)   {
        return userMedicalAidService.getUserMedicalAids(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public UserMedicalAidDto postUserMedicalAids(@RequestBody UserMedicalAidDto userMedicalAidDto)   {
        return userMedicalAidService.postUserMedicalAids(userMedicalAidDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putUserMedicalAids(@PathVariable("id") Long id,@RequestBody UserMedicalAidDto userMedicalAidDto)   {
        userMedicalAidService.putUserMedicalAids(userMedicalAidDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteUserMedicalAids(@PathVariable("id") Long id)   {
        userMedicalAidService.deleteUserMedicalAids(id);
    }

}