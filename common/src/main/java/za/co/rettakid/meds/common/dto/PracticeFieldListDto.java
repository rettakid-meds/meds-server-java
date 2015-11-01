package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "practicefieldlistdto")
public class PracticeFieldListDto   {

    @XmlElementWrapper(name = "practicefields")
    @XmlElement(name = "practicefielddto",type = PracticeFieldDto.class)
    private List<PracticeFieldDto> practiceFields = new ArrayList<PracticeFieldDto>();

    public List<PracticeFieldDto> getPracticeFieldList()   {
        return this.practiceFields;
    }

    public void addPracticeFieldList(List<PracticeFieldDto> practiceFields)   {
        this.practiceFields.addAll(practiceFields);
    }
}