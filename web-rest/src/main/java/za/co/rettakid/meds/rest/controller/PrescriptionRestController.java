package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionRestController {

    @Autowired
    private PrescriptionService prescriptionService;
    
    @RequestMapping(method = RequestMethod.GET)
    public PrescriptionListDto getPrescriptions()   {
        return prescriptionService.getPrescriptions();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public PrescriptionDto getPrescriptions(@PathVariable("id") Long id)   {
        return prescriptionService.getPrescriptions(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public PrescriptionDto postPrescriptions(@RequestBody PrescriptionDto prescriptionDto)   {
        return prescriptionService.postPrescriptions(prescriptionDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putPrescriptions(@PathVariable("id") Long id,@RequestBody PrescriptionDto prescriptionDto)   {
        prescriptionService.putPrescriptions(prescriptionDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deletePrescriptions(@PathVariable("id") Long id)   {
        prescriptionService.deletePrescriptions(id);
    }

}