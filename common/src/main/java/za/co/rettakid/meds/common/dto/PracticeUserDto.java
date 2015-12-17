package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "practiceuserdto")
public class PracticeUserDto    {

    private Long practiceUserId;
    private UserDto user;
    private PracticeDto practice;

    public Long getPracticeUserId()   {
        return this.practiceUserId;
    }

    @XmlElement(name = "practiceuserid" , required = false)
    public void setPracticeUserId(Long practiceUserId)   {
        this.practiceUserId = practiceUserId;
    }

    public UserDto getUser()   {
        return this.user;
    }

    @XmlElement(name = "userdto")
    public void setUser(UserDto user)   {
        this.user = user;
    }

    public PracticeDto getPractice()   {
        return this.practice;
    }

    @XmlElement(name = "practicedto")
    public void setPractice(PracticeDto practice)   {
        this.practice = practice;
    }


}