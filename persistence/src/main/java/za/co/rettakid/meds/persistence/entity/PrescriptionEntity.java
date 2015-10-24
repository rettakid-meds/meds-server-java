package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MEDS_PRESCRIPTION")
public class PrescriptionEntity    {

    private Long prescriptionId;
    private AppointmentEntity appointmentEntity;
    private DoctorEntity doctorEntity;
    private UserEntity userEntity;
    private FileEntity fileEntity;
    private Date effFrm;
    private Date effTo;


    @Id
    @GeneratedValue
    @Basic
    @Column(name="PRESCRIPTION_ID" , length=15 , nullable=false)
    public Long getPrescriptionId()   {
        return this.prescriptionId;
    }

    public void setPrescriptionId(Long prescriptionId)   {
        this.prescriptionId = prescriptionId;
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

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USER_ID", referencedColumnName="USER_ID")
    public UserEntity getUserEntity()   {
        return this.userEntity;
    }

    public void setUserEntity(UserEntity userEntity)   {
        this.userEntity = userEntity;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FILE_ID", referencedColumnName="FILE_ID")
    public FileEntity getFileEntity()   {
        return this.fileEntity;
    }

    public void setFileEntity(FileEntity fileEntity)   {
        this.fileEntity = fileEntity;
    }

    @Basic
    @Column(name="EFF_FRM" , nullable=false)
    public Date getEffFrm()   {
        return this.effFrm;
    }

    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }

    @Basic
    @Column(name="EFF_TO" , nullable=false)
    public Date getEffTo()   {
        return this.effTo;
    }

    public void setEffTo(Date effTo)   {
        this.effTo = effTo;
    }

}