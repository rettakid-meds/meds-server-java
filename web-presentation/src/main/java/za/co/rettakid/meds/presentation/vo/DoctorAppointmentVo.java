package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class DoctorAppointmentVo    {

    private Long medsDoctorAppointmentId;
    @Valid
    @NotNull
    private AppointmentVo appointment;
    @Valid
    @NotNull
    private DoctorVo doctor;

    public Long getMedsDoctorAppointmentId()   {
        return this.medsDoctorAppointmentId;
    }

    public void setMedsDoctorAppointmentId(Long medsDoctorAppointmentId)   {
        this.medsDoctorAppointmentId = medsDoctorAppointmentId;
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

}