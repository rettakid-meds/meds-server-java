package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_DOCTOR_PRACTICE")
public class DoctorPracticeEntity    {

    private Long medsDoctorPracticeId;
    private PracticeEntity practiceEntity;
    private DoctorEntity doctorEntity;


    @Id
    @GeneratedValue
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
    public PracticeEntity getPracticeEntity()   {
        return this.practiceEntity;
    }

    public void setPracticeEntity(PracticeEntity practiceEntity)   {
        this.practiceEntity = practiceEntity;
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