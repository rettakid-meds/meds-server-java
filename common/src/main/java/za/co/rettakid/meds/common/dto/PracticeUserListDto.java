package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "practiceuserlistdto")
public class PracticeUserListDto   {

    @XmlElementWrapper(name = "practiceusers")
    @XmlElement(name = "practiceuserdto",type = PracticeUserDto.class)
    private List<PracticeUserDto> practiceUsers = new ArrayList<PracticeUserDto>();

    public List<PracticeUserDto> getPracticeUserList()   {
        return this.practiceUsers;
    }

    public void addPracticeUserList(List<PracticeUserDto> practiceUsers)   {
        this.practiceUsers.addAll(practiceUsers);
    }
}