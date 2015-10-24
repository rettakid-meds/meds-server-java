package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_PRACTICE")
public class PracticeEntity    {

    private Long practiceId;
    private String name;
    private String email;
    private Float longitude;
    private Float latitude;
    private String address;
    private TradingDayEntity tradingDayEntity;
    private String phone;
    private Float fee;
    private ImageEntity imageEntity;
    private DataContentEntity bioEntity;


    @Id
    @GeneratedValue
    @Basic
    @Column(name="PRACTICE_ID" , length=15 , nullable=false)
    public Long getPracticeId()   {
        return this.practiceId;
    }

    public void setPracticeId(Long practiceId)   {
        this.practiceId = practiceId;
    }

    @Basic
    @Column(name="NAME" , length=50 , nullable=true)
    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

    @Basic
    @Column(name="EMAIL" , length=50 , nullable=false)
    public String getEmail()   {
        return this.email;
    }

    public void setEmail(String email)   {
        this.email = email;
    }

    @Basic
    @Column(name="LONGITUDE" , length=30 , nullable=false)
    public Float getLongitude()   {
        return this.longitude;
    }

    public void setLongitude(Float longitude)   {
        this.longitude = longitude;
    }

    @Basic
    @Column(name="LATITUDE" , length=30 , nullable=false)
    public Float getLatitude()   {
        return this.latitude;
    }

    public void setLatitude(Float latitude)   {
        this.latitude = latitude;
    }

    @Basic
    @Column(name="ADDRESS" , length=200 , nullable=false)
    public String getAddress()   {
        return this.address;
    }

    public void setAddress(String address)   {
        this.address = address;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TRADING_DAY_ID", referencedColumnName="TRADING_DAY_ID")
    public TradingDayEntity getTradingDayEntity()   {
        return this.tradingDayEntity;
    }

    public void setTradingDayEntity(TradingDayEntity tradingDayEntity)   {
        this.tradingDayEntity = tradingDayEntity;
    }

    @Basic
    @Column(name="PHONE" , length=20 , nullable=true)
    public String getPhone()   {
        return this.phone;
    }

    public void setPhone(String phone)   {
        this.phone = phone;
    }

    @Basic
    @Column(name="FEE" , length=30 , nullable=true)
    public Float getFee()   {
        return this.fee;
    }

    public void setFee(Float fee)   {
        this.fee = fee;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IMAGE_ID", referencedColumnName="IMAGE_ID")
    public ImageEntity getImageEntity()   {
        return this.imageEntity;
    }

    public void setImageEntity(ImageEntity imageEntity)   {
        this.imageEntity = imageEntity;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIO_ID", referencedColumnName="DATA_CONTENT_ID")
    public DataContentEntity getBioEntity()   {
        return this.bioEntity;
    }

    public void setBioEntity(DataContentEntity bioEntity)   {
        this.bioEntity = bioEntity;
    }

}