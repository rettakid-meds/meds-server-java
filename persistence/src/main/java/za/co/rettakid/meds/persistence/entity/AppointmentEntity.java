package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;
import java.util.Date;

@Entity
@Audited
@Table(name = "MEDS_APPOINTMENT")
public class AppointmentEntity    {

    private Long appointmentId;
    private DoctorEntity doctor;
    private UserEntity user;
    private DataContentEntity note;
    private Date expectedFrm;
    private Date expectedTo;
    private Date actualFrm;
    private Date actualTo;
    private List<PrescriptionEntity> prescriptionAppointments;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="APPOINTMENT_ID" , length=15 , nullable=false)
    public Long getAppointmentId()   {
        return this.appointmentId;
    }

    public void setAppointmentId(Long appointmentId)   {
        this.appointmentId = appointmentId;
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
    @JoinColumn(name="NOTE_ID", referencedColumnName="DATA_CONTENT_ID")
    public DataContentEntity getNote()   {
        return this.note;
    }

    public void setNote(DataContentEntity note)   {
        this.note = note;
    }

    @Basic
    @Column(name="EXPECTED_FRM" , length=0 , nullable=false)
    public Date getExpectedFrm()   {
        return this.expectedFrm;
    }

    public void setExpectedFrm(Date expectedFrm)   {
        this.expectedFrm = expectedFrm;
    }

    @Basic
    @Column(name="EXPECTED_TO" , length=0 , nullable=false)
    public Date getExpectedTo()   {
        return this.expectedTo;
    }

    public void setExpectedTo(Date expectedTo)   {
        this.expectedTo = expectedTo;
    }

    @Basic
    @Column(name="ACTUAL_FRM" , length=0 , nullable=true)
    public Date getActualFrm()   {
        return this.actualFrm;
    }

    public void setActualFrm(Date actualFrm)   {
        this.actualFrm = actualFrm;
    }

    @Basic
    @Column(name="ACTUAL_TO" , length=0 , nullable=true)
    public Date getActualTo()   {
        return this.actualTo;
    }

    public void setActualTo(Date actualTo)   {
        this.actualTo = actualTo;
    }


    @OneToMany(mappedBy = "appointment", fetch = FetchType.LAZY)
    public List<PrescriptionEntity> getPrescriptionAppointments()   {
        return this.prescriptionAppointments;
    }

    public void setPrescriptionAppointments(List<PrescriptionEntity> prescriptionAppointments)   {
    this.prescriptionAppointments = prescriptionAppointments;
    }

}