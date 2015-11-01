package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindUserDevice {

    public static UserDeviceVo bindUserDevice(UserDeviceDto userDeviceDto) {
        UserDeviceVo userDeviceVo = null;
        if (userDeviceDto != null)    {
            userDeviceVo = new UserDeviceVo();
            userDeviceVo.setUserDevicesId(userDeviceDto.getUserDevicesId());
            userDeviceVo.setUser(BindUser.bindUser(userDeviceDto.getUser()));
            userDeviceVo.setType(BindDevicesType.bindDevicesType(userDeviceDto.getType()));
            userDeviceVo.setName(userDeviceDto.getName());
            userDeviceVo.setDevicePushId(userDeviceDto.getDevicePushId());
        }
        return userDeviceVo;
    }

    public static List<UserDeviceVo> bindUserDeviceDtoList(List<UserDeviceDto> userDeviceDtos) {
    List<UserDeviceVo> userDeviceEntities = new ArrayList<UserDeviceVo>();
        for (UserDeviceDto userDeviceDto : userDeviceDtos) {
            userDeviceEntities.add(bindUserDevice(userDeviceDto));
        }
        return userDeviceEntities;
    }

    public static UserDeviceDto bindUserDevice(UserDeviceVo userDeviceVo) {
        UserDeviceDto userDeviceDto = null;
        if (userDeviceVo != null)    {
            userDeviceDto = new UserDeviceDto();
            userDeviceDto.setUserDevicesId(userDeviceVo.getUserDevicesId());
            userDeviceDto.setUser(BindUser.bindUser(userDeviceVo.getUser()));
            userDeviceDto.setType(BindDevicesType.bindDevicesType(userDeviceVo.getType()));
            userDeviceDto.setName(userDeviceVo.getName());
            userDeviceDto.setDevicePushId(userDeviceVo.getDevicePushId());
        }
        return userDeviceDto;
    }

    public static List<UserDeviceDto> bindUserDeviceVoList(List<UserDeviceVo> userDeviceVos) {
        List<UserDeviceDto> userDeviceDtos = new ArrayList<UserDeviceDto>();
        for (UserDeviceVo userDeviceVo : userDeviceVos) {
            userDeviceDtos.add(bindUserDevice(userDeviceVo));
        }
        return userDeviceDtos;
    }

}
