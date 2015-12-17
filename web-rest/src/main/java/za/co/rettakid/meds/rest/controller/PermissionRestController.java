package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/permissions")
public class PermissionRestController {

    @Autowired
    private PermissionService permissionService;
    
    @RequestMapping(method = RequestMethod.GET)
    public PermissionListDto getPermissions()   {
        return permissionService.getPermissions();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public PermissionDto getPermissions(@PathVariable("id") Long id)   {
        return permissionService.getPermissions(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public PermissionDto postPermissions(@RequestBody PermissionDto permissionDto)   {
        return permissionService.postPermissions(permissionDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putPermissions(@PathVariable("id") Long id,@RequestBody PermissionDto permissionDto)   {
        permissionService.putPermissions(permissionDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deletePermissions(@PathVariable("id") Long id)   {
        permissionService.deletePermissions(id);
    }

}