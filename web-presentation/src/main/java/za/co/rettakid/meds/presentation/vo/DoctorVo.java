package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.Date;

public class DoctorVo    {

    private Long doctorId;
    @Valid
    @NotNull
    private UserVo user;
    @Valid
    @NotNull
    private ImageVo icon;
    @Valid
    @NotNull
    private ImageVo image;
    @Valid
    @NotNull
    private TradingDayVo tradingDay;
    @Valid
    @NotNull
    private DataContentVo bio;
    @NotNull
    private Date effFrm;
    @NotNull
    private Date effTo;

    public Long getDoctorId()   {
        return this.doctorId;
    }

    public void setDoctorId(Long doctorId)   {
        this.doctorId = doctorId;
    }

    public UserVo getUser()   {
        return this.user;
    }

    public void setUser(UserVo user)   {
        this.user = user;
    }

    public ImageVo getIcon()   {
        return this.icon;
    }

    public void setIcon(ImageVo icon)   {
        this.icon = icon;
    }

    public ImageVo getImage()   {
        return this.image;
    }

    public void setImage(ImageVo image)   {
        this.image = image;
    }

    public TradingDayVo getTradingDay()   {
        return this.tradingDay;
    }

    public void setTradingDay(TradingDayVo tradingDay)   {
        this.tradingDay = tradingDay;
    }

    public DataContentVo getBio()   {
        return this.bio;
    }

    public void setBio(DataContentVo bio)   {
        this.bio = bio;
    }

    public Date getEffFrm()   {
        return this.effFrm;
    }

    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }

    public Date getEffTo()   {
        return this.effTo;
    }

    public void setEffTo(Date effTo)   {
        this.effTo = effTo;
    }

}