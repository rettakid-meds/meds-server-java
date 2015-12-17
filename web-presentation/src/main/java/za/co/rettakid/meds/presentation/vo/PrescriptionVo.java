package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.Date;

public class PrescriptionVo    {

    private Long prescriptionId;
    @Valid
    @NotNull
    private AppointmentVo appointment;
    @Valid
    @NotNull
    private DoctorVo doctor;
    @Valid
    @NotNull
    private UserVo user;
    @Valid
    @NotNull
    private FileVo file;
    @NotNull
    private Date effFrm;
    @NotNull
    private Date effTo;

    public Long getPrescriptionId()   {
        return this.prescriptionId;
    }

    public void setPrescriptionId(Long prescriptionId)   {
        this.prescriptionId = prescriptionId;
    }

    public AppointmentVo getAppointment()   {
        return this.appointment;
    }

    public void setAppointment(AppointmentVo appointment)   {
        this.appointment = appointment;
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

    public FileVo getFile()   {
        return this.file;
    }

    public void setFile(FileVo file)   {
        this.file = file;
    }

    public Date getEffFrm()   {
        return this.effFrm;
    }

    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }

    public Date getEffTo()   {
        return this.effTo;
    }

    public void setEffTo(Date effTo)   {
        this.effTo = effTo;
    }

}