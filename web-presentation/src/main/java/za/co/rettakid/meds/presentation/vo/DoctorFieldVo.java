package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class DoctorFieldVo    {

    private Long doctorFieldId;
    @Valid
    @NotBlank @NotNull
    private FieldVo field;
    @Valid
    @NotBlank @NotNull
    private DoctorVo doctor;

    public Long getDoctorFieldId()   {
        return this.doctorFieldId;
    }

    public void setDoctorFieldId(Long doctorFieldId)   {
        this.doctorFieldId = doctorFieldId;
    }

    public FieldVo getField()   {
        return this.field;
    }

    public void setField(FieldVo field)   {
        this.field = field;
    }

    public DoctorVo getDoctor()   {
        return this.doctor;
    }

    public void setDoctor(DoctorVo doctor)   {
        this.doctor = doctor;
    }

}