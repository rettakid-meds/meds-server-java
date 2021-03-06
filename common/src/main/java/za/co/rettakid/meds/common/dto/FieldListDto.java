package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "fieldlistdto")
public class FieldListDto   {

    @XmlElement(name = "fields",type = FieldDto.class)
    private List<FieldDto> fields = new ArrayList<FieldDto>();

    public List<FieldDto> getFieldList()   {
        return this.fields;
    }

    public void addFieldList(List<FieldDto> fields)   {
        this.fields.addAll(fields);
    }
}