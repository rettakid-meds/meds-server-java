package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "doctorappointmentdto")
public class DoctorAppointmentDto    {

    private Long medsDoctorAppointmentId;
    private AppointmentDto appointment;
    private DoctorDto doctor;

    public Long getMedsDoctorAppointmentId()   {
        return this.medsDoctorAppointmentId;
    }

    @XmlElement(name = "medsdoctorappointmentid" , required = false)
    public void setMedsDoctorAppointmentId(Long medsDoctorAppointmentId)   {
        this.medsDoctorAppointmentId = medsDoctorAppointmentId;
    }

    public AppointmentDto getAppointment()   {
        return this.appointment;
    }

    @XmlElement(name = "appointmentdto")
    public void setAppointment(AppointmentDto appointment)   {
        this.appointment = appointment;
    }

    public DoctorDto getDoctor()   {
        return this.doctor;
    }

    @XmlElement(name = "doctordto")
    public void setDoctor(DoctorDto doctor)   {
        this.doctor = doctor;
    }


}