package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MEDS_APPOINTMENT")
public class AppointmentEntity    {

    private Long appointmentId;
    private PracticeEntity practiceEntity;
    private UserEntity userEntity;
    private DataContentEntity noteEntity;
    private Date expectedFrm;
    private Date expectedTo;
    private Date actualFrm;
    private Date actualTo;


    @Id
    @GeneratedValue
    @Basic
    @Column(name="APPOINTMENT_ID" , length=15 , nullable=false)
    public Long getAppointmentId()   {
        return this.appointmentId;
    }

    public void setAppointmentId(Long appointmentId)   {
        this.appointmentId = appointmentId;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PRACTICE_ID", referencedColumnName="PRACTICE_ID")
    public PracticeEntity getPracticeEntity()   {
        return this.practiceEntity;
    }

    public void setPracticeEntity(PracticeEntity practiceEntity)   {
        this.practiceEntity = practiceEntity;
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
    @JoinColumn(name="NOTE_ID", referencedColumnName="DATA_CONTENT_ID")
    public DataContentEntity getNoteEntity()   {
        return this.noteEntity;
    }

    public void setNoteEntity(DataContentEntity noteEntity)   {
        this.noteEntity = noteEntity;
    }

    @Basic
    @Column(name="EXPECTED_FRM" , nullable=false)
    public Date getExpectedFrm()   {
        return this.expectedFrm;
    }

    public void setExpectedFrm(Date expectedFrm)   {
        this.expectedFrm = expectedFrm;
    }

    @Basic
    @Column(name="EXPECTED_TO" , nullable=false)
    public Date getExpectedTo()   {
        return this.expectedTo;
    }

    public void setExpectedTo(Date expectedTo)   {
        this.expectedTo = expectedTo;
    }

    @Basic
    @Column(name="ACTUAL_FRM" , nullable=true)
    public Date getActualFrm()   {
        return this.actualFrm;
    }

    public void setActualFrm(Date actualFrm)   {
        this.actualFrm = actualFrm;
    }

    @Basic
    @Column(name="ACTUAL_TO" , nullable=true)
    public Date getActualTo()   {
        return this.actualTo;
    }

    public void setActualTo(Date actualTo)   {
        this.actualTo = actualTo;
    }

}