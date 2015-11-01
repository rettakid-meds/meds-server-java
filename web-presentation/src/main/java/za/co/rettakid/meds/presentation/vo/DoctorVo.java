package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class DoctorVo    {

    private Long doctorId;
    @Valid
    @NotBlank @NotNull
    private UserVo user;
    @Valid
    @NotBlank @NotNull
    private ImageVo icon;
    @Valid
    @NotBlank @NotNull
    private ImageVo image;
    @Valid
    @NotBlank @NotNull
    private DataContentVo bio;

    public Long getDoctorId()   {
        return this.doctorId;
    }

    public void setDoctorId(Long doctorId)   {
        this.doctorId = doctorId;
    }

    public UserVo getUser()   {
        return this.user;
    }

    public void setUser(UserVo user)   {
        this.user = user;
    }

    public ImageVo getIcon()   {
        return this.icon;
    }

    public void setIcon(ImageVo icon)   {
        this.icon = icon;
    }

    public ImageVo getImage()   {
        return this.image;
    }

    public void setImage(ImageVo image)   {
        this.image = image;
    }

    public DataContentVo getBio()   {
        return this.bio;
    }

    public void setBio(DataContentVo bio)   {
        this.bio = bio;
    }

}