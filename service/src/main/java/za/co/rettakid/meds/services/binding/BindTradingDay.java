package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindTradingDay {

    public static TradingDayEntity bindTradingDay(TradingDayDto tradingDayDto) {
        TradingDayEntity tradingDayEntity = null;
        if (tradingDayDto != null)    {
            tradingDayEntity = new TradingDayEntity();
            tradingDayEntity.setTradingDayId(tradingDayDto.getTradingDayId());
            tradingDayEntity.setMondayEntity(BindTradingHour.bindTradingHour(tradingDayDto.getMonday()));
            tradingDayEntity.setTuesdayEntity(BindTradingHour.bindTradingHour(tradingDayDto.getTuesday()));
            tradingDayEntity.setWednesdayEntity(BindTradingHour.bindTradingHour(tradingDayDto.getWednesday()));
            tradingDayEntity.setThursdayEntity(BindTradingHour.bindTradingHour(tradingDayDto.getThursday()));
            tradingDayEntity.setFridayEntity(BindTradingHour.bindTradingHour(tradingDayDto.getFriday()));
            tradingDayEntity.setSaturdayEntity(BindTradingHour.bindTradingHour(tradingDayDto.getSaturday()));
            tradingDayEntity.setSundayEntity(BindTradingHour.bindTradingHour(tradingDayDto.getSunday()));
            tradingDayEntity.setPubicHolidayEntity(BindTradingHour.bindTradingHour(tradingDayDto.getPubicHoliday()));
        }
        return tradingDayEntity;
    }

    public static List<TradingDayEntity> bindTradingDayDtoList(List<TradingDayDto> tradingDayDtos) {
    List<TradingDayEntity> tradingDayEntities = new ArrayList<TradingDayEntity>();
        for (TradingDayDto tradingDayDto : tradingDayDtos) {
            tradingDayEntities.add(bindTradingDay(tradingDayDto));
        }
        return tradingDayEntities;
    }

    public static TradingDayDto bindTradingDay(TradingDayEntity tradingDayEntity) {
        TradingDayDto tradingDayDto = null;
        if (tradingDayEntity != null)    {
            tradingDayDto = new TradingDayDto();
            tradingDayDto.setTradingDayId(tradingDayEntity.getTradingDayId());
            tradingDayDto.setMonday(BindTradingHour.bindTradingHour(tradingDayEntity.getMondayEntity()));
            tradingDayDto.setTuesday(BindTradingHour.bindTradingHour(tradingDayEntity.getTuesdayEntity()));
            tradingDayDto.setWednesday(BindTradingHour.bindTradingHour(tradingDayEntity.getWednesdayEntity()));
            tradingDayDto.setThursday(BindTradingHour.bindTradingHour(tradingDayEntity.getThursdayEntity()));
            tradingDayDto.setFriday(BindTradingHour.bindTradingHour(tradingDayEntity.getFridayEntity()));
            tradingDayDto.setSaturday(BindTradingHour.bindTradingHour(tradingDayEntity.getSaturdayEntity()));
            tradingDayDto.setSunday(BindTradingHour.bindTradingHour(tradingDayEntity.getSundayEntity()));
            tradingDayDto.setPubicHoliday(BindTradingHour.bindTradingHour(tradingDayEntity.getPubicHolidayEntity()));
        }
        return tradingDayDto;
    }

    public static List<TradingDayDto> bindTradingDayEntityList(List<TradingDayEntity> tradingDayEntitys) {
        List<TradingDayDto> tradingDayDtos = new ArrayList<TradingDayDto>();
        for (TradingDayEntity tradingDayEntity : tradingDayEntitys) {
            tradingDayDtos.add(bindTradingDay(tradingDayEntity));
        }
        return tradingDayDtos;
    }

}
