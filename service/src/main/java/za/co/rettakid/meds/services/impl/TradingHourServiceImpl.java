package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

@Service
public class TradingHourServiceImpl implements TradingHourService   {

    @Autowired
    private TradingHourDao tradingHourDao;

    @Override
    public TradingHourListDto getTradingHours()  {
        TradingHourListDto tradingHourListDto = new TradingHourListDto();
        tradingHourListDto.addTradingHourList(BindTradingHour.bindTradingHourEntityList(tradingHourDao.read()));
        return tradingHourListDto;
    }
    
    @Override
    public TradingHourDto getTradingHours(Long tradingHourId)  {
        return BindTradingHour.bindTradingHour(tradingHourDao.read(tradingHourId));
    }
    
    @Override
        public void postTradingHours(TradingHourDto tradingHourDto)  {
        tradingHourDao.createOrUpdate(BindTradingHour.bindTradingHour(tradingHourDto));
    }

    @Override
    public void postTradingHours(TradingHourListDto tradingHourListDto)  {
        for (TradingHourDto tradingHourDto : tradingHourListDto.getTradingHourList()) {
            tradingHourDao.createOrUpdate(BindTradingHour.bindTradingHour(tradingHourDto));
        }
    }

    @Override
    public void putTradingHours(TradingHourDto tradingHourDto)  {
        tradingHourDao.createOrUpdate(BindTradingHour.bindTradingHour(tradingHourDto));
    }

    @Override
    public void deleteTradingHours(Long tradingHourId)  {
        tradingHourDao.delete(tradingHourDao.read(tradingHourId));
}

}