package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

@XmlRootElement(name = "doctordto")
public class DoctorDto    {

    private Long doctorId;
    private UserDto user;
    private ImageDto icon;
    private ImageDto image;
    private TradingDayDto tradingDay;
    private DataContentDto bio;
    private Date effFrm;
    private Date effTo;
    private DoctorUserListDto doctorUserDoctors;
    private DoctorFieldListDto doctorFieldDoctors;
    private DoctorPracticeListDto doctorPracticeDoctors;
    private AppointmentListDto appointmentDoctors;
    private PrescriptionListDto prescriptionDoctors;

    public Long getDoctorId()   {
        return this.doctorId;
    }

    @XmlElement(name = "doctorid" , required = false)
    public void setDoctorId(Long doctorId)   {
        this.doctorId = doctorId;
    }

    public UserDto getUser()   {
        return this.user;
    }

    @XmlElement(name = "userdto")
    public void setUser(UserDto user)   {
        this.user = user;
    }

    public ImageDto getIcon()   {
        return this.icon;
    }

    @XmlElement(name = "icondto")
    public void setIcon(ImageDto icon)   {
        this.icon = icon;
    }

    public ImageDto getImage()   {
        return this.image;
    }

    @XmlElement(name = "imagedto")
    public void setImage(ImageDto image)   {
        this.image = image;
    }

    public TradingDayDto getTradingDay()   {
        return this.tradingDay;
    }

    @XmlElement(name = "tradingdaydto")
    public void setTradingDay(TradingDayDto tradingDay)   {
        this.tradingDay = tradingDay;
    }

    public DataContentDto getBio()   {
        return this.bio;
    }

    @XmlElement(name = "biodto")
    public void setBio(DataContentDto bio)   {
        this.bio = bio;
    }

    public Date getEffFrm()   {
        return this.effFrm;
    }

    @XmlElement(name = "efffrm")
    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }

    public Date getEffTo()   {
        return this.effTo;
    }

    @XmlElement(name = "effto")
    public void setEffTo(Date effTo)   {
        this.effTo = effTo;
    }


    public DoctorUserListDto getDoctorUserDoctors()   {
        return this.doctorUserDoctors;
    }

    public void setDoctorUserDoctors(DoctorUserListDto doctorUserDoctors)   {
        this.doctorUserDoctors = doctorUserDoctors;
    }

    public DoctorFieldListDto getDoctorFieldDoctors()   {
        return this.doctorFieldDoctors;
    }

    public void setDoctorFieldDoctors(DoctorFieldListDto doctorFieldDoctors)   {
        this.doctorFieldDoctors = doctorFieldDoctors;
    }

    public DoctorPracticeListDto getDoctorPracticeDoctors()   {
        return this.doctorPracticeDoctors;
    }

    public void setDoctorPracticeDoctors(DoctorPracticeListDto doctorPracticeDoctors)   {
        this.doctorPracticeDoctors = doctorPracticeDoctors;
    }

    public AppointmentListDto getAppointmentDoctors()   {
        return this.appointmentDoctors;
    }

    public void setAppointmentDoctors(AppointmentListDto appointmentDoctors)   {
        this.appointmentDoctors = appointmentDoctors;
    }

    public PrescriptionListDto getPrescriptionDoctors()   {
        return this.prescriptionDoctors;
    }

    public void setPrescriptionDoctors(PrescriptionListDto prescriptionDoctors)   {
        this.prescriptionDoctors = prescriptionDoctors;
    }

}