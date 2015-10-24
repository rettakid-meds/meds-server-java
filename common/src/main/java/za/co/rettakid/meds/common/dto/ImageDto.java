package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "imagedto")
public class ImageDto    {

    private Long imageId;
    private FileDto file;
    private Integer width;
    private Integer height;

    public Long getImageId()   {
        return this.imageId;
    }

    @XmlElement(name = "imageid" , required = false)
    public void setImageId(Long imageId)   {
        this.imageId = imageId;
    }

    public FileDto getFile()   {
        return this.file;
    }

    @XmlElement(name = "filedto")
    public void setFile(FileDto file)   {
        this.file = file;
    }

    public Integer getWidth()   {
        return this.width;
    }

    @XmlElement(name = "width")
    public void setWidth(Integer width)   {
        this.width = width;
    }

    public Integer getHeight()   {
        return this.height;
    }

    @XmlElement(name = "height")
    public void setHeight(Integer height)   {
        this.height = height;
    }

}