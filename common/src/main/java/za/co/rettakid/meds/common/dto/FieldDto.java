package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "fielddto")
public class FieldDto    {

    private Long fieldId;
    private String name;
    private String mapColor;

    public Long getFieldId()   {
        return this.fieldId;
    }

    @XmlElement(name = "fieldid" , required = false)
    public void setFieldId(Long fieldId)   {
        this.fieldId = fieldId;
    }

    public String getName()   {
        return this.name;
    }

    @XmlElement(name = "name")
    public void setName(String name)   {
        this.name = name;
    }

    public String getMapColor()   {
        return this.mapColor;
    }

    @XmlElement(name = "mapcolor")
    public void setMapColor(String mapColor)   {
        this.mapColor = mapColor;
    }

}