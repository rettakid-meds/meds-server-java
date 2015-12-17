package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "doctoruserlistdto")
public class DoctorUserListDto   {

    @XmlElementWrapper(name = "doctorusers")
    @XmlElement(name = "doctoruserdto",type = DoctorUserDto.class)
    private List<DoctorUserDto> doctorUsers = new ArrayList<DoctorUserDto>();

    public List<DoctorUserDto> getDoctorUserList()   {
        return this.doctorUsers;
    }

    public void addDoctorUserList(List<DoctorUserDto> doctorUsers)   {
        this.doctorUsers.addAll(doctorUsers);
    }
}