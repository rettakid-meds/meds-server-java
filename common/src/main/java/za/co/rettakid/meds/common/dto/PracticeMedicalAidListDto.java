package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "practicemedicalaidlistdto")
public class PracticeMedicalAidListDto   {

    @XmlElementWrapper(name = "practicemedicalaids")
    @XmlElement(name = "practicemedicalaiddto",type = PracticeMedicalAidDto.class)
    private List<PracticeMedicalAidDto> practiceMedicalAids = new ArrayList<PracticeMedicalAidDto>();

    public List<PracticeMedicalAidDto> getPracticeMedicalAidList()   {
        return this.practiceMedicalAids;
    }

    public void addPracticeMedicalAidList(List<PracticeMedicalAidDto> practiceMedicalAids)   {
        this.practiceMedicalAids.addAll(practiceMedicalAids);
    }
}