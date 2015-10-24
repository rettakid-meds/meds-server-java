package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_IMAGE")
public class ImageEntity    {

    private Long imageId;
    private FileEntity fileEntity;
    private Integer width;
    private Integer height;


    @Id
    @GeneratedValue
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
    public FileEntity getFileEntity()   {
        return this.fileEntity;
    }

    public void setFileEntity(FileEntity fileEntity)   {
        this.fileEntity = fileEntity;
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

}