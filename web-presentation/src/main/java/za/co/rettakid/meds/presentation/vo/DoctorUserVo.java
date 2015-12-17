package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class DoctorUserVo    {

    private Long doctorUserId;
    @Valid
    @NotNull
    private UserVo user;
    @Valid
    @NotNull
    private DoctorVo doctor;

    public Long getDoctorUserId()   {
        return this.doctorUserId;
    }

    public void setDoctorUserId(Long doctorUserId)   {
        this.doctorUserId = doctorUserId;
    }

    public UserVo getUser()   {
        return this.user;
    }

    public void setUser(UserVo user)   {
        this.user = user;
    }

    public DoctorVo getDoctor()   {
        return this.doctor;
    }

    public void setDoctor(DoctorVo doctor)   {
        this.doctor = doctor;
    }

}