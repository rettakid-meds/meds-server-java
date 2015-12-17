package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class MedicalAidVo    {

    private Long medicalAidId;
    @NotNull
    private Long medicalAidName;

    public Long getMedicalAidId()   {
        return this.medicalAidId;
    }

    public void setMedicalAidId(Long medicalAidId)   {
        this.medicalAidId = medicalAidId;
    }

    public Long getMedicalAidName()   {
        return this.medicalAidName;
    }

    public void setMedicalAidName(Long medicalAidName)   {
        this.medicalAidName = medicalAidName;
    }

}