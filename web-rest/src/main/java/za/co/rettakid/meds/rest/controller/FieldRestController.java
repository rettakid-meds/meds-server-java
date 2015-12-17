package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/fields")
public class FieldRestController {

    @Autowired
    private FieldService fieldService;
    
    @RequestMapping(method = RequestMethod.GET)
    public FieldListDto getFields()   {
        return fieldService.getFields();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public FieldDto getFields(@PathVariable("id") Long id)   {
        return fieldService.getFields(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public FieldDto postFields(@RequestBody FieldDto fieldDto)   {
        return fieldService.postFields(fieldDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putFields(@PathVariable("id") Long id,@RequestBody FieldDto fieldDto)   {
        fieldService.putFields(fieldDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteFields(@PathVariable("id") Long id)   {
        fieldService.deleteFields(id);
    }

}