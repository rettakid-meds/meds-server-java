package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_DOCTOR")
public class DoctorEntity    {

    private Long doctorId;
    private UserEntity userEntity;
    private ImageEntity iconEntity;
    private ImageEntity imageEntity;
    private DataContentEntity bioEntity;


    @Id
    @GeneratedValue
    @Basic
    @Column(name="DOCTOR_ID" , length=15 , nullable=false)
    public Long getDoctorId()   {
        return this.doctorId;
    }

    public void setDoctorId(Long doctorId)   {
        this.doctorId = doctorId;
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
    @JoinColumn(name="ICON_ID", referencedColumnName="IMAGE_ID")
    public ImageEntity getIconEntity()   {
        return this.iconEntity;
    }

    public void setIconEntity(ImageEntity iconEntity)   {
        this.iconEntity = iconEntity;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IMAGE_ID", referencedColumnName="IMAGE_ID")
    public ImageEntity getImageEntity()   {
        return this.imageEntity;
    }

    public void setImageEntity(ImageEntity imageEntity)   {
        this.imageEntity = imageEntity;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIO_ID", referencedColumnName="DATA_CONTENT_ID")
    public DataContentEntity getBioEntity()   {
        return this.bioEntity;
    }

    public void setBioEntity(DataContentEntity bioEntity)   {
        this.bioEntity = bioEntity;
    }

}