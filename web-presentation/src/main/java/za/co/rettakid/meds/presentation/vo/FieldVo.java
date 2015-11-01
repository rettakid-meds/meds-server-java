package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class FieldVo    {

    private Long fieldId;
    @NotBlank @NotNull
    private String name;
    @NotBlank @NotNull
    private String mapColor;

    public Long getFieldId()   {
        return this.fieldId;
    }

    public void setFieldId(Long fieldId)   {
        this.fieldId = fieldId;
    }

    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

    public String getMapColor()   {
        return this.mapColor;
    }

    public void setMapColor(String mapColor)   {
        this.mapColor = mapColor;
    }

}