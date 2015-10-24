package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_DOCTOR_APPOINTMENT")
public class DoctorAppointmentEntity    {

    private Long medsDoctorAppointmentId;
    private AppointmentEntity appointmentEntity;
    private DoctorEntity doctorEntity;


    @Id
    @GeneratedValue
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
    public AppointmentEntity getAppointmentEntity()   {
        return this.appointmentEntity;
    }

    public void setAppointmentEntity(AppointmentEntity appointmentEntity)   {
        this.appointmentEntity = appointmentEntity;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DOCTOR_ID", referencedColumnName="DOCTOR_ID")
    public DoctorEntity getDoctorEntity()   {
        return this.doctorEntity;
    }

    public void setDoctorEntity(DoctorEntity doctorEntity)   {
        this.doctorEntity = doctorEntity;
    }

}