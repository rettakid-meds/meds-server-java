package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class UserMedicalAidVo    {

    private Long userMedicalAidId;
    @Valid
    @NotNull
    private UserVo user;
    @Valid
    @NotNull
    private MedicalAidVo medicalAid;

    public Long getUserMedicalAidId()   {
        return this.userMedicalAidId;
    }

    public void setUserMedicalAidId(Long userMedicalAidId)   {
        this.userMedicalAidId = userMedicalAidId;
    }

    public UserVo getUser()   {
        return this.user;
    }

    public void setUser(UserVo user)   {
        this.user = user;
    }

    public MedicalAidVo getMedicalAid()   {
        return this.medicalAid;
    }

    public void setMedicalAid(MedicalAidVo medicalAid)   {
        this.medicalAid = medicalAid;
    }

}