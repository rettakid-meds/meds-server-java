package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "devicestypedto")
public class DevicesTypeDto    {

    private Long devicesTypeId;
    private String typeName;
    private Boolean canPush;

    public Long getDevicesTypeId()   {
        return this.devicesTypeId;
    }

    @XmlElement(name = "devicestypeid" , required = false)
    public void setDevicesTypeId(Long devicesTypeId)   {
        this.devicesTypeId = devicesTypeId;
    }

    public String getTypeName()   {
        return this.typeName;
    }

    @XmlElement(name = "typename")
    public void setTypeName(String typeName)   {
        this.typeName = typeName;
    }

    public Boolean getCanPush()   {
        return this.canPush;
    }

    @XmlElement(name = "canpush")
    public void setCanPush(Boolean canPush)   {
        this.canPush = canPush;
    }

}