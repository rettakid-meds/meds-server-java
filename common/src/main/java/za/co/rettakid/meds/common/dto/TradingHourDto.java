package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

@XmlRootElement(name = "tradinghourdto")
public class TradingHourDto    {

    private Long tradingHourId;
    private Date effFrm;
    private Date effTo;
    private Boolean open;

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

    public Boolean getOpen()   {
        return this.open;
    }

    @XmlElement(name = "open")
    public void setOpen(Boolean open)   {
        this.open = open;
    }

}