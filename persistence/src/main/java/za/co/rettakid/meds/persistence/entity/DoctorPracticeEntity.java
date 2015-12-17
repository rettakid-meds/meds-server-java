package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "MEDS_DOCTOR_PRACTICE")
public class DoctorPracticeEntity    {

    private Long medsDoctorPracticeId;
    private PracticeEntity practice;
    private DoctorEntity doctor;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="MEDS_DOCTOR_PRACTICE_ID" , length=15 , nullable=false)
    public Long getMedsDoctorPracticeId()   {
        return this.medsDoctorPracticeId;
    }

    public void setMedsDoctorPracticeId(Long medsDoctorPracticeId)   {
        this.medsDoctorPracticeId = medsDoctorPracticeId;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PRACTICE_ID", referencedColumnName="PRACTICE_ID")
    public PracticeEntity getPractice()   {
        return this.practice;
    }

    public void setPractice(PracticeEntity practice)   {
        this.practice = practice;
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