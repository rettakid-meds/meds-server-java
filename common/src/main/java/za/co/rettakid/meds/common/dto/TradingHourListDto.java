package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@XmlRootElement(name = "tradinghourlistdto")
public class TradingHourListDto   {

    @XmlElementWrapper(name = "tradinghours")
    @XmlElement(name = "tradinghourdto",type = TradingHourDto.class)
    private List<TradingHourDto> tradingHours = new ArrayList<TradingHourDto>();

    public List<TradingHourDto> getTradingHourList()   {
        return this.tradingHours;
    }

    public void addTradingHourList(List<TradingHourDto> tradingHours)   {
        this.tradingHours.addAll(tradingHours);
    }
}