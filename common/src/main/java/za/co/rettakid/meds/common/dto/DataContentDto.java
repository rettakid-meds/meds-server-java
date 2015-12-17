package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "datacontentdto")
public class DataContentDto    {

    private Long dataContentId;
    private String data;
    private PracticeListDto practiceBios;
    private DoctorListDto doctorBios;
    private AppointmentListDto appointmentNotes;

    public Long getDataContentId()   {
        return this.dataContentId;
    }

    @XmlElement(name = "datacontentid" , required = false)
    public void setDataContentId(Long dataContentId)   {
        this.dataContentId = dataContentId;
    }

    public String getData()   {
        return this.data;
    }

    @XmlElement(name = "data")
    public void setData(String data)   {
        this.data = data;
    }


    public PracticeListDto getPracticeBios()   {
        return this.practiceBios;
    }

    public void setPracticeBios(PracticeListDto practiceBios)   {
        this.practiceBios = practiceBios;
    }

    public DoctorListDto getDoctorBios()   {
        return this.doctorBios;
    }

    public void setDoctorBios(DoctorListDto doctorBios)   {
        this.doctorBios = doctorBios;
    }

    public AppointmentListDto getAppointmentNotes()   {
        return this.appointmentNotes;
    }

    public void setAppointmentNotes(AppointmentListDto appointmentNotes)   {
        this.appointmentNotes = appointmentNotes;
    }

}