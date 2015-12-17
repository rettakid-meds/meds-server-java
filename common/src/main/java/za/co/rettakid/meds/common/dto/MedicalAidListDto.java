package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "medicalaidlistdto")
public class MedicalAidListDto   {

    @XmlElementWrapper(name = "medicalaids")
    @XmlElement(name = "medicalaiddto",type = MedicalAidDto.class)
    private List<MedicalAidDto> medicalAids = new ArrayList<MedicalAidDto>();

    public List<MedicalAidDto> getMedicalAidList()   {
        return this.medicalAids;
    }

    public void addMedicalAidList(List<MedicalAidDto> medicalAids)   {
        this.medicalAids.addAll(medicalAids);
    }
}