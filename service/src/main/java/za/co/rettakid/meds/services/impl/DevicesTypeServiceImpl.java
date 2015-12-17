package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
@Transactional
public class DevicesTypeServiceImpl implements DevicesTypeService   {

    @Autowired
    private DevicesTypeDao devicesTypeDao;

    @Override
    public DevicesTypeListDto getDevicesTypes()  {
        DevicesTypeListDto devicesTypeListDto = new DevicesTypeListDto();
        devicesTypeListDto.addDevicesTypeList(BindDevicesType.bindDevicesTypeEntityList(devicesTypeDao.read()));
        return devicesTypeListDto;
    }

    @Override
    public DevicesTypeDto getDevicesTypes(Long devicesTypeId)  {
        return BindDevicesType.bindDevicesType(devicesTypeDao.read(devicesTypeId));
    }
    
    @Override
    public DevicesTypeDto postDevicesTypes(DevicesTypeDto devicesTypeDto)  {
        DevicesTypeEntity devicesTypeEntity = BindDevicesType.bindDevicesType(devicesTypeDto);
        devicesTypeDao.createOrUpdate(devicesTypeEntity);
        return BindDevicesType.bindDevicesType(devicesTypeEntity);
}

    @Override
    public void putDevicesTypes(DevicesTypeDto devicesTypeDto)  {
        devicesTypeDao.createOrUpdate(BindDevicesType.bindDevicesType(devicesTypeDto));
    }

    @Override
    public void deleteDevicesTypes(Long devicesTypeId)  {
        devicesTypeDao.delete(devicesTypeDao.read(devicesTypeId));
    }

}