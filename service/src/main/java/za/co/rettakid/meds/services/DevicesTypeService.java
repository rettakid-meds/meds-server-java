package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface DevicesTypeService    {

    DevicesTypeListDto getDevicesTypes();
    DevicesTypeDto getDevicesTypes(Long devicesTypeId);
    DevicesTypeDto postDevicesTypes(DevicesTypeDto devicesTypeDto);
    void putDevicesTypes(DevicesTypeDto devicesTypeDto);
    void deleteDevicesTypes(Long devicesTypeId);

}