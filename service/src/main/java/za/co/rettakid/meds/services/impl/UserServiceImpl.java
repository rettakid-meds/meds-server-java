package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

@Service
public class UserServiceImpl implements UserService   {

    @Autowired
    private UserDao userDao;

    @Override
    public UserListDto getUsers()  {
        UserListDto userListDto = new UserListDto();
        userListDto.addUserList(BindUser.bindUserEntityList(userDao.read()));
        return userListDto;
    }
    
    @Override
    public UserDto getUsers(Long userId)  {
        return BindUser.bindUser(userDao.read(userId));
    }
    
    @Override
        public void postUsers(UserDto userDto)  {
        userDao.createOrUpdate(BindUser.bindUser(userDto));
    }

    @Override
    public void postUsers(UserListDto userListDto)  {
        for (UserDto userDto : userListDto.getUserList()) {
            userDao.createOrUpdate(BindUser.bindUser(userDto));
        }
    }

    @Override
    public void putUsers(UserDto userDto)  {
        userDao.createOrUpdate(BindUser.bindUser(userDto));
    }

    @Override
    public void deleteUsers(Long userId)  {
        userDao.delete(userDao.read(userId));
}

}