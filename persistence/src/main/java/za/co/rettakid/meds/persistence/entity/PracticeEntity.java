package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;
import java.util.Date;

@Entity
@Audited
@Table(name = "MEDS_PRACTICE")
public class PracticeEntity    {

    private Long practiceId;
    private String name;
    private String email;
    private Float longitude;
    private Float latitude;
    private String address;
    private TradingDayEntity tradingDay;
    private String phone;
    private Float fee;
    private ImageEntity image;
    private DataContentEntity bio;
    private Date effFrm;
    private Date effTo;
    private List<PracticeUserEntity> practiceUserPractices;
    private List<PracticeFieldEntity> practiceFieldPractices;
    private List<PracticeMedicalAidEntity> practiceMedicalAidPractices;
    private List<DoctorPracticeEntity> doctorPracticePractices;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public TradingDayEntity getTradingDay()   {
        return this.tradingDay;
    }

    public void setTradingDay(TradingDayEntity tradingDay)   {
        this.tradingDay = tradingDay;
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
    public ImageEntity getImage()   {
        return this.image;
    }

    public void setImage(ImageEntity image)   {
        this.image = image;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIO_ID", referencedColumnName="DATA_CONTENT_ID")
    public DataContentEntity getBio()   {
        return this.bio;
    }

    public void setBio(DataContentEntity bio)   {
        this.bio = bio;
    }

    @Basic
    @Column(name="EFF_FRM" , length=0 , nullable=false)
    public Date getEffFrm()   {
        return this.effFrm;
    }

    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }

    @Basic
    @Column(name="EFF_TO" , length=0 , nullable=false)
    public Date getEffTo()   {
        return this.effTo;
    }

    public void setEffTo(Date effTo)   {
        this.effTo = effTo;
    }


    @OneToMany(mappedBy = "practice", fetch = FetchType.LAZY)
    public List<PracticeUserEntity> getPracticeUserPractices()   {
        return this.practiceUserPractices;
    }

    public void setPracticeUserPractices(List<PracticeUserEntity> practiceUserPractices)   {
    this.practiceUserPractices = practiceUserPractices;
    }

    @OneToMany(mappedBy = "practice", fetch = FetchType.LAZY)
    public List<PracticeFieldEntity> getPracticeFieldPractices()   {
        return this.practiceFieldPractices;
    }

    public void setPracticeFieldPractices(List<PracticeFieldEntity> practiceFieldPractices)   {
    this.practiceFieldPractices = practiceFieldPractices;
    }

    @OneToMany(mappedBy = "practice", fetch = FetchType.LAZY)
    public List<PracticeMedicalAidEntity> getPracticeMedicalAidPractices()   {
        return this.practiceMedicalAidPractices;
    }

    public void setPracticeMedicalAidPractices(List<PracticeMedicalAidEntity> practiceMedicalAidPractices)   {
    this.practiceMedicalAidPractices = practiceMedicalAidPractices;
    }

    @OneToMany(mappedBy = "practice", fetch = FetchType.LAZY)
    public List<DoctorPracticeEntity> getDoctorPracticePractices()   {
        return this.doctorPracticePractices;
    }

    public void setDoctorPracticePractices(List<DoctorPracticeEntity> doctorPracticePractices)   {
    this.doctorPracticePractices = doctorPracticePractices;
    }

}