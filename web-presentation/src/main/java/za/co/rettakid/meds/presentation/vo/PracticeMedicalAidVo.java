package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class PracticeMedicalAidVo    {

    private Long practiceMedicalAidId;
    @Valid
    @NotNull
    private PracticeVo practice;
    @Valid
    @NotNull
    private MedicalAidVo medicalAid;

    public Long getPracticeMedicalAidId()   {
        return this.practiceMedicalAidId;
    }

    public void setPracticeMedicalAidId(Long practiceMedicalAidId)   {
        this.practiceMedicalAidId = practiceMedicalAidId;
    }

    public PracticeVo getPractice()   {
        return this.practice;
    }

    public void setPractice(PracticeVo practice)   {
        this.practice = practice;
    }

    public MedicalAidVo getMedicalAid()   {
        return this.medicalAid;
    }

    public void setMedicalAid(MedicalAidVo medicalAid)   {
        this.medicalAid = medicalAid;
    }

}