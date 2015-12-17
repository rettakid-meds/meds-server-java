package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "doctoruserdto")
public class DoctorUserDto    {

    private Long doctorUserId;
    private UserDto user;
    private DoctorDto doctor;

    public Long getDoctorUserId()   {
        return this.doctorUserId;
    }

    @XmlElement(name = "doctoruserid" , required = false)
    public void setDoctorUserId(Long doctorUserId)   {
        this.doctorUserId = doctorUserId;
    }

    public UserDto getUser()   {
        return this.user;
    }

    @XmlElement(name = "userdto")
    public void setUser(UserDto user)   {
        this.user = user;
    }

    public DoctorDto getDoctor()   {
        return this.doctor;
    }

    @XmlElement(name = "doctordto")
    public void setDoctor(DoctorDto doctor)   {
        this.doctor = doctor;
    }


}