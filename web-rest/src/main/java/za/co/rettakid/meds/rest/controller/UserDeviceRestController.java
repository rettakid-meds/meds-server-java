package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/userDevices")
public class UserDeviceRestController {

    @Autowired
    private UserDeviceService userDeviceService;
    
    @RequestMapping(method = RequestMethod.GET)
    public UserDeviceListDto getUserDevices()   {
        return userDeviceService.getUserDevices();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public UserDeviceDto getUserDevices(@PathVariable("id") Long id)   {
        return userDeviceService.getUserDevices(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public UserDeviceDto postUserDevices(@RequestBody UserDeviceDto userDeviceDto)   {
        return userDeviceService.postUserDevices(userDeviceDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putUserDevices(@PathVariable("id") Long id,@RequestBody UserDeviceDto userDeviceDto)   {
        userDeviceService.putUserDevices(userDeviceDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteUserDevices(@PathVariable("id") Long id)   {
        userDeviceService.deleteUserDevices(id);
    }

}