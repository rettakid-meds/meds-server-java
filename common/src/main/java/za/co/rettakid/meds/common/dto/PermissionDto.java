package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "permissiondto")
public class PermissionDto    {

    private Long permissionId;
    private String permissionName;

    public Long getPermissionId()   {
        return this.permissionId;
    }

    @XmlElement(name = "permissionid" , required = false)
    public void setPermissionId(Long permissionId)   {
        this.permissionId = permissionId;
    }

    public String getPermissionName()   {
        return this.permissionName;
    }

    @XmlElement(name = "permissionname")
    public void setPermissionName(String permissionName)   {
        this.permissionName = permissionName;
    }

}