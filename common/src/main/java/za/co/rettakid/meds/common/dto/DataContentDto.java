package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "datacontentdto")
public class DataContentDto    {

    private Long dataContentId;
    private String data;

    public Long getDataContentId()   {
        return this.dataContentId;
    }

    @XmlElement(name = "datacontentid" , required = false)
    public void setDataContentId(Long dataContentId)   {
        this.dataContentId = dataContentId;
    }

    public String getData()   {
        return this.data;
    }

    @XmlElement(name = "data")
    public void setData(String data)   {
        this.data = data;
    }

}