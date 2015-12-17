package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.common.dto.TradingDayDto;
import za.co.rettakid.meds.common.dto.TradingDayListDto;
import za.co.rettakid.meds.persistence.dao.TradingDayDao;
import za.co.rettakid.meds.persistence.entity.TradingDayEntity;
import za.co.rettakid.meds.persistence.entity.TradingHourEntity;
import za.co.rettakid.meds.services.TradingDayService;
import za.co.rettakid.meds.services.binding.BindTradingDay;

import java.util.Calendar;
import java.util.Date;

@Service
@Transactional
public class TradingDayServiceImpl implements TradingDayService {

    @Autowired
    private TradingDayDao tradingDayDao;

    @Override
    public TradingDayListDto getTradingDays() {
        TradingDayListDto tradingDayListDto = new TradingDayListDto();
        tradingDayListDto.addTradingDayList(BindTradingDay.bindTradingDayEntityList(tradingDayDao.read()));
        return tradingDayListDto;
    }

    @Override
    public Boolean isAvailable(Long tradingDayId, Date dateFrm, Date dateTo) {
        TradingDayEntity tradingDayEntity = tradingDayDao.read(tradingDayId);
        TradingHourEntity fromTradingHourEntity = getTradingHour(tradingDayEntity, dateFrm);
        TradingHourEntity toTradingHourEntity = getTradingHour(tradingDayEntity, dateTo);
        Date timeFrom = getTime(dateFrm);
        Date timeTo = getTime(dateTo);

        if (!fromTradingHourEntity.getOpen()
                || timeFrom.before(fromTradingHourEntity.getEffFrm())
                || timeFrom.after(fromTradingHourEntity.getEffTo())) {
            return false;
        } else if (!toTradingHourEntity.getOpen()
                || timeTo.before(toTradingHourEntity.getEffFrm())
                || timeTo.after(toTradingHourEntity.getEffTo())) {
            return false;
        }
        return true;
    }

    private TradingHourEntity getTradingHour(TradingDayEntity tradingDayEntity, Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
                return tradingDayEntity.getMonday();
            case Calendar.TUESDAY:
                return tradingDayEntity.getTuesday();
            case Calendar.WEDNESDAY:
                return tradingDayEntity.getWednesday();
            case Calendar.THURSDAY:
                return tradingDayEntity.getThursday();
            case Calendar.FRIDAY:
                return tradingDayEntity.getFriday();
            case Calendar.SATURDAY:
                return tradingDayEntity.getSaturday();
            case Calendar.SUNDAY:
                return tradingDayEntity.getSunday();
            default:
                return null;
        }
    }

    private Date getTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.YEAR, 1970);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }

    @Override
    public TradingDayDto getTradingDays(Long tradingDayId) {
        return BindTradingDay.bindTradingDay(tradingDayDao.read(tradingDayId));
    }

    @Override
    public TradingDayDto postTradingDays(TradingDayDto tradingDayDto)  {
        TradingDayEntity tradingDayEntity = BindTradingDay.bindTradingDay(tradingDayDto);
        tradingDayDao.createOrUpdate(tradingDayEntity);
        return BindTradingDay.bindTradingDay(tradingDayEntity);
    }

    @Override
    public void putTradingDays(TradingDayDto tradingDayDto) {
        tradingDayDao.createOrUpdate(BindTradingDay.bindTradingDay(tradingDayDto));
    }

    @Override
    public void deleteTradingDays(Long tradingDayId) {
        tradingDayDao.delete(tradingDayDao.read(tradingDayId));
    }

}