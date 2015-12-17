package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "MEDS_TRADING_DAY")
public class TradingDayEntity    {

    private Long tradingDayId;
    private TradingHourEntity monday;
    private TradingHourEntity tuesday;
    private TradingHourEntity wednesday;
    private TradingHourEntity thursday;
    private TradingHourEntity friday;
    private TradingHourEntity saturday;
    private TradingHourEntity sunday;
    private TradingHourEntity pubicHoliday;
    private List<PracticeEntity> practiceTradingDays;
    private List<DoctorEntity> doctorTradingDays;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="TRADING_DAY_ID" , length=15 , nullable=false)
    public Long getTradingDayId()   {
        return this.tradingDayId;
    }

    public void setTradingDayId(Long tradingDayId)   {
        this.tradingDayId = tradingDayId;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MONDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getMonday()   {
        return this.monday;
    }

    public void setMonday(TradingHourEntity monday)   {
        this.monday = monday;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TUESDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getTuesday()   {
        return this.tuesday;
    }

    public void setTuesday(TradingHourEntity tuesday)   {
        this.tuesday = tuesday;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="WEDNESDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getWednesday()   {
        return this.wednesday;
    }

    public void setWednesday(TradingHourEntity wednesday)   {
        this.wednesday = wednesday;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="THURSDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getThursday()   {
        return this.thursday;
    }

    public void setThursday(TradingHourEntity thursday)   {
        this.thursday = thursday;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FRIDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getFriday()   {
        return this.friday;
    }

    public void setFriday(TradingHourEntity friday)   {
        this.friday = friday;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SATURDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getSaturday()   {
        return this.saturday;
    }

    public void setSaturday(TradingHourEntity saturday)   {
        this.saturday = saturday;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SUNDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getSunday()   {
        return this.sunday;
    }

    public void setSunday(TradingHourEntity sunday)   {
        this.sunday = sunday;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PUBIC_HOLIDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getPubicHoliday()   {
        return this.pubicHoliday;
    }

    public void setPubicHoliday(TradingHourEntity pubicHoliday)   {
        this.pubicHoliday = pubicHoliday;
    }


    @OneToMany(mappedBy = "tradingDay", fetch = FetchType.LAZY)
    public List<PracticeEntity> getPracticeTradingDays()   {
        return this.practiceTradingDays;
    }

    public void setPracticeTradingDays(List<PracticeEntity> practiceTradingDays)   {
    this.practiceTradingDays = practiceTradingDays;
    }

    @OneToMany(mappedBy = "tradingDay", fetch = FetchType.LAZY)
    public List<DoctorEntity> getDoctorTradingDays()   {
        return this.doctorTradingDays;
    }

    public void setDoctorTradingDays(List<DoctorEntity> doctorTradingDays)   {
    this.doctorTradingDays = doctorTradingDays;
    }

}