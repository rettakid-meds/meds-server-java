package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.Date;

public class FileVo    {

    private Long fileId;
    @NotBlank @NotNull
    private String guid;
    @NotBlank @NotNull
    private String name;
    @NotNull
    private Date effFrm;

    public Long getFileId()   {
        return this.fileId;
    }

    public void setFileId(Long fileId)   {
        this.fileId = fileId;
    }

    public String getGuid()   {
        return this.guid;
    }

    public void setGuid(String guid)   {
        this.guid = guid;
    }

    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

    public Date getEffFrm()   {
        return this.effFrm;
    }

    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }

}