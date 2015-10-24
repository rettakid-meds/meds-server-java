package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_DEVICES_TYPE")
public class DevicesTypeEntity    {

    private Long devicesTypeId;
    private String typeName;
    private Boolean canPush;


    @Id
    @GeneratedValue
    @Basic
    @Column(name="DEVICES_TYPE_ID" , length=15 , nullable=false)
    public Long getDevicesTypeId()   {
        return this.devicesTypeId;
    }

    public void setDevicesTypeId(Long devicesTypeId)   {
        this.devicesTypeId = devicesTypeId;
    }

    @Basic
    @Column(name="TYPE_NAME" , length=50 , nullable=false)
    public String getTypeName()   {
        return this.typeName;
    }

    public void setTypeName(String typeName)   {
        this.typeName = typeName;
    }

    @Basic
    @Column(name="CAN_PUSH" , nullable=false)
    public Boolean getCanPush()   {
        return this.canPush;
    }

    public void setCanPush(Boolean canPush)   {
        this.canPush = canPush;
    }

}