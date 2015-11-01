package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.Date;

public class TradingHourVo    {

    private Long tradingHourId;
    private Date effFrm;
    private Date effTo;
    @NotBlank @NotNull
    private Boolean open;

    public Long getTradingHourId()   {
        return this.tradingHourId;
    }

    public void setTradingHourId(Long tradingHourId)   {
        this.tradingHourId = tradingHourId;
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

    public Boolean getOpen()   {
        return this.open;
    }

    public void setOpen(Boolean open)   {
        this.open = open;
    }

}