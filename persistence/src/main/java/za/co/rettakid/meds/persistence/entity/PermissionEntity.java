package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_PERMISSION")
public class PermissionEntity    {

    private Long permissionId;
    private String permissionName;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="PERMISSION_ID" , length=15 , nullable=false)
    public Long getPermissionId()   {
        return this.permissionId;
    }

    public void setPermissionId(Long permissionId)   {
        this.permissionId = permissionId;
    }

    @Basic
    @Column(name="PERMISSION_NAME" , length=50 , nullable=false)
    public String getPermissionName()   {
        return this.permissionName;
    }

    public void setPermissionName(String permissionName)   {
        this.permissionName = permissionName;
    }

}