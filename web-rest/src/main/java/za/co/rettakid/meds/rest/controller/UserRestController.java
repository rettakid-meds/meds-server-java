package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    private UserService userService;
    
    @RequestMapping(method = RequestMethod.GET)
    public UserListDto getUsers()   {
        return userService.getUsers();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public UserDto getUsers(@PathVariable("id") Long id)   {
        return userService.getUsers(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public UserDto postUsers(@RequestBody UserDto userDto)   {
        return userService.postUsers(userDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putUsers(@PathVariable("id") Long id,@RequestBody UserDto userDto)   {
        userService.putUsers(userDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteUsers(@PathVariable("id") Long id)   {
        userService.deleteUsers(id);
    }

}