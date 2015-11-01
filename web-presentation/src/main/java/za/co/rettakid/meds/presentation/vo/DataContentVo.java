package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class DataContentVo    {

    private Long dataContentId;
    @NotBlank @NotNull
    private String data;

    public Long getDataContentId()   {
        return this.dataContentId;
    }

    public void setDataContentId(Long dataContentId)   {
        this.dataContentId = dataContentId;
    }

    public String getData()   {
        return this.data;
    }

    public void setData(String data)   {
        this.data = data;
    }

}