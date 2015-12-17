package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class UserDeviceVo    {

    private Long userDevicesId;
    @Valid
    @NotNull
    private UserVo user;
    @Valid
    @NotNull
    private DevicesTypeVo type;
    @NotBlank @NotNull
    private String name;
    @NotBlank @NotNull
    private String devicePushId;

    public Long getUserDevicesId()   {
        return this.userDevicesId;
    }

    public void setUserDevicesId(Long userDevicesId)   {
        this.userDevicesId = userDevicesId;
    }

    public UserVo getUser()   {
        return this.user;
    }

    public void setUser(UserVo user)   {
        this.user = user;
    }

    public DevicesTypeVo getType()   {
        return this.type;
    }

    public void setType(DevicesTypeVo type)   {
        this.type = type;
    }

    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

    public String getDevicePushId()   {
        return this.devicePushId;
    }

    public void setDevicePushId(String devicePushId)   {
        this.devicePushId = devicePushId;
    }

}