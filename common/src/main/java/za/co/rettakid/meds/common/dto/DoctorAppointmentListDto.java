package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "doctorappointmentlistdto")
public class DoctorAppointmentListDto   {

    @XmlElement(name = "doctorappointments",type = DoctorAppointmentDto.class)
    private List<DoctorAppointmentDto> doctorAppointments = new ArrayList<DoctorAppointmentDto>();

    public List<DoctorAppointmentDto> getDoctorAppointmentList()   {
        return this.doctorAppointments;
    }

    public void addDoctorAppointmentList(List<DoctorAppointmentDto> doctorAppointments)   {
        this.doctorAppointments.addAll(doctorAppointments);
    }
}