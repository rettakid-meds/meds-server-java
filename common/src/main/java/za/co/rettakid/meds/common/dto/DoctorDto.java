package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "doctordto")
public class DoctorDto    {

    private Long doctorId;
    private UserDto user;
    private ImageDto icon;
    private ImageDto image;
    private DataContentDto bio;

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

    public DataContentDto getBio()   {
        return this.bio;
    }

    @XmlElement(name = "biodto")
    public void setBio(DataContentDto bio)   {
        this.bio = bio;
    }

}