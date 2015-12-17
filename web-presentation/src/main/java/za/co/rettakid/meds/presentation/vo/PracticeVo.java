package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.Date;

public class PracticeVo    {

    private Long practiceId;
    private String name;
    @NotBlank @NotNull
    private String email;
    @NotNull
    private Float longitude;
    @NotNull
    private Float latitude;
    @NotBlank @NotNull
    private String address;
    @Valid
    @NotNull
    private TradingDayVo tradingDay;
    private String phone;
    private Float fee;
    private ImageVo image;
    @Valid
    @NotNull
    private DataContentVo bio;
    private Date effFrm;
    private Date effTo;

    public Long getPracticeId()   {
        return this.practiceId;
    }

    public void setPracticeId(Long practiceId)   {
        this.practiceId = practiceId;
    }

    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

    public String getEmail()   {
        return this.email;
    }

    public void setEmail(String email)   {
        this.email = email;
    }

    public Float getLongitude()   {
        return this.longitude;
    }

    public void setLongitude(Float longitude)   {
        this.longitude = longitude;
    }

    public Float getLatitude()   {
        return this.latitude;
    }

    public void setLatitude(Float latitude)   {
        this.latitude = latitude;
    }

    public String getAddress()   {
        return this.address;
    }

    public void setAddress(String address)   {
        this.address = address;
    }

    public TradingDayVo getTradingDay()   {
        return this.tradingDay;
    }

    public void setTradingDay(TradingDayVo tradingDay)   {
        this.tradingDay = tradingDay;
    }

    public String getPhone()   {
        return this.phone;
    }

    public void setPhone(String phone)   {
        this.phone = phone;
    }

    public Float getFee()   {
        return this.fee;
    }

    public void setFee(Float fee)   {
        this.fee = fee;
    }

    public ImageVo getImage()   {
        return this.image;
    }

    public void setImage(ImageVo image)   {
        this.image = image;
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