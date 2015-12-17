package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "usermedicalaidlistdto")
public class UserMedicalAidListDto   {

    @XmlElementWrapper(name = "usermedicalaids")
    @XmlElement(name = "usermedicalaiddto",type = UserMedicalAidDto.class)
    private List<UserMedicalAidDto> userMedicalAids = new ArrayList<UserMedicalAidDto>();

    public List<UserMedicalAidDto> getUserMedicalAidList()   {
        return this.userMedicalAids;
    }

    public void addUserMedicalAidList(List<UserMedicalAidDto> userMedicalAids)   {
        this.userMedicalAids.addAll(userMedicalAids);
    }
}