package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.Date;

public class TradingHourVo    {

    private Long tradingHourId;
    private Date effFrm;
    private Date effTo;
    private Date breakAEffFrm;
    private Date breakAEffTo;
    private Date breakBEffFrm;
    private Date breakBEffTo;
    @NotNull
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

    public Date getBreakAEffFrm()   {
        return this.breakAEffFrm;
    }

    public void setBreakAEffFrm(Date breakAEffFrm)   {
        this.breakAEffFrm = breakAEffFrm;
    }

    public Date getBreakAEffTo()   {
        return this.breakAEffTo;
    }

    public void setBreakAEffTo(Date breakAEffTo)   {
        this.breakAEffTo = breakAEffTo;
    }

    public Date getBreakBEffFrm()   {
        return this.breakBEffFrm;
    }

    public void setBreakBEffFrm(Date breakBEffFrm)   {
        this.breakBEffFrm = breakBEffFrm;
    }

    public Date getBreakBEffTo()   {
        return this.breakBEffTo;
    }

    public void setBreakBEffTo(Date breakBEffTo)   {
        this.breakBEffTo = breakBEffTo;
    }

    public Boolean getOpen()   {
        return this.open;
    }

    public void setOpen(Boolean open)   {
        this.open = open;
    }

}