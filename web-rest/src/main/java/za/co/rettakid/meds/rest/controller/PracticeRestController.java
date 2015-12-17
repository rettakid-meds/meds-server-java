package za.co.rettakid.meds.rest.controller;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/practices")
public class PracticeRestController {

    @Autowired
    private PracticeService practiceService;
    
    @RequestMapping(method = RequestMethod.GET)
    public PracticeListDto getPractices()   {
        return practiceService.getPractices();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public PracticeDto getPractices(@PathVariable("id") Long id)   {
        return practiceService.getPractices(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public PracticeDto postPractices(@RequestBody PracticeDto practiceDto,@RequestParam("imageFile") String imageFile) throws IOException {
        byte[] bytes = (imageFile != null && imageFile.length() > 22) ? Base64.decodeBase64(imageFile.substring(22).getBytes()) : null;
        return practiceService.postPractices(practiceDto,bytes);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putPractices(@PathVariable("id") Long id,@RequestBody PracticeDto practiceDto,@RequestParam("imageFile") String imageFile) throws IOException {
        byte[] bytes = (imageFile != null && imageFile.length() > 22) ? Base64.decodeBase64(imageFile.substring(22).getBytes()) : null;
        practiceService.putPractices(practiceDto,bytes);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deletePractices(@PathVariable("id") Long id)   {
        practiceService.deletePractices(id);
    }

}