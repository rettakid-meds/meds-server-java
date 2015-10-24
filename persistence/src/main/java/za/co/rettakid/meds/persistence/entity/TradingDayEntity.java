package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_TRADING_DAY")
public class TradingDayEntity    {

    private Long tradingDayId;
    private TradingHourEntity mondayEntity;
    private TradingHourEntity tuesdayEntity;
    private TradingHourEntity wednesdayEntity;
    private TradingHourEntity thursdayEntity;
    private TradingHourEntity fridayEntity;
    private TradingHourEntity saturdayEntity;
    private TradingHourEntity sundayEntity;
    private TradingHourEntity pubicHolidayEntity;


    @Id
    @GeneratedValue
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
    public TradingHourEntity getMondayEntity()   {
        return this.mondayEntity;
    }

    public void setMondayEntity(TradingHourEntity mondayEntity)   {
        this.mondayEntity = mondayEntity;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TUESDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getTuesdayEntity()   {
        return this.tuesdayEntity;
    }

    public void setTuesdayEntity(TradingHourEntity tuesdayEntity)   {
        this.tuesdayEntity = tuesdayEntity;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="WEDNESDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getWednesdayEntity()   {
        return this.wednesdayEntity;
    }

    public void setWednesdayEntity(TradingHourEntity wednesdayEntity)   {
        this.wednesdayEntity = wednesdayEntity;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="THURSDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getThursdayEntity()   {
        return this.thursdayEntity;
    }

    public void setThursdayEntity(TradingHourEntity thursdayEntity)   {
        this.thursdayEntity = thursdayEntity;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FRIDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getFridayEntity()   {
        return this.fridayEntity;
    }

    public void setFridayEntity(TradingHourEntity fridayEntity)   {
        this.fridayEntity = fridayEntity;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SATURDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getSaturdayEntity()   {
        return this.saturdayEntity;
    }

    public void setSaturdayEntity(TradingHourEntity saturdayEntity)   {
        this.saturdayEntity = saturdayEntity;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SUNDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getSundayEntity()   {
        return this.sundayEntity;
    }

    public void setSundayEntity(TradingHourEntity sundayEntity)   {
        this.sundayEntity = sundayEntity;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PUBIC_HOLIDAY_ID", referencedColumnName="TRADING_HOUR_ID")
    public TradingHourEntity getPubicHolidayEntity()   {
        return this.pubicHolidayEntity;
    }

    public void setPubicHolidayEntity(TradingHourEntity pubicHolidayEntity)   {
        this.pubicHolidayEntity = pubicHolidayEntity;
    }

}