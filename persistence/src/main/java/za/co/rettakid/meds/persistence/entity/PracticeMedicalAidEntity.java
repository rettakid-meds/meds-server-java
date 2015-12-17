package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "MEDS_PRACTICE_MEDICAL_AID")
public class PracticeMedicalAidEntity    {

    private Long practiceMedicalAidId;
    private PracticeEntity practice;
    private MedicalAidEntity medicalAid;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="PRACTICE_MEDICAL_AID_ID" , length=15 , nullable=false)
    public Long getPracticeMedicalAidId()   {
        return this.practiceMedicalAidId;
    }

    public void setPracticeMedicalAidId(Long practiceMedicalAidId)   {
        this.practiceMedicalAidId = practiceMedicalAidId;
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
    @JoinColumn(name="MEDICAL_AID_ID", referencedColumnName="MEDICAL_AID_ID")
    public MedicalAidEntity getMedicalAid()   {
        return this.medicalAid;
    }

    public void setMedicalAid(MedicalAidEntity medicalAid)   {
        this.medicalAid = medicalAid;
    }


}