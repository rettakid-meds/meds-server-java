package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@XmlRootElement(name = "doctorlistdto")
public class DoctorListDto   {

    @XmlElementWrapper(name = "doctors")
    @XmlElement(name = "doctordto",type = DoctorDto.class)
    private List<DoctorDto> doctors = new ArrayList<DoctorDto>();

    public List<DoctorDto> getDoctorList()   {
        return this.doctors;
    }

    public void addDoctorList(List<DoctorDto> doctors)   {
        this.doctors.addAll(doctors);
    }
}