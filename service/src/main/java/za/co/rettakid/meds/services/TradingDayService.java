package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface TradingDayService    {

    TradingDayListDto getTradingDays();
    TradingDayDto getTradingDays(Long tradingDayId);
    void postTradingDays(TradingDayDto tradingDayDto);
    void postTradingDays(TradingDayListDto tradingDayListDto);
    void putTradingDays(TradingDayDto tradingDayDto);
    void deleteTradingDays(Long tradingDayId);

}