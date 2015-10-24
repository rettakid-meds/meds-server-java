package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "userlistdto")
public class UserListDto   {

    @XmlElement(name = "users",type = UserDto.class)
    private List<UserDto> users = new ArrayList<UserDto>();

    public List<UserDto> getUserList()   {
        return this.users;
    }

    public void addUserList(List<UserDto> users)   {
        this.users.addAll(users);
    }
}