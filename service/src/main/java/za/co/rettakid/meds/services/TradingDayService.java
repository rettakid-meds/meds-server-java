package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

import java.util.Date;

public interface TradingDayService    {

    TradingDayListDto getTradingDays();

    Boolean isAvailable(Long tradingDayId, Date dateFrm, Date dateTo);

    TradingDayDto getTradingDays(Long tradingDayId);
    TradingDayDto postTradingDays(TradingDayDto tradingDayDto);
    void putTradingDays(TradingDayDto tradingDayDto);
    void deleteTradingDays(Long tradingDayId);

}