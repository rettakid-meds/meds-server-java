package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "doctorpracticedto")
public class DoctorPracticeDto    {

    private Long medsDoctorPracticeId;
    private PracticeDto practice;
    private DoctorDto doctor;

    public Long getMedsDoctorPracticeId()   {
        return this.medsDoctorPracticeId;
    }

    @XmlElement(name = "medsdoctorpracticeid" , required = false)
    public void setMedsDoctorPracticeId(Long medsDoctorPracticeId)   {
        this.medsDoctorPracticeId = medsDoctorPracticeId;
    }

    public PracticeDto getPractice()   {
        return this.practice;
    }

    @XmlElement(name = "practicedto")
    public void setPractice(PracticeDto practice)   {
        this.practice = practice;
    }

    public DoctorDto getDoctor()   {
        return this.doctor;
    }

    @XmlElement(name = "doctordto")
    public void setDoctor(DoctorDto doctor)   {
        this.doctor = doctor;
    }


}