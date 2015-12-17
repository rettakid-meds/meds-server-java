package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;
import java.util.Date;

@Entity
@Audited
@Table(name = "MEDS_DOCTOR")
public class DoctorEntity    {

    private Long doctorId;
    private UserEntity user;
    private ImageEntity icon;
    private ImageEntity image;
    private TradingDayEntity tradingDay;
    private DataContentEntity bio;
    private Date effFrm;
    private Date effTo;
    private List<DoctorUserEntity> doctorUserDoctors;
    private List<DoctorFieldEntity> doctorFieldDoctors;
    private List<DoctorPracticeEntity> doctorPracticeDoctors;
    private List<ReviewEntity> reviewDoctors;
    private List<AppointmentEntity> appointmentDoctors;
    private List<PrescriptionEntity> prescriptionDoctors;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="DOCTOR_ID" , length=15 , nullable=false)
    public Long getDoctorId()   {
        return this.doctorId;
    }

    public void setDoctorId(Long doctorId)   {
        this.doctorId = doctorId;
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
    @JoinColumn(name="ICON_ID", referencedColumnName="IMAGE_ID")
    public ImageEntity getIcon()   {
        return this.icon;
    }

    public void setIcon(ImageEntity icon)   {
        this.icon = icon;
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
    @JoinColumn(name="TRADING_DAY_ID", referencedColumnName="TRADING_DAY_ID")
    public TradingDayEntity getTradingDay()   {
        return this.tradingDay;
    }

    public void setTradingDay(TradingDayEntity tradingDay)   {
        this.tradingDay = tradingDay;
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


    @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
    public List<DoctorUserEntity> getDoctorUserDoctors()   {
        return this.doctorUserDoctors;
    }

    public void setDoctorUserDoctors(List<DoctorUserEntity> doctorUserDoctors)   {
    this.doctorUserDoctors = doctorUserDoctors;
    }

    @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
    public List<DoctorFieldEntity> getDoctorFieldDoctors()   {
        return this.doctorFieldDoctors;
    }

    public void setDoctorFieldDoctors(List<DoctorFieldEntity> doctorFieldDoctors)   {
    this.doctorFieldDoctors = doctorFieldDoctors;
    }

    @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
    public List<DoctorPracticeEntity> getDoctorPracticeDoctors()   {
        return this.doctorPracticeDoctors;
    }

    public void setDoctorPracticeDoctors(List<DoctorPracticeEntity> doctorPracticeDoctors)   {
    this.doctorPracticeDoctors = doctorPracticeDoctors;
    }

    @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
    public List<ReviewEntity> getReviewDoctors()   {
        return this.reviewDoctors;
    }

    public void setReviewDoctors(List<ReviewEntity> reviewDoctors)   {
    this.reviewDoctors = reviewDoctors;
    }

    @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
    public List<AppointmentEntity> getAppointmentDoctors()   {
        return this.appointmentDoctors;
    }

    public void setAppointmentDoctors(List<AppointmentEntity> appointmentDoctors)   {
    this.appointmentDoctors = appointmentDoctors;
    }

    @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
    public List<PrescriptionEntity> getPrescriptionDoctors()   {
        return this.prescriptionDoctors;
    }

    public void setPrescriptionDoctors(List<PrescriptionEntity> prescriptionDoctors)   {
    this.prescriptionDoctors = prescriptionDoctors;
    }

}