package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

@Service
public class UserDeviceServiceImpl implements UserDeviceService   {

    @Autowired
    private UserDeviceDao userDeviceDao;

    @Override
    public UserDeviceListDto getUserDevices()  {
        UserDeviceListDto userDeviceListDto = new UserDeviceListDto();
        userDeviceListDto.addUserDeviceList(BindUserDevice.bindUserDeviceEntityList(userDeviceDao.read()));
        return userDeviceListDto;
    }

    @Override
    public UserDeviceDto getUserDevices(Long userDevicesId)  {
        return BindUserDevice.bindUserDevice(userDeviceDao.read(userDevicesId));
    }
    
    @Override
    public void postUserDevices(UserDeviceDto userDeviceDto)  {
        userDeviceDao.createOrUpdate(BindUserDevice.bindUserDevice(userDeviceDto));
    }

    @Override
    public void putUserDevices(UserDeviceDto userDeviceDto)  {
        userDeviceDao.createOrUpdate(BindUserDevice.bindUserDevice(userDeviceDto));
    }

    @Override
    public void deleteUserDevices(Long userDevicesId)  {
        userDeviceDao.delete(userDeviceDao.read(userDevicesId));
}

}