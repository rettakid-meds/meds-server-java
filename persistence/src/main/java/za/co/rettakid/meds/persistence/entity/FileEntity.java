package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;
import java.util.Date;

@Entity
@Audited
@Table(name = "MEDS_FILE")
public class FileEntity    {

    private Long fileId;
    private String guid;
    private String name;
    private Date effFrm;
    private List<ImageEntity> imageFiles;
    private List<PrescriptionEntity> prescriptionFiles;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="FILE_ID" , length=15 , nullable=false)
    public Long getFileId()   {
        return this.fileId;
    }

    public void setFileId(Long fileId)   {
        this.fileId = fileId;
    }

    @Basic
    @Column(name="GUID" , length=50 , nullable=false)
    public String getGuid()   {
        return this.guid;
    }

    public void setGuid(String guid)   {
        this.guid = guid;
    }

    @Basic
    @Column(name="NAME" , length=50 , nullable=false)
    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

    @Basic
    @Column(name="EFF_FRM" , length=0 , nullable=false)
    public Date getEffFrm()   {
        return this.effFrm;
    }

    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }


    @OneToMany(mappedBy = "file", fetch = FetchType.LAZY)
    public List<ImageEntity> getImageFiles()   {
        return this.imageFiles;
    }

    public void setImageFiles(List<ImageEntity> imageFiles)   {
    this.imageFiles = imageFiles;
    }

    @OneToMany(mappedBy = "file", fetch = FetchType.LAZY)
    public List<PrescriptionEntity> getPrescriptionFiles()   {
        return this.prescriptionFiles;
    }

    public void setPrescriptionFiles(List<PrescriptionEntity> prescriptionFiles)   {
    this.prescriptionFiles = prescriptionFiles;
    }

}