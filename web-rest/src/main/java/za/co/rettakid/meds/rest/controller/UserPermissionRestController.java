package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/userPermissions")
public class UserPermissionRestController {

    @Autowired
    private UserPermissionService userPermissionService;
    
    @RequestMapping(method = RequestMethod.GET)
    public UserPermissionListDto getUserPermissions()   {
        return userPermissionService.getUserPermissions();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public UserPermissionDto getUserPermissions(@PathVariable("id") Long id)   {
        return userPermissionService.getUserPermissions(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public UserPermissionDto postUserPermissions(@RequestBody UserPermissionDto userPermissionDto)   {
        return userPermissionService.postUserPermissions(userPermissionDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putUserPermissions(@PathVariable("id") Long id,@RequestBody UserPermissionDto userPermissionDto)   {
        userPermissionService.putUserPermissions(userPermissionDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteUserPermissions(@PathVariable("id") Long id)   {
        userPermissionService.deleteUserPermissions(id);
    }

}