package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "userdevicelistdto")
public class UserDeviceListDto   {

    @XmlElementWrapper(name = "userdevices")
    @XmlElement(name = "userdevicedto",type = UserDeviceDto.class)
    private List<UserDeviceDto> userDevices = new ArrayList<UserDeviceDto>();

    public List<UserDeviceDto> getUserDeviceList()   {
        return this.userDevices;
    }

    public void addUserDeviceList(List<UserDeviceDto> userDevices)   {
        this.userDevices.addAll(userDevices);
    }
}