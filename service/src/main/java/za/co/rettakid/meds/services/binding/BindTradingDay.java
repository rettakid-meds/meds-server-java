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
            tradingDayEntity.setMonday(BindTradingHour.bindTradingHour(tradingDayDto.getMonday()));
            tradingDayEntity.setTuesday(BindTradingHour.bindTradingHour(tradingDayDto.getTuesday()));
            tradingDayEntity.setWednesday(BindTradingHour.bindTradingHour(tradingDayDto.getWednesday()));
            tradingDayEntity.setThursday(BindTradingHour.bindTradingHour(tradingDayDto.getThursday()));
            tradingDayEntity.setFriday(BindTradingHour.bindTradingHour(tradingDayDto.getFriday()));
            tradingDayEntity.setSaturday(BindTradingHour.bindTradingHour(tradingDayDto.getSaturday()));
            tradingDayEntity.setSunday(BindTradingHour.bindTradingHour(tradingDayDto.getSunday()));
            tradingDayEntity.setPubicHoliday(BindTradingHour.bindTradingHour(tradingDayDto.getPubicHoliday()));
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
            tradingDayDto.setMonday(BindTradingHour.bindTradingHour(tradingDayEntity.getMonday()));
            tradingDayDto.setTuesday(BindTradingHour.bindTradingHour(tradingDayEntity.getTuesday()));
            tradingDayDto.setWednesday(BindTradingHour.bindTradingHour(tradingDayEntity.getWednesday()));
            tradingDayDto.setThursday(BindTradingHour.bindTradingHour(tradingDayEntity.getThursday()));
            tradingDayDto.setFriday(BindTradingHour.bindTradingHour(tradingDayEntity.getFriday()));
            tradingDayDto.setSaturday(BindTradingHour.bindTradingHour(tradingDayEntity.getSaturday()));
            tradingDayDto.setSunday(BindTradingHour.bindTradingHour(tradingDayEntity.getSunday()));
            tradingDayDto.setPubicHoliday(BindTradingHour.bindTradingHour(tradingDayEntity.getPubicHoliday()));
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
