package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class TradingDayVo    {

    private Long tradingDayId;
    @Valid
    @NotBlank @NotNull
    private TradingHourVo monday;
    @Valid
    @NotBlank @NotNull
    private TradingHourVo tuesday;
    @Valid
    @NotBlank @NotNull
    private TradingHourVo wednesday;
    @Valid
    @NotBlank @NotNull
    private TradingHourVo thursday;
    @Valid
    @NotBlank @NotNull
    private TradingHourVo friday;
    @Valid
    @NotBlank @NotNull
    private TradingHourVo saturday;
    @Valid
    @NotBlank @NotNull
    private TradingHourVo sunday;
    @Valid
    @NotBlank @NotNull
    private TradingHourVo pubicHoliday;

    public Long getTradingDayId()   {
        return this.tradingDayId;
    }

    public void setTradingDayId(Long tradingDayId)   {
        this.tradingDayId = tradingDayId;
    }

    public TradingHourVo getMonday()   {
        return this.monday;
    }

    public void setMonday(TradingHourVo monday)   {
        this.monday = monday;
    }

    public TradingHourVo getTuesday()   {
        return this.tuesday;
    }

    public void setTuesday(TradingHourVo tuesday)   {
        this.tuesday = tuesday;
    }

    public TradingHourVo getWednesday()   {
        return this.wednesday;
    }

    public void setWednesday(TradingHourVo wednesday)   {
        this.wednesday = wednesday;
    }

    public TradingHourVo getThursday()   {
        return this.thursday;
    }

    public void setThursday(TradingHourVo thursday)   {
        this.thursday = thursday;
    }

    public TradingHourVo getFriday()   {
        return this.friday;
    }

    public void setFriday(TradingHourVo friday)   {
        this.friday = friday;
    }

    public TradingHourVo getSaturday()   {
        return this.saturday;
    }

    public void setSaturday(TradingHourVo saturday)   {
        this.saturday = saturday;
    }

    public TradingHourVo getSunday()   {
        return this.sunday;
    }

    public void setSunday(TradingHourVo sunday)   {
        this.sunday = sunday;
    }

    public TradingHourVo getPubicHoliday()   {
        return this.pubicHoliday;
    }

    public void setPubicHoliday(TradingHourVo pubicHoliday)   {
        this.pubicHoliday = pubicHoliday;
    }

}