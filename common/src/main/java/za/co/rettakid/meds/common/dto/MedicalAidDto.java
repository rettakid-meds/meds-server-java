package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "medicalaiddto")
public class MedicalAidDto    {

    private Long medicalAidId;
    private Long medicalAidName;
    private UserMedicalAidListDto userMedicalAidMedicalAids;
    private PracticeMedicalAidListDto practiceMedicalAidMedicalAids;

    public Long getMedicalAidId()   {
        return this.medicalAidId;
    }

    @XmlElement(name = "medicalaidid" , required = false)
    public void setMedicalAidId(Long medicalAidId)   {
        this.medicalAidId = medicalAidId;
    }

    public Long getMedicalAidName()   {
        return this.medicalAidName;
    }

    @XmlElement(name = "medicalaidname")
    public void setMedicalAidName(Long medicalAidName)   {
        this.medicalAidName = medicalAidName;
    }


    public UserMedicalAidListDto getUserMedicalAidMedicalAids()   {
        return this.userMedicalAidMedicalAids;
    }

    public void setUserMedicalAidMedicalAids(UserMedicalAidListDto userMedicalAidMedicalAids)   {
        this.userMedicalAidMedicalAids = userMedicalAidMedicalAids;
    }

    public PracticeMedicalAidListDto getPracticeMedicalAidMedicalAids()   {
        return this.practiceMedicalAidMedicalAids;
    }

    public void setPracticeMedicalAidMedicalAids(PracticeMedicalAidListDto practiceMedicalAidMedicalAids)   {
        this.practiceMedicalAidMedicalAids = practiceMedicalAidMedicalAids;
    }

}