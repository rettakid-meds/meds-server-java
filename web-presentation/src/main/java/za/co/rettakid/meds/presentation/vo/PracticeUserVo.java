package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class PracticeUserVo    {

    private Long practiceUserId;
    @Valid
    @NotNull
    private UserVo user;
    @Valid
    @NotNull
    private PracticeVo practice;

    public Long getPracticeUserId()   {
        return this.practiceUserId;
    }

    public void setPracticeUserId(Long practiceUserId)   {
        this.practiceUserId = practiceUserId;
    }

    public UserVo getUser()   {
        return this.user;
    }

    public void setUser(UserVo user)   {
        this.user = user;
    }

    public PracticeVo getPractice()   {
        return this.practice;
    }

    public void setPractice(PracticeVo practice)   {
        this.practice = practice;
    }

}