package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;
import java.util.Date;

@Entity
@Audited
@Table(name = "MEDS_TRADING_HOUR")
public class TradingHourEntity    {

    private Long tradingHourId;
    private Date effFrm;
    private Date effTo;
    private Date breakAEffFrm;
    private Date breakAEffTo;
    private Date breakBEffFrm;
    private Date breakBEffTo;
    private Boolean open;
    private List<TradingDayEntity> tradingDayMondays;
    private List<TradingDayEntity> tradingDayTuesdays;
    private List<TradingDayEntity> tradingDayWednesdays;
    private List<TradingDayEntity> tradingDayThursdays;
    private List<TradingDayEntity> tradingDayFridays;
    private List<TradingDayEntity> tradingDaySaturdays;
    private List<TradingDayEntity> tradingDaySundays;
    private List<TradingDayEntity> tradingDayPubicHolidays;


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
    @Column(name="EFF_FRM" , length=0 , nullable=true)
    public Date getEffFrm()   {
        return this.effFrm;
    }

    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }

    @Basic
    @Column(name="EFF_TO" , length=0 , nullable=true)
    public Date getEffTo()   {
        return this.effTo;
    }

    public void setEffTo(Date effTo)   {
        this.effTo = effTo;
    }

    @Basic
    @Column(name="BREAK_A_EFF_FRM" , length=0 , nullable=true)
    public Date getBreakAEffFrm()   {
        return this.breakAEffFrm;
    }

    public void setBreakAEffFrm(Date breakAEffFrm)   {
        this.breakAEffFrm = breakAEffFrm;
    }

    @Basic
    @Column(name="BREAK_A_EFF_TO" , length=0 , nullable=true)
    public Date getBreakAEffTo()   {
        return this.breakAEffTo;
    }

    public void setBreakAEffTo(Date breakAEffTo)   {
        this.breakAEffTo = breakAEffTo;
    }

    @Basic
    @Column(name="BREAK_B_EFF_FRM" , length=0 , nullable=true)
    public Date getBreakBEffFrm()   {
        return this.breakBEffFrm;
    }

    public void setBreakBEffFrm(Date breakBEffFrm)   {
        this.breakBEffFrm = breakBEffFrm;
    }

    @Basic
    @Column(name="BREAK_B_EFF_TO" , length=0 , nullable=true)
    public Date getBreakBEffTo()   {
        return this.breakBEffTo;
    }

    public void setBreakBEffTo(Date breakBEffTo)   {
        this.breakBEffTo = breakBEffTo;
    }

    @Basic
    @Column(name="OPEN" , length=0 , nullable=false)
    public Boolean getOpen()   {
        return this.open;
    }

    public void setOpen(Boolean open)   {
        this.open = open;
    }


    @OneToMany(mappedBy = "monday", fetch = FetchType.LAZY)
    public List<TradingDayEntity> getTradingDayMondays()   {
        return this.tradingDayMondays;
    }

    public void setTradingDayMondays(List<TradingDayEntity> tradingDayMondays)   {
    this.tradingDayMondays = tradingDayMondays;
    }

    @OneToMany(mappedBy = "tuesday", fetch = FetchType.LAZY)
    public List<TradingDayEntity> getTradingDayTuesdays()   {
        return this.tradingDayTuesdays;
    }

    public void setTradingDayTuesdays(List<TradingDayEntity> tradingDayTuesdays)   {
    this.tradingDayTuesdays = tradingDayTuesdays;
    }

    @OneToMany(mappedBy = "wednesday", fetch = FetchType.LAZY)
    public List<TradingDayEntity> getTradingDayWednesdays()   {
        return this.tradingDayWednesdays;
    }

    public void setTradingDayWednesdays(List<TradingDayEntity> tradingDayWednesdays)   {
    this.tradingDayWednesdays = tradingDayWednesdays;
    }

    @OneToMany(mappedBy = "thursday", fetch = FetchType.LAZY)
    public List<TradingDayEntity> getTradingDayThursdays()   {
        return this.tradingDayThursdays;
    }

    public void setTradingDayThursdays(List<TradingDayEntity> tradingDayThursdays)   {
    this.tradingDayThursdays = tradingDayThursdays;
    }

    @OneToMany(mappedBy = "friday", fetch = FetchType.LAZY)
    public List<TradingDayEntity> getTradingDayFridays()   {
        return this.tradingDayFridays;
    }

    public void setTradingDayFridays(List<TradingDayEntity> tradingDayFridays)   {
    this.tradingDayFridays = tradingDayFridays;
    }

    @OneToMany(mappedBy = "saturday", fetch = FetchType.LAZY)
    public List<TradingDayEntity> getTradingDaySaturdays()   {
        return this.tradingDaySaturdays;
    }

    public void setTradingDaySaturdays(List<TradingDayEntity> tradingDaySaturdays)   {
    this.tradingDaySaturdays = tradingDaySaturdays;
    }

    @OneToMany(mappedBy = "sunday", fetch = FetchType.LAZY)
    public List<TradingDayEntity> getTradingDaySundays()   {
        return this.tradingDaySundays;
    }

    public void setTradingDaySundays(List<TradingDayEntity> tradingDaySundays)   {
    this.tradingDaySundays = tradingDaySundays;
    }

    @OneToMany(mappedBy = "pubicHoliday", fetch = FetchType.LAZY)
    public List<TradingDayEntity> getTradingDayPubicHolidays()   {
        return this.tradingDayPubicHolidays;
    }

    public void setTradingDayPubicHolidays(List<TradingDayEntity> tradingDayPubicHolidays)   {
    this.tradingDayPubicHolidays = tradingDayPubicHolidays;
    }

}