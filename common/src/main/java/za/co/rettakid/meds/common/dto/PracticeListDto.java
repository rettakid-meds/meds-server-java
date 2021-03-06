package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "practicelistdto")
public class PracticeListDto   {

    @XmlElement(name = "practices",type = PracticeDto.class)
    private List<PracticeDto> practices = new ArrayList<PracticeDto>();

    public List<PracticeDto> getPracticeList()   {
        return this.practices;
    }

    public void addPracticeList(List<PracticeDto> practices)   {
        this.practices.addAll(practices);
    }
}