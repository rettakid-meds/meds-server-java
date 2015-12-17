package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "MEDS_IMAGE")
public class ImageEntity    {

    private Long imageId;
    private FileEntity file;
    private Integer width;
    private Integer height;
    private List<PracticeEntity> practiceImages;
    private List<DoctorEntity> doctorImages;
    private List<DoctorEntity> doctorIcons;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="IMAGE_ID" , length=15 , nullable=false)
    public Long getImageId()   {
        return this.imageId;
    }

    public void setImageId(Long imageId)   {
        this.imageId = imageId;
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
    @Column(name="WIDTH" , length=5 , nullable=false)
    public Integer getWidth()   {
        return this.width;
    }

    public void setWidth(Integer width)   {
        this.width = width;
    }

    @Basic
    @Column(name="HEIGHT" , length=5 , nullable=false)
    public Integer getHeight()   {
        return this.height;
    }

    public void setHeight(Integer height)   {
        this.height = height;
    }


    @OneToMany(mappedBy = "image", fetch = FetchType.LAZY)
    public List<PracticeEntity> getPracticeImages()   {
        return this.practiceImages;
    }

    public void setPracticeImages(List<PracticeEntity> practiceImages)   {
    this.practiceImages = practiceImages;
    }

    @OneToMany(mappedBy = "image", fetch = FetchType.LAZY)
    public List<DoctorEntity> getDoctorImages()   {
        return this.doctorImages;
    }

    public void setDoctorImages(List<DoctorEntity> doctorImages)   {
    this.doctorImages = doctorImages;
    }

    @OneToMany(mappedBy = "icon", fetch = FetchType.LAZY)
    public List<DoctorEntity> getDoctorIcons()   {
        return this.doctorIcons;
    }

    public void setDoctorIcons(List<DoctorEntity> doctorIcons)   {
    this.doctorIcons = doctorIcons;
    }

}