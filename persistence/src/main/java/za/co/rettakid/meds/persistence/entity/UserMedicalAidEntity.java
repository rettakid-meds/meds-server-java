package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "MEDS_USER_MEDICAL_AID")
public class UserMedicalAidEntity    {

    private Long userMedicalAidId;
    private UserEntity user;
    private MedicalAidEntity medicalAid;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="USER_MEDICAL_AID_ID" , length=15 , nullable=false)
    public Long getUserMedicalAidId()   {
        return this.userMedicalAidId;
    }

    public void setUserMedicalAidId(Long userMedicalAidId)   {
        this.userMedicalAidId = userMedicalAidId;
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
    @JoinColumn(name="MEDICAL_AID_ID", referencedColumnName="MEDICAL_AID_ID")
    public MedicalAidEntity getMedicalAid()   {
        return this.medicalAid;
    }

    public void setMedicalAid(MedicalAidEntity medicalAid)   {
        this.medicalAid = medicalAid;
    }


}