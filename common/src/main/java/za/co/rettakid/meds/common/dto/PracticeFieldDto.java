package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "practicefielddto")
public class PracticeFieldDto    {

    private Long practiceFieldId;
    private FieldDto field;
    private PracticeDto practice;

    public Long getPracticeFieldId()   {
        return this.practiceFieldId;
    }

    @XmlElement(name = "practicefieldid" , required = false)
    public void setPracticeFieldId(Long practiceFieldId)   {
        this.practiceFieldId = practiceFieldId;
    }

    public FieldDto getField()   {
        return this.field;
    }

    @XmlElement(name = "fielddto")
    public void setField(FieldDto field)   {
        this.field = field;
    }

    public PracticeDto getPractice()   {
        return this.practice;
    }

    @XmlElement(name = "practicedto")
    public void setPractice(PracticeDto practice)   {
        this.practice = practice;
    }


}