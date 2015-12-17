package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;
import java.util.Date;

@Entity
@Audited
@Table(name = "MEDS_PRESCRIPTION")
public class PrescriptionEntity    {

    private Long prescriptionId;
    private AppointmentEntity appointment;
    private DoctorEntity doctor;
    private UserEntity user;
    private FileEntity file;
    private Date effFrm;
    private Date effTo;
    private List<PrescriptionItemEntity> prescriptionItemPrescriptions;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USER_ID", referencedColumnName="USER_ID")
    public UserEntity getUser()   {
        return this.user;
    }

    public void setUser(UserEntity user)   {
        this.user = user;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FILE_ID", referencedColumnName="FILE_ID")
    public FileEntity getFile()   {
        return this.file;
    }

    public void setFile(FileEntity file)   {
        this.file = file;
    }

    @Basic
    @Column(name="EFF_FRM" , length=0 , nullable=false)
    public Date getEffFrm()   {
        return this.effFrm;
    }

    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }

    @Basic
    @Column(name="EFF_TO" , length=0 , nullable=false)
    public Date getEffTo()   {
        return this.effTo;
    }

    public void setEffTo(Date effTo)   {
        this.effTo = effTo;
    }


    @OneToMany(mappedBy = "prescription", fetch = FetchType.LAZY)
    public List<PrescriptionItemEntity> getPrescriptionItemPrescriptions()   {
        return this.prescriptionItemPrescriptions;
    }

    public void setPrescriptionItemPrescriptions(List<PrescriptionItemEntity> prescriptionItemPrescriptions)   {
    this.prescriptionItemPrescriptions = prescriptionItemPrescriptions;
    }

}