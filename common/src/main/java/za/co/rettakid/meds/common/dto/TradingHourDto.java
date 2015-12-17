package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

@XmlRootElement(name = "tradinghourdto")
public class TradingHourDto    {

    private Long tradingHourId;
    private Date effFrm;
    private Date effTo;
    private Date breakAEffFrm;
    private Date breakAEffTo;
    private Date breakBEffFrm;
    private Date breakBEffTo;
    private Boolean open;
    private TradingDayListDto tradingDayMondays;
    private TradingDayListDto tradingDayTuesdays;
    private TradingDayListDto tradingDayWednesdays;
    private TradingDayListDto tradingDayThursdays;
    private TradingDayListDto tradingDayFridays;
    private TradingDayListDto tradingDaySaturdays;
    private TradingDayListDto tradingDaySundays;
    private TradingDayListDto tradingDayPubicHolidays;

    public Long getTradingHourId()   {
        return this.tradingHourId;
    }

    @XmlElement(name = "tradinghourid" , required = false)
    public void setTradingHourId(Long tradingHourId)   {
        this.tradingHourId = tradingHourId;
    }

    public Date getEffFrm()   {
        return this.effFrm;
    }

    @XmlElement(name = "efffrm" , required = false)
    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }

    public Date getEffTo()   {
        return this.effTo;
    }

    @XmlElement(name = "effto" , required = false)
    public void setEffTo(Date effTo)   {
        this.effTo = effTo;
    }

    public Date getBreakAEffFrm()   {
        return this.breakAEffFrm;
    }

    @XmlElement(name = "breakaefffrm" , required = false)
    public void setBreakAEffFrm(Date breakAEffFrm)   {
        this.breakAEffFrm = breakAEffFrm;
    }

    public Date getBreakAEffTo()   {
        return this.breakAEffTo;
    }

    @XmlElement(name = "breakaeffto" , required = false)
    public void setBreakAEffTo(Date breakAEffTo)   {
        this.breakAEffTo = breakAEffTo;
    }

    public Date getBreakBEffFrm()   {
        return this.breakBEffFrm;
    }

    @XmlElement(name = "breakbefffrm" , required = false)
    public void setBreakBEffFrm(Date breakBEffFrm)   {
        this.breakBEffFrm = breakBEffFrm;
    }

    public Date getBreakBEffTo()   {
        return this.breakBEffTo;
    }

    @XmlElement(name = "breakbeffto" , required = false)
    public void setBreakBEffTo(Date breakBEffTo)   {
        this.breakBEffTo = breakBEffTo;
    }

    public Boolean getOpen()   {
        return this.open;
    }

    @XmlElement(name = "open")
    public void setOpen(Boolean open)   {
        this.open = open;
    }


    public TradingDayListDto getTradingDayMondays()   {
        return this.tradingDayMondays;
    }

    public void setTradingDayMondays(TradingDayListDto tradingDayMondays)   {
        this.tradingDayMondays = tradingDayMondays;
    }

    public TradingDayListDto getTradingDayTuesdays()   {
        return this.tradingDayTuesdays;
    }

    public void setTradingDayTuesdays(TradingDayListDto tradingDayTuesdays)   {
        this.tradingDayTuesdays = tradingDayTuesdays;
    }

    public TradingDayListDto getTradingDayWednesdays()   {
        return this.tradingDayWednesdays;
    }

    public void setTradingDayWednesdays(TradingDayListDto tradingDayWednesdays)   {
        this.tradingDayWednesdays = tradingDayWednesdays;
    }

    public TradingDayListDto getTradingDayThursdays()   {
        return this.tradingDayThursdays;
    }

    public void setTradingDayThursdays(TradingDayListDto tradingDayThursdays)   {
        this.tradingDayThursdays = tradingDayThursdays;
    }

    public TradingDayListDto getTradingDayFridays()   {
        return this.tradingDayFridays;
    }

    public void setTradingDayFridays(TradingDayListDto tradingDayFridays)   {
        this.tradingDayFridays = tradingDayFridays;
    }

    public TradingDayListDto getTradingDaySaturdays()   {
        return this.tradingDaySaturdays;
    }

    public void setTradingDaySaturdays(TradingDayListDto tradingDaySaturdays)   {
        this.tradingDaySaturdays = tradingDaySaturdays;
    }

    public TradingDayListDto getTradingDaySundays()   {
        return this.tradingDaySundays;
    }

    public void setTradingDaySundays(TradingDayListDto tradingDaySundays)   {
        this.tradingDaySundays = tradingDaySundays;
    }

    public TradingDayListDto getTradingDayPubicHolidays()   {
        return this.tradingDayPubicHolidays;
    }

    public void setTradingDayPubicHolidays(TradingDayListDto tradingDayPubicHolidays)   {
        this.tradingDayPubicHolidays = tradingDayPubicHolidays;
    }

}