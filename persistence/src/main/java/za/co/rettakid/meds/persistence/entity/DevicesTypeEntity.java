package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "MEDS_DEVICES_TYPE")
public class DevicesTypeEntity    {

    private Long devicesTypeId;
    private String typeName;
    private Boolean canPush;
    private List<UserDeviceEntity> userDeviceTypes;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name="CAN_PUSH" , length=0 , nullable=false)
    public Boolean getCanPush()   {
        return this.canPush;
    }

    public void setCanPush(Boolean canPush)   {
        this.canPush = canPush;
    }


    @OneToMany(mappedBy = "type", fetch = FetchType.LAZY)
    public List<UserDeviceEntity> getUserDeviceTypes()   {
        return this.userDeviceTypes;
    }

    public void setUserDeviceTypes(List<UserDeviceEntity> userDeviceTypes)   {
    this.userDeviceTypes = userDeviceTypes;
    }

}