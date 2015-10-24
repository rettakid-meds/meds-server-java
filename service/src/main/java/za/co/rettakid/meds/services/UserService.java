package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface UserService    {

    UserListDto getUsers();
    UserDto getUsers(Long userId);
    void postUsers(UserDto userDto);
    void postUsers(UserListDto userListDto);
    void putUsers(UserDto userDto);
    void deleteUsers(Long userId);

}