package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "userdevicedto")
public class UserDeviceDto    {

    private Long userDevicesId;
    private UserDto user;
    private DevicesTypeDto type;
    private String name;
    private String devicePushId;

    public Long getUserDevicesId()   {
        return this.userDevicesId;
    }

    @XmlElement(name = "userdevicesid" , required = false)
    public void setUserDevicesId(Long userDevicesId)   {
        this.userDevicesId = userDevicesId;
    }

    public UserDto getUser()   {
        return this.user;
    }

    @XmlElement(name = "userdto")
    public void setUser(UserDto user)   {
        this.user = user;
    }

    public DevicesTypeDto getType()   {
        return this.type;
    }

    @XmlElement(name = "typedto")
    public void setType(DevicesTypeDto type)   {
        this.type = type;
    }

    public String getName()   {
        return this.name;
    }

    @XmlElement(name = "name")
    public void setName(String name)   {
        this.name = name;
    }

    public String getDevicePushId()   {
        return this.devicePushId;
    }

    @XmlElement(name = "devicepushid")
    public void setDevicePushId(String devicePushId)   {
        this.devicePushId = devicePushId;
    }

}