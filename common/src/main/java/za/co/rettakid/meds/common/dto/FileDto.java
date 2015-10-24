package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

@XmlRootElement(name = "filedto")
public class FileDto    {

    private Long fileId;
    private String guid;
    private String name;
    private Date effFrm;

    public Long getFileId()   {
        return this.fileId;
    }

    @XmlElement(name = "fileid" , required = false)
    public void setFileId(Long fileId)   {
        this.fileId = fileId;
    }

    public String getGuid()   {
        return this.guid;
    }

    @XmlElement(name = "guid")
    public void setGuid(String guid)   {
        this.guid = guid;
    }

    public String getName()   {
        return this.name;
    }

    @XmlElement(name = "name")
    public void setName(String name)   {
        this.name = name;
    }

    public Date getEffFrm()   {
        return this.effFrm;
    }

    @XmlElement(name = "efffrm")
    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }

}