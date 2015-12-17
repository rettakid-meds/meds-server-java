package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class DevicesTypeVo    {

    private Long devicesTypeId;
    @NotBlank @NotNull
    private String typeName;
    @NotNull
    private Boolean canPush;

    public Long getDevicesTypeId()   {
        return this.devicesTypeId;
    }

    public void setDevicesTypeId(Long devicesTypeId)   {
        this.devicesTypeId = devicesTypeId;
    }

    public String getTypeName()   {
        return this.typeName;
    }

    public void setTypeName(String typeName)   {
        this.typeName = typeName;
    }

    public Boolean getCanPush()   {
        return this.canPush;
    }

    public void setCanPush(Boolean canPush)   {
        this.canPush = canPush;
    }

}