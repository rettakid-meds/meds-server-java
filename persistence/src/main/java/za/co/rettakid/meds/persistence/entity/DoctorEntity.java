package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_DOCTOR")
public class DoctorEntity    {

    private Long doctorId;
    private UserEntity user;
    private ImageEntity icon;
    private ImageEntity image;
    private DataContentEntity bio;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public UserEntity getUser()   {
        return this.user;
    }

    public void setUser(UserEntity user)   {
        this.user = user;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ICON_ID", referencedColumnName="IMAGE_ID")
    public ImageEntity getIcon()   {
        return this.icon;
    }

    public void setIcon(ImageEntity icon)   {
        this.icon = icon;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IMAGE_ID", referencedColumnName="IMAGE_ID")
    public ImageEntity getImage()   {
        return this.image;
    }

    public void setImage(ImageEntity image)   {
        this.image = image;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIO_ID", referencedColumnName="DATA_CONTENT_ID")
    public DataContentEntity getBio()   {
        return this.bio;
    }

    public void setBio(DataContentEntity bio)   {
        this.bio = bio;
    }

}