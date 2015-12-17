package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/images")
public class ImageRestController {

    @Autowired
    private ImageService imageService;
    
    @RequestMapping(method = RequestMethod.GET)
    public ImageListDto getImages()   {
        return imageService.getImages();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ImageDto getImages(@PathVariable("id") Long id)   {
        return imageService.getImages(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ImageDto postImages(@RequestBody ImageDto imageDto)   {
        return imageService.postImages(imageDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putImages(@PathVariable("id") Long id,@RequestBody ImageDto imageDto)   {
        imageService.putImages(imageDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteImages(@PathVariable("id") Long id)   {
        imageService.deleteImages(id);
    }

}