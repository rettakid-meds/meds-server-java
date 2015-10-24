package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

@XmlRootElement(name = "appointmentdto")
public class AppointmentDto    {

    private Long appointmentId;
    private PracticeDto practice;
    private UserDto user;
    private DataContentDto note;
    private Date expectedFrm;
    private Date expectedTo;
    private Date actualFrm;
    private Date actualTo;

    public Long getAppointmentId()   {
        return this.appointmentId;
    }

    @XmlElement(name = "appointmentid" , required = false)
    public void setAppointmentId(Long appointmentId)   {
        this.appointmentId = appointmentId;
    }

    public PracticeDto getPractice()   {
        return this.practice;
    }

    @XmlElement(name = "practicedto")
    public void setPractice(PracticeDto practice)   {
        this.practice = practice;
    }

    public UserDto getUser()   {
        return this.user;
    }

    @XmlElement(name = "userdto")
    public void setUser(UserDto user)   {
        this.user = user;
    }

    public DataContentDto getNote()   {
        return this.note;
    }

    @XmlElement(name = "notedto" , required = false)
    public void setNote(DataContentDto note)   {
        this.note = note;
    }

    public Date getExpectedFrm()   {
        return this.expectedFrm;
    }

    @XmlElement(name = "expectedfrm")
    public void setExpectedFrm(Date expectedFrm)   {
        this.expectedFrm = expectedFrm;
    }

    public Date getExpectedTo()   {
        return this.expectedTo;
    }

    @XmlElement(name = "expectedto")
    public void setExpectedTo(Date expectedTo)   {
        this.expectedTo = expectedTo;
    }

    public Date getActualFrm()   {
        return this.actualFrm;
    }

    @XmlElement(name = "actualfrm" , required = false)
    public void setActualFrm(Date actualFrm)   {
        this.actualFrm = actualFrm;
    }

    public Date getActualTo()   {
        return this.actualTo;
    }

    @XmlElement(name = "actualto" , required = false)
    public void setActualTo(Date actualTo)   {
        this.actualTo = actualTo;
    }

}