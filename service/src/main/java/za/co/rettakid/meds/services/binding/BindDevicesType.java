package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindDevicesType {

    public static DevicesTypeEntity bindDevicesType(DevicesTypeDto devicesTypeDto) {
        DevicesTypeEntity devicesTypeEntity = null;
        if (devicesTypeDto != null)    {
            devicesTypeEntity = new DevicesTypeEntity();
            devicesTypeEntity.setDevicesTypeId(devicesTypeDto.getDevicesTypeId());
            devicesTypeEntity.setTypeName(devicesTypeDto.getTypeName());
            devicesTypeEntity.setCanPush(devicesTypeDto.getCanPush());
        }
        return devicesTypeEntity;
    }

    public static DevicesTypeEntity bindDevicesType(DevicesTypeDto devicesTypeDto,DevicesTypeEntity devicesTypeEntity) {
        if (devicesTypeDto != null && devicesTypeEntity != null)    {
            devicesTypeEntity.setTypeName(devicesTypeDto.getTypeName());
            devicesTypeEntity.setCanPush(devicesTypeDto.getCanPush());
        }
        return devicesTypeEntity;
    }

    public static List<DevicesTypeEntity> bindDevicesTypeDtoList(List<DevicesTypeDto> devicesTypeDtos) {
    List<DevicesTypeEntity> devicesTypeEntities = new ArrayList<DevicesTypeEntity>();
        for (DevicesTypeDto devicesTypeDto : devicesTypeDtos) {
            devicesTypeEntities.add(bindDevicesType(devicesTypeDto));
        }
        return devicesTypeEntities;
    }

    public static DevicesTypeDto bindDevicesType(DevicesTypeEntity devicesTypeEntity) {
        DevicesTypeDto devicesTypeDto = null;
        if (devicesTypeEntity != null)    {
            devicesTypeDto = new DevicesTypeDto();
            devicesTypeDto.setDevicesTypeId(devicesTypeEntity.getDevicesTypeId());
            devicesTypeDto.setTypeName(devicesTypeEntity.getTypeName());
            devicesTypeDto.setCanPush(devicesTypeEntity.getCanPush());
        }
        return devicesTypeDto;
    }

    public static List<DevicesTypeDto> bindDevicesTypeEntityList(List<DevicesTypeEntity> devicesTypeEntitys) {
        List<DevicesTypeDto> devicesTypeDtos = new ArrayList<DevicesTypeDto>();
        if (devicesTypeEntitys != null)   {
            for (DevicesTypeEntity devicesTypeEntity : devicesTypeEntitys) {
                devicesTypeDtos.add(bindDevicesType(devicesTypeEntity));
            }
        }
        return devicesTypeDtos;
    }

}
