package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MEDS_DOCTOR_APPOINTMENT")
public class DoctorAppointmentEntity    {

    private Long medsDoctorAppointmentId;
    private AppointmentEntity appointment;
    private DoctorEntity doctor;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="MEDS_DOCTOR_APPOINTMENT_ID" , length=15 , nullable=false)
    public Long getMedsDoctorAppointmentId()   {
        return this.medsDoctorAppointmentId;
    }

    public void setMedsDoctorAppointmentId(Long medsDoctorAppointmentId)   {
        this.medsDoctorAppointmentId = medsDoctorAppointmentId;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="APPOINTMENT_ID", referencedColumnName="APPOINTMENT_ID")
    public AppointmentEntity getAppointment()   {
        return this.appointment;
    }

    public void setAppointment(AppointmentEntity appointment)   {
        this.appointment = appointment;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DOCTOR_ID", referencedColumnName="DOCTOR_ID")
    public DoctorEntity getDoctor()   {
        return this.doctor;
    }

    public void setDoctor(DoctorEntity doctor)   {
        this.doctor = doctor;
    }


}