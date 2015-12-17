package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

@XmlRootElement(name = "prescriptiondto")
public class PrescriptionDto    {

    private Long prescriptionId;
    private AppointmentDto appointment;
    private DoctorDto doctor;
    private UserDto user;
    private FileDto file;
    private Date effFrm;
    private Date effTo;
    private PrescriptionItemListDto prescriptionItemPrescriptions;

    public Long getPrescriptionId()   {
        return this.prescriptionId;
    }

    @XmlElement(name = "prescriptionid" , required = false)
    public void setPrescriptionId(Long prescriptionId)   {
        this.prescriptionId = prescriptionId;
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

    public UserDto getUser()   {
        return this.user;
    }

    @XmlElement(name = "userdto")
    public void setUser(UserDto user)   {
        this.user = user;
    }

    public FileDto getFile()   {
        return this.file;
    }

    @XmlElement(name = "filedto")
    public void setFile(FileDto file)   {
        this.file = file;
    }

    public Date getEffFrm()   {
        return this.effFrm;
    }

    @XmlElement(name = "efffrm")
    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }

    public Date getEffTo()   {
        return this.effTo;
    }

    @XmlElement(name = "effto")
    public void setEffTo(Date effTo)   {
        this.effTo = effTo;
    }


    public PrescriptionItemListDto getPrescriptionItemPrescriptions()   {
        return this.prescriptionItemPrescriptions;
    }

    public void setPrescriptionItemPrescriptions(PrescriptionItemListDto prescriptionItemPrescriptions)   {
        this.prescriptionItemPrescriptions = prescriptionItemPrescriptions;
    }

}