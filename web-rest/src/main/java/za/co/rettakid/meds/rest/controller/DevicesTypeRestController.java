package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/devicesTypes")
public class DevicesTypeRestController {

    @Autowired
    private DevicesTypeService devicesTypeService;
    
    @RequestMapping(method = RequestMethod.GET)
    public DevicesTypeListDto getDevicesTypes()   {
        return devicesTypeService.getDevicesTypes();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public DevicesTypeDto getDevicesTypes(@PathVariable("id") Long id)   {
        return devicesTypeService.getDevicesTypes(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public DevicesTypeDto postDevicesTypes(@RequestBody DevicesTypeDto devicesTypeDto)   {
        return devicesTypeService.postDevicesTypes(devicesTypeDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putDevicesTypes(@PathVariable("id") Long id,@RequestBody DevicesTypeDto devicesTypeDto)   {
        devicesTypeService.putDevicesTypes(devicesTypeDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteDevicesTypes(@PathVariable("id") Long id)   {
        devicesTypeService.deleteDevicesTypes(id);
    }

}