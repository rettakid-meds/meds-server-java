package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_USER_DEVICE")
public class UserDeviceEntity    {

    private Long userDevicesId;
    private UserEntity user;
    private DevicesTypeEntity type;
    private String name;
    private String devicePushId;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="USER_DEVICES_ID" , length=15 , nullable=false)
    public Long getUserDevicesId()   {
        return this.userDevicesId;
    }

    public void setUserDevicesId(Long userDevicesId)   {
        this.userDevicesId = userDevicesId;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USER_ID", referencedColumnName="USER_ID")
    public UserEntity getUser()   {
        return this.user;
    }

    public void setUser(UserEntity user)   {
        this.user = user;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TYPE_ID", referencedColumnName="DEVICES_TYPE_ID")
    public DevicesTypeEntity getType()   {
        return this.type;
    }

    public void setType(DevicesTypeEntity type)   {
        this.type = type;
    }

    @Basic
    @Column(name="NAME" , length=50 , nullable=false)
    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

    @Basic
    @Column(name="DEVICE_PUSH_ID" , length=50 , nullable=false)
    public String getDevicePushId()   {
        return this.devicePushId;
    }

    public void setDevicePushId(String devicePushId)   {
        this.devicePushId = devicePushId;
    }

}