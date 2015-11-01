package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindDevicesType {

    public static DevicesTypeVo bindDevicesType(DevicesTypeDto devicesTypeDto) {
        DevicesTypeVo devicesTypeVo = null;
        if (devicesTypeDto != null)    {
            devicesTypeVo = new DevicesTypeVo();
            devicesTypeVo.setDevicesTypeId(devicesTypeDto.getDevicesTypeId());
            devicesTypeVo.setTypeName(devicesTypeDto.getTypeName());
            devicesTypeVo.setCanPush(devicesTypeDto.getCanPush());
        }
        return devicesTypeVo;
    }

    public static List<DevicesTypeVo> bindDevicesTypeDtoList(List<DevicesTypeDto> devicesTypeDtos) {
    List<DevicesTypeVo> devicesTypeEntities = new ArrayList<DevicesTypeVo>();
        for (DevicesTypeDto devicesTypeDto : devicesTypeDtos) {
            devicesTypeEntities.add(bindDevicesType(devicesTypeDto));
        }
        return devicesTypeEntities;
    }

    public static DevicesTypeDto bindDevicesType(DevicesTypeVo devicesTypeVo) {
        DevicesTypeDto devicesTypeDto = null;
        if (devicesTypeVo != null)    {
            devicesTypeDto = new DevicesTypeDto();
            devicesTypeDto.setDevicesTypeId(devicesTypeVo.getDevicesTypeId());
            devicesTypeDto.setTypeName(devicesTypeVo.getTypeName());
            devicesTypeDto.setCanPush(devicesTypeVo.getCanPush());
        }
        return devicesTypeDto;
    }

    public static List<DevicesTypeDto> bindDevicesTypeVoList(List<DevicesTypeVo> devicesTypeVos) {
        List<DevicesTypeDto> devicesTypeDtos = new ArrayList<DevicesTypeDto>();
        for (DevicesTypeVo devicesTypeVo : devicesTypeVos) {
            devicesTypeDtos.add(bindDevicesType(devicesTypeVo));
        }
        return devicesTypeDtos;
    }

}
