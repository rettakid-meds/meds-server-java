package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

@Service
public class TradingDayServiceImpl implements TradingDayService   {

    @Autowired
    private TradingDayDao tradingDayDao;

    @Override
    public TradingDayListDto getTradingDays()  {
        TradingDayListDto tradingDayListDto = new TradingDayListDto();
        tradingDayListDto.addTradingDayList(BindTradingDay.bindTradingDayEntityList(tradingDayDao.read()));
        return tradingDayListDto;
    }
    
    @Override
    public TradingDayDto getTradingDays(Long tradingDayId)  {
        return BindTradingDay.bindTradingDay(tradingDayDao.read(tradingDayId));
    }
    
    @Override
        public void postTradingDays(TradingDayDto tradingDayDto)  {
        tradingDayDao.createOrUpdate(BindTradingDay.bindTradingDay(tradingDayDto));
    }

    @Override
    public void postTradingDays(TradingDayListDto tradingDayListDto)  {
        for (TradingDayDto tradingDayDto : tradingDayListDto.getTradingDayList()) {
            tradingDayDao.createOrUpdate(BindTradingDay.bindTradingDay(tradingDayDto));
        }
    }

    @Override
    public void putTradingDays(TradingDayDto tradingDayDto)  {
        tradingDayDao.createOrUpdate(BindTradingDay.bindTradingDay(tradingDayDto));
    }

    @Override
    public void deleteTradingDays(Long tradingDayId)  {
        tradingDayDao.delete(tradingDayDao.read(tradingDayId));
}

}