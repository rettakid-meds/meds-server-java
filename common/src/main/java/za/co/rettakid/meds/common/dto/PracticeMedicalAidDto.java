package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "practicemedicalaiddto")
public class PracticeMedicalAidDto    {

    private Long practiceMedicalAidId;
    private PracticeDto practice;
    private MedicalAidDto medicalAid;

    public Long getPracticeMedicalAidId()   {
        return this.practiceMedicalAidId;
    }

    @XmlElement(name = "practicemedicalaidid" , required = false)
    public void setPracticeMedicalAidId(Long practiceMedicalAidId)   {
        this.practiceMedicalAidId = practiceMedicalAidId;
    }

    public PracticeDto getPractice()   {
        return this.practice;
    }

    @XmlElement(name = "practicedto")
    public void setPractice(PracticeDto practice)   {
        this.practice = practice;
    }

    public MedicalAidDto getMedicalAid()   {
        return this.medicalAid;
    }

    @XmlElement(name = "medicalaiddto")
    public void setMedicalAid(MedicalAidDto medicalAid)   {
        this.medicalAid = medicalAid;
    }


}