package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "doctorfielddto")
public class DoctorFieldDto    {

    private Long doctorFieldId;
    private FieldDto field;
    private DoctorDto doctor;

    public Long getDoctorFieldId()   {
        return this.doctorFieldId;
    }

    @XmlElement(name = "doctorfieldid" , required = false)
    public void setDoctorFieldId(Long doctorFieldId)   {
        this.doctorFieldId = doctorFieldId;
    }

    public FieldDto getField()   {
        return this.field;
    }

    @XmlElement(name = "fielddto")
    public void setField(FieldDto field)   {
        this.field = field;
    }

    public DoctorDto getDoctor()   {
        return this.doctor;
    }

    @XmlElement(name = "doctordto")
    public void setDoctor(DoctorDto doctor)   {
        this.doctor = doctor;
    }

}