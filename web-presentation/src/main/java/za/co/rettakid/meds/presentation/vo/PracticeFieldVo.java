package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class PracticeFieldVo    {

    private Long practiceFieldId;
    @Valid
    @NotNull
    private FieldVo field;
    @Valid
    @NotNull
    private PracticeVo practice;

    public Long getPracticeFieldId()   {
        return this.practiceFieldId;
    }

    public void setPracticeFieldId(Long practiceFieldId)   {
        this.practiceFieldId = practiceFieldId;
    }

    public FieldVo getField()   {
        return this.field;
    }

    public void setField(FieldVo field)   {
        this.field = field;
    }

    public PracticeVo getPractice()   {
        return this.practice;
    }

    public void setPractice(PracticeVo practice)   {
        this.practice = practice;
    }

}