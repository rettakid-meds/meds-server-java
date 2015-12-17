package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/dataContents")
public class DataContentRestController {

    @Autowired
    private DataContentService dataContentService;
    
    @RequestMapping(method = RequestMethod.GET)
    public DataContentListDto getDataContents()   {
        return dataContentService.getDataContents();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public DataContentDto getDataContents(@PathVariable("id") Long id)   {
        return dataContentService.getDataContents(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public DataContentDto postDataContents(@RequestBody DataContentDto dataContentDto)   {
        return dataContentService.postDataContents(dataContentDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putDataContents(@PathVariable("id") Long id,@RequestBody DataContentDto dataContentDto)   {
        dataContentService.putDataContents(dataContentDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteDataContents(@PathVariable("id") Long id)   {
        dataContentService.deleteDataContents(id);
    }

}