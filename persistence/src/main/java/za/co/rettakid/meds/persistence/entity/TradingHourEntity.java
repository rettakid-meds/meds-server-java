package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MEDS_TRADING_HOUR")
public class TradingHourEntity    {

    private Long tradingHourId;
    private Date effFrm;
    private Date effTo;
    private Boolean open;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="TRADING_HOUR_ID" , length=15 , nullable=false)
    public Long getTradingHourId()   {
        return this.tradingHourId;
    }

    public void setTradingHourId(Long tradingHourId)   {
        this.tradingHourId = tradingHourId;
    }

    @Basic
    @Column(name="EFF_FRM" , nullable=true)
    public Date getEffFrm()   {
        return this.effFrm;
    }

    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }

    @Basic
    @Column(name="EFF_TO" , nullable=true)
    public Date getEffTo()   {
        return this.effTo;
    }

    public void setEffTo(Date effTo)   {
        this.effTo = effTo;
    }

    @Basic
    @Column(name="OPEN" , nullable=false)
    public Boolean getOpen()   {
        return this.open;
    }

    public void setOpen(Boolean open)   {
        this.open = open;
    }

}