package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface DevicesTypeService    {

    DevicesTypeListDto getDevicesTypes();
    DevicesTypeDto getDevicesTypes(Long devicesTypeId);
    void postDevicesTypes(DevicesTypeDto devicesTypeDto);
    void postDevicesTypes(DevicesTypeListDto devicesTypeListDto);
    void putDevicesTypes(DevicesTypeDto devicesTypeDto);
    void deleteDevicesTypes(Long devicesTypeId);

}