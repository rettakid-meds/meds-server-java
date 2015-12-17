package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/practiceFields")
public class PracticeFieldRestController {

    @Autowired
    private PracticeFieldService practiceFieldService;
    
    @RequestMapping(method = RequestMethod.GET)
    public PracticeFieldListDto getPracticeFields()   {
        return practiceFieldService.getPracticeFields();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public PracticeFieldDto getPracticeFields(@PathVariable("id") Long id)   {
        return practiceFieldService.getPracticeFields(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public PracticeFieldDto postPracticeFields(@RequestBody PracticeFieldDto practiceFieldDto)   {
        return practiceFieldService.postPracticeFields(practiceFieldDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putPracticeFields(@PathVariable("id") Long id,@RequestBody PracticeFieldDto practiceFieldDto)   {
        practiceFieldService.putPracticeFields(practiceFieldDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deletePracticeFields(@PathVariable("id") Long id)   {
        practiceFieldService.deletePracticeFields(id);
    }

}