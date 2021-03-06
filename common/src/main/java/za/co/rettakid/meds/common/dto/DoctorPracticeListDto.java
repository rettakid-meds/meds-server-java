package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "doctorpracticelistdto")
public class DoctorPracticeListDto   {

    @XmlElement(name = "doctorpractices",type = DoctorPracticeDto.class)
    private List<DoctorPracticeDto> doctorPractices = new ArrayList<DoctorPracticeDto>();

    public List<DoctorPracticeDto> getDoctorPracticeList()   {
        return this.doctorPractices;
    }

    public void addDoctorPracticeList(List<DoctorPracticeDto> doctorPractices)   {
        this.doctorPractices.addAll(doctorPractices);
    }
}