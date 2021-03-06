package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindUserDevice {

    public static UserDeviceEntity bindUserDevice(UserDeviceDto userDeviceDto) {
        UserDeviceEntity userDeviceEntity = null;
        if (userDeviceDto != null)    {
            userDeviceEntity = new UserDeviceEntity();
            userDeviceEntity.setUserDevicesId(userDeviceDto.getUserDevicesId());
            userDeviceEntity.setUserEntity(BindUser.bindUser(userDeviceDto.getUser()));
            userDeviceEntity.setTypeEntity(BindDevicesType.bindDevicesType(userDeviceDto.getType()));
            userDeviceEntity.setName(userDeviceDto.getName());
            userDeviceEntity.setDevicePushId(userDeviceDto.getDevicePushId());
        }
        return userDeviceEntity;
    }

    public static List<UserDeviceEntity> bindUserDeviceDtoList(List<UserDeviceDto> userDeviceDtos) {
    List<UserDeviceEntity> userDeviceEntities = new ArrayList<UserDeviceEntity>();
        for (UserDeviceDto userDeviceDto : userDeviceDtos) {
            userDeviceEntities.add(bindUserDevice(userDeviceDto));
        }
        return userDeviceEntities;
    }

    public static UserDeviceDto bindUserDevice(UserDeviceEntity userDeviceEntity) {
        UserDeviceDto userDeviceDto = null;
        if (userDeviceEntity != null)    {
            userDeviceDto = new UserDeviceDto();
            userDeviceDto.setUserDevicesId(userDeviceEntity.getUserDevicesId());
            userDeviceDto.setUser(BindUser.bindUser(userDeviceEntity.getUserEntity()));
            userDeviceDto.setType(BindDevicesType.bindDevicesType(userDeviceEntity.getTypeEntity()));
            userDeviceDto.setName(userDeviceEntity.getName());
            userDeviceDto.setDevicePushId(userDeviceEntity.getDevicePushId());
        }
        return userDeviceDto;
    }

    public static List<UserDeviceDto> bindUserDeviceEntityList(List<UserDeviceEntity> userDeviceEntitys) {
        List<UserDeviceDto> userDeviceDtos = new ArrayList<UserDeviceDto>();
        for (UserDeviceEntity userDeviceEntity : userDeviceEntitys) {
            userDeviceDtos.add(bindUserDevice(userDeviceEntity));
        }
        return userDeviceDtos;
    }

}
