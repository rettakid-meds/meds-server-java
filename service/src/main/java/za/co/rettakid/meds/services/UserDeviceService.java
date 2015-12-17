package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface UserDeviceService    {

    UserDeviceListDto getUserDevices();
    UserDeviceDto getUserDevices(Long userDevicesId);
    UserDeviceDto postUserDevices(UserDeviceDto userDeviceDto);
    void putUserDevices(UserDeviceDto userDeviceDto);
    void deleteUserDevices(Long userDevicesId);

}