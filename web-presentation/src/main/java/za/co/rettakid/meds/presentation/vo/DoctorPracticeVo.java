package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class DoctorPracticeVo    {

    private Long medsDoctorPracticeId;
    @Valid
    @NotBlank @NotNull
    private PracticeVo practice;
    @Valid
    @NotBlank @NotNull
    private DoctorVo doctor;

    public Long getMedsDoctorPracticeId()   {
        return this.medsDoctorPracticeId;
    }

    public void setMedsDoctorPracticeId(Long medsDoctorPracticeId)   {
        this.medsDoctorPracticeId = medsDoctorPracticeId;
    }

    public PracticeVo getPractice()   {
        return this.practice;
    }

    public void setPractice(PracticeVo practice)   {
        this.practice = practice;
    }

    public DoctorVo getDoctor()   {
        return this.doctor;
    }

    public void setDoctor(DoctorVo doctor)   {
        this.doctor = doctor;
    }

}