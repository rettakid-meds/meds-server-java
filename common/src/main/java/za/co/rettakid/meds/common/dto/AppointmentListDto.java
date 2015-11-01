package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@XmlRootElement(name = "appointmentlistdto")
public class AppointmentListDto   {

    @XmlElementWrapper(name = "appointments")
    @XmlElement(name = "appointmentdto",type = AppointmentDto.class)
    private List<AppointmentDto> appointments = new ArrayList<AppointmentDto>();

    public List<AppointmentDto> getAppointmentList()   {
        return this.appointments;
    }

    public void addAppointmentList(List<AppointmentDto> appointments)   {
        this.appointments.addAll(appointments);
    }
}