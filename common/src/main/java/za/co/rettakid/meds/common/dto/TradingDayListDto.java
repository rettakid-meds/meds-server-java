package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "tradingdaylistdto")
public class TradingDayListDto   {

    @XmlElement(name = "tradingdays",type = TradingDayDto.class)
    private List<TradingDayDto> tradingDays = new ArrayList<TradingDayDto>();

    public List<TradingDayDto> getTradingDayList()   {
        return this.tradingDays;
    }

    public void addTradingDayList(List<TradingDayDto> tradingDays)   {
        this.tradingDays.addAll(tradingDays);
    }
}