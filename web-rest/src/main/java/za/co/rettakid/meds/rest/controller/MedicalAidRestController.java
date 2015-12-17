package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/medicalAids")
public class MedicalAidRestController {

    @Autowired
    private MedicalAidService medicalAidService;
    
    @RequestMapping(method = RequestMethod.GET)
    public MedicalAidListDto getMedicalAids()   {
        return medicalAidService.getMedicalAids();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public MedicalAidDto getMedicalAids(@PathVariable("id") Long id)   {
        return medicalAidService.getMedicalAids(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public MedicalAidDto postMedicalAids(@RequestBody MedicalAidDto medicalAidDto)   {
        return medicalAidService.postMedicalAids(medicalAidDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putMedicalAids(@PathVariable("id") Long id,@RequestBody MedicalAidDto medicalAidDto)   {
        medicalAidService.putMedicalAids(medicalAidDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteMedicalAids(@PathVariable("id") Long id)   {
        medicalAidService.deleteMedicalAids(id);
    }

}