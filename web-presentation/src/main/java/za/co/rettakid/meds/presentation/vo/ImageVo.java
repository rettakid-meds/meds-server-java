package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class ImageVo    {

    private Long imageId;
    @Valid
    @NotBlank @NotNull
    private FileVo file;
    @NotBlank @NotNull
    private Integer width;
    @NotBlank @NotNull
    private Integer height;

    public Long getImageId()   {
        return this.imageId;
    }

    public void setImageId(Long imageId)   {
        this.imageId = imageId;
    }

    public FileVo getFile()   {
        return this.file;
    }

    public void setFile(FileVo file)   {
        this.file = file;
    }

    public Integer getWidth()   {
        return this.width;
    }

    public void setWidth(Integer width)   {
        this.width = width;
    }

    public Integer getHeight()   {
        return this.height;
    }

    public void setHeight(Integer height)   {
        this.height = height;
    }

}