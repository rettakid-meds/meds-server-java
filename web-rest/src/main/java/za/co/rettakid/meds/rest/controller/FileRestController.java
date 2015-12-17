package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/files")
public class FileRestController {

    @Autowired
    private FileService fileService;
    
    @RequestMapping(method = RequestMethod.GET)
    public FileListDto getFiles()   {
        return fileService.getFiles();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public FileDto getFiles(@PathVariable("id") Long id)   {
        return fileService.getFiles(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public FileDto postFiles(@RequestBody FileDto fileDto)   {
        return fileService.postFiles(fileDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putFiles(@PathVariable("id") Long id,@RequestBody FileDto fileDto)   {
        fileService.putFiles(fileDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteFiles(@PathVariable("id") Long id)   {
        fileService.deleteFiles(id);
    }

}