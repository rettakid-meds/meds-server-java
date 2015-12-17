package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/prescriptionItems")
public class PrescriptionItemRestController {

    @Autowired
    private PrescriptionItemService prescriptionItemService;
    
    @RequestMapping(method = RequestMethod.GET)
    public PrescriptionItemListDto getPrescriptionItems()   {
        return prescriptionItemService.getPrescriptionItems();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public PrescriptionItemDto getPrescriptionItems(@PathVariable("id") Long id)   {
        return prescriptionItemService.getPrescriptionItems(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public PrescriptionItemDto postPrescriptionItems(@RequestBody PrescriptionItemDto prescriptionItemDto)   {
        return prescriptionItemService.postPrescriptionItems(prescriptionItemDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putPrescriptionItems(@PathVariable("id") Long id,@RequestBody PrescriptionItemDto prescriptionItemDto)   {
        prescriptionItemService.putPrescriptionItems(prescriptionItemDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deletePrescriptionItems(@PathVariable("id") Long id)   {
        prescriptionItemService.deletePrescriptionItems(id);
    }

}