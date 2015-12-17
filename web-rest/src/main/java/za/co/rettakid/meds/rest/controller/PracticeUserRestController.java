package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/practiceUsers")
public class PracticeUserRestController {

    @Autowired
    private PracticeUserService practiceUserService;
    
    @RequestMapping(method = RequestMethod.GET)
    public PracticeUserListDto getPracticeUsers()   {
        return practiceUserService.getPracticeUsers();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public PracticeUserDto getPracticeUsers(@PathVariable("id") Long id)   {
        return practiceUserService.getPracticeUsers(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public PracticeUserDto postPracticeUsers(@RequestBody PracticeUserDto practiceUserDto)   {
        return practiceUserService.postPracticeUsers(practiceUserDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putPracticeUsers(@PathVariable("id") Long id,@RequestBody PracticeUserDto practiceUserDto)   {
        practiceUserService.putPracticeUsers(practiceUserDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deletePracticeUsers(@PathVariable("id") Long id)   {
        practiceUserService.deletePracticeUsers(id);
    }

}