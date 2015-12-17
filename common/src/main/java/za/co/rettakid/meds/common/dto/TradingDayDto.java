package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "tradingdaydto")
public class TradingDayDto    {

    private Long tradingDayId;
    private TradingHourDto monday;
    private TradingHourDto tuesday;
    private TradingHourDto wednesday;
    private TradingHourDto thursday;
    private TradingHourDto friday;
    private TradingHourDto saturday;
    private TradingHourDto sunday;
    private TradingHourDto pubicHoliday;
    private PracticeListDto practiceTradingDays;
    private DoctorListDto doctorTradingDays;

    public Long getTradingDayId()   {
        return this.tradingDayId;
    }

    @XmlElement(name = "tradingdayid" , required = false)
    public void setTradingDayId(Long tradingDayId)   {
        this.tradingDayId = tradingDayId;
    }

    public TradingHourDto getMonday()   {
        return this.monday;
    }

    @XmlElement(name = "mondaydto")
    public void setMonday(TradingHourDto monday)   {
        this.monday = monday;
    }

    public TradingHourDto getTuesday()   {
        return this.tuesday;
    }

    @XmlElement(name = "tuesdaydto")
    public void setTuesday(TradingHourDto tuesday)   {
        this.tuesday = tuesday;
    }

    public TradingHourDto getWednesday()   {
        return this.wednesday;
    }

    @XmlElement(name = "wednesdaydto")
    public void setWednesday(TradingHourDto wednesday)   {
        this.wednesday = wednesday;
    }

    public TradingHourDto getThursday()   {
        return this.thursday;
    }

    @XmlElement(name = "thursdaydto")
    public void setThursday(TradingHourDto thursday)   {
        this.thursday = thursday;
    }

    public TradingHourDto getFriday()   {
        return this.friday;
    }

    @XmlElement(name = "fridaydto")
    public void setFriday(TradingHourDto friday)   {
        this.friday = friday;
    }

    public TradingHourDto getSaturday()   {
        return this.saturday;
    }

    @XmlElement(name = "saturdaydto")
    public void setSaturday(TradingHourDto saturday)   {
        this.saturday = saturday;
    }

    public TradingHourDto getSunday()   {
        return this.sunday;
    }

    @XmlElement(name = "sundaydto")
    public void setSunday(TradingHourDto sunday)   {
        this.sunday = sunday;
    }

    public TradingHourDto getPubicHoliday()   {
        return this.pubicHoliday;
    }

    @XmlElement(name = "pubicholidaydto")
    public void setPubicHoliday(TradingHourDto pubicHoliday)   {
        this.pubicHoliday = pubicHoliday;
    }


    public PracticeListDto getPracticeTradingDays()   {
        return this.practiceTradingDays;
    }

    public void setPracticeTradingDays(PracticeListDto practiceTradingDays)   {
        this.practiceTradingDays = practiceTradingDays;
    }

    public DoctorListDto getDoctorTradingDays()   {
        return this.doctorTradingDays;
    }

    public void setDoctorTradingDays(DoctorListDto doctorTradingDays)   {
        this.doctorTradingDays = doctorTradingDays;
    }

}