package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface UserDeviceService    {

    UserDeviceListDto getUserDevices();
    UserDeviceDto getUserDevices(Long userDevicesId);
    void postUserDevices(UserDeviceDto userDeviceDto);
    void postUserDevices(UserDeviceListDto userDeviceListDto);
    void putUserDevices(UserDeviceDto userDeviceDto);
    void deleteUserDevices(Long userDevicesId);

}