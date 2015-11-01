package za.co.rettakid.meds.services;

import java.util.Date;
import za.co.rettakid.meds.common.dto.*;

public interface TradingHourService    {

    TradingHourListDto getTradingHours();
    TradingHourDto getTradingHours(Long tradingHourId);
    void postTradingHours(TradingHourDto tradingHourDto);
    void putTradingHours(TradingHourDto tradingHourDto);
    void deleteTradingHours(Long tradingHourId);

}