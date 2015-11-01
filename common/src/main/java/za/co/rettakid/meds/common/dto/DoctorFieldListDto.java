package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "doctorfieldlistdto")
public class DoctorFieldListDto   {

    @XmlElementWrapper(name = "doctorfields")
    @XmlElement(name = "doctorfielddto",type = DoctorFieldDto.class)
    private List<DoctorFieldDto> doctorFields = new ArrayList<DoctorFieldDto>();

    public List<DoctorFieldDto> getDoctorFieldList()   {
        return this.doctorFields;
    }

    public void addDoctorFieldList(List<DoctorFieldDto> doctorFields)   {
        this.doctorFields.addAll(doctorFields);
    }
}