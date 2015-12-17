package za.co.rettakid.meds.presentation.vo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class AppointmentVo    {

    private Long appointmentId;
    @NotNull
    private DoctorVo doctor;
    @NotNull
    private UserVo user;
    @Valid
    private DataContentVo note;
    @NotNull
    private Date expectedFrm;
    @NotNull
    private Date expectedTo;
    private Date actualFrm;
    private Date actualTo;

    public Long getAppointmentId()   {
        return this.appointmentId;
    }

    public void setAppointmentId(Long appointmentId)   {
        this.appointmentId = appointmentId;
    }

    public DoctorVo getDoctor()   {
        return this.doctor;
    }

    public void setDoctor(DoctorVo doctor)   {
        this.doctor = doctor;
    }

    public UserVo getUser()   {
        return this.user;
    }

    public void setUser(UserVo user)   {
        this.user = user;
    }

    public DataContentVo getNote()   {
        return this.note;
    }

    public void setNote(DataContentVo note)   {
        this.note = note;
    }

    public Date getExpectedFrm()   {
        return this.expectedFrm;
    }

    public void setExpectedFrm(Date expectedFrm)   {
        this.expectedFrm = expectedFrm;
    }

    public Date getExpectedTo()   {
        return this.expectedTo;
    }

    public void setExpectedTo(Date expectedTo)   {
        this.expectedTo = expectedTo;
    }

    public Date getActualFrm()   {
        return this.actualFrm;
    }

    public void setActualFrm(Date actualFrm)   {
        this.actualFrm = actualFrm;
    }

    public Date getActualTo()   {
        return this.actualTo;
    }

    public void setActualTo(Date actualTo)   {
        this.actualTo = actualTo;
    }

}