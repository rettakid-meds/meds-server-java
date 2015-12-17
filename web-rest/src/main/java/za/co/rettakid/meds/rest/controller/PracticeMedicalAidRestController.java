package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/practiceMedicalAids")
public class PracticeMedicalAidRestController {

    @Autowired
    private PracticeMedicalAidService practiceMedicalAidService;
    
    @RequestMapping(method = RequestMethod.GET)
    public PracticeMedicalAidListDto getPracticeMedicalAids()   {
        return practiceMedicalAidService.getPracticeMedicalAids();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public PracticeMedicalAidDto getPracticeMedicalAids(@PathVariable("id") Long id)   {
        return practiceMedicalAidService.getPracticeMedicalAids(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public PracticeMedicalAidDto postPracticeMedicalAids(@RequestBody PracticeMedicalAidDto practiceMedicalAidDto)   {
        return practiceMedicalAidService.postPracticeMedicalAids(practiceMedicalAidDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putPracticeMedicalAids(@PathVariable("id") Long id,@RequestBody PracticeMedicalAidDto practiceMedicalAidDto)   {
        practiceMedicalAidService.putPracticeMedicalAids(practiceMedicalAidDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deletePracticeMedicalAids(@PathVariable("id") Long id)   {
        practiceMedicalAidService.deletePracticeMedicalAids(id);
    }

}