package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "MEDS_MEDICAL_AID")
public class MedicalAidEntity    {

    private Long medicalAidId;
    private Long medicalAidName;
    private List<UserMedicalAidEntity> userMedicalAidMedicalAids;
    private List<PracticeMedicalAidEntity> practiceMedicalAidMedicalAids;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="MEDICAL_AID_ID" , length=15 , nullable=false)
    public Long getMedicalAidId()   {
        return this.medicalAidId;
    }

    public void setMedicalAidId(Long medicalAidId)   {
        this.medicalAidId = medicalAidId;
    }

    @Basic
    @Column(name="MEDICAL_AID_NAME" , length=50 , nullable=false)
    public Long getMedicalAidName()   {
        return this.medicalAidName;
    }

    public void setMedicalAidName(Long medicalAidName)   {
        this.medicalAidName = medicalAidName;
    }


    @OneToMany(mappedBy = "medicalAid", fetch = FetchType.LAZY)
    public List<UserMedicalAidEntity> getUserMedicalAidMedicalAids()   {
        return this.userMedicalAidMedicalAids;
    }

    public void setUserMedicalAidMedicalAids(List<UserMedicalAidEntity> userMedicalAidMedicalAids)   {
    this.userMedicalAidMedicalAids = userMedicalAidMedicalAids;
    }

    @OneToMany(mappedBy = "medicalAid", fetch = FetchType.LAZY)
    public List<PracticeMedicalAidEntity> getPracticeMedicalAidMedicalAids()   {
        return this.practiceMedicalAidMedicalAids;
    }

    public void setPracticeMedicalAidMedicalAids(List<PracticeMedicalAidEntity> practiceMedicalAidMedicalAids)   {
    this.practiceMedicalAidMedicalAids = practiceMedicalAidMedicalAids;
    }

}