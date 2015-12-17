package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "usermedicalaiddto")
public class UserMedicalAidDto    {

    private Long userMedicalAidId;
    private UserDto user;
    private MedicalAidDto medicalAid;

    public Long getUserMedicalAidId()   {
        return this.userMedicalAidId;
    }

    @XmlElement(name = "usermedicalaidid" , required = false)
    public void setUserMedicalAidId(Long userMedicalAidId)   {
        this.userMedicalAidId = userMedicalAidId;
    }

    public UserDto getUser()   {
        return this.user;
    }

    @XmlElement(name = "userdto")
    public void setUser(UserDto user)   {
        this.user = user;
    }

    public MedicalAidDto getMedicalAid()   {
        return this.medicalAid;
    }

    @XmlElement(name = "medicalaiddto")
    public void setMedicalAid(MedicalAidDto medicalAid)   {
        this.medicalAid = medicalAid;
    }


}