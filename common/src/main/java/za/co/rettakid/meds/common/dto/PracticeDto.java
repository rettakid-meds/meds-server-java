package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

@XmlRootElement(name = "practicedto")
public class PracticeDto    {

    private Long practiceId;
    private String name;
    private String email;
    private Float longitude;
    private Float latitude;
    private String address;
    private TradingDayDto tradingDay;
    private String phone;
    private Float fee;
    private ImageDto image;
    private DataContentDto bio;
    private Date effFrm;
    private Date effTo;
    private PracticeUserListDto practiceUserPractices;
    private PracticeFieldListDto practiceFieldPractices;
    private PracticeMedicalAidListDto practiceMedicalAidPractices;
    private DoctorPracticeListDto doctorPracticePractices;

    public Long getPracticeId()   {
        return this.practiceId;
    }

    @XmlElement(name = "practiceid" , required = false)
    public void setPracticeId(Long practiceId)   {
        this.practiceId = practiceId;
    }

    public String getName()   {
        return this.name;
    }

    @XmlElement(name = "name" , required = false)
    public void setName(String name)   {
        this.name = name;
    }

    public String getEmail()   {
        return this.email;
    }

    @XmlElement(name = "email")
    public void setEmail(String email)   {
        this.email = email;
    }

    public Float getLongitude()   {
        return this.longitude;
    }

    @XmlElement(name = "longitude")
    public void setLongitude(Float longitude)   {
        this.longitude = longitude;
    }

    public Float getLatitude()   {
        return this.latitude;
    }

    @XmlElement(name = "latitude")
    public void setLatitude(Float latitude)   {
        this.latitude = latitude;
    }

    public String getAddress()   {
        return this.address;
    }

    @XmlElement(name = "address")
    public void setAddress(String address)   {
        this.address = address;
    }

    public TradingDayDto getTradingDay()   {
        return this.tradingDay;
    }

    @XmlElement(name = "tradingdaydto")
    public void setTradingDay(TradingDayDto tradingDay)   {
        this.tradingDay = tradingDay;
    }

    public String getPhone()   {
        return this.phone;
    }

    @XmlElement(name = "phone" , required = false)
    public void setPhone(String phone)   {
        this.phone = phone;
    }

    public Float getFee()   {
        return this.fee;
    }

    @XmlElement(name = "fee" , required = false)
    public void setFee(Float fee)   {
        this.fee = fee;
    }

    public ImageDto getImage()   {
        return this.image;
    }

    @XmlElement(name = "imagedto")
    public void setImage(ImageDto image)   {
        this.image = image;
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


    public PracticeUserListDto getPracticeUserPractices()   {
        return this.practiceUserPractices;
    }

    public void setPracticeUserPractices(PracticeUserListDto practiceUserPractices)   {
        this.practiceUserPractices = practiceUserPractices;
    }

    public PracticeFieldListDto getPracticeFieldPractices()   {
        return this.practiceFieldPractices;
    }

    public void setPracticeFieldPractices(PracticeFieldListDto practiceFieldPractices)   {
        this.practiceFieldPractices = practiceFieldPractices;
    }

    public PracticeMedicalAidListDto getPracticeMedicalAidPractices()   {
        return this.practiceMedicalAidPractices;
    }

    public void setPracticeMedicalAidPractices(PracticeMedicalAidListDto practiceMedicalAidPractices)   {
        this.practiceMedicalAidPractices = practiceMedicalAidPractices;
    }

    public DoctorPracticeListDto getDoctorPracticePractices()   {
        return this.doctorPracticePractices;
    }

    public void setDoctorPracticePractices(DoctorPracticeListDto doctorPracticePractices)   {
        this.doctorPracticePractices = doctorPracticePractices;
    }

}