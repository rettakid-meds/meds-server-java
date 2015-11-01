package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindTradingDay {

    public static TradingDayVo bindTradingDay(TradingDayDto tradingDayDto) {
        TradingDayVo tradingDayVo = null;
        if (tradingDayDto != null)    {
            tradingDayVo = new TradingDayVo();
            tradingDayVo.setTradingDayId(tradingDayDto.getTradingDayId());
            tradingDayVo.setMonday(BindTradingHour.bindTradingHour(tradingDayDto.getMonday()));
            tradingDayVo.setTuesday(BindTradingHour.bindTradingHour(tradingDayDto.getTuesday()));
            tradingDayVo.setWednesday(BindTradingHour.bindTradingHour(tradingDayDto.getWednesday()));
            tradingDayVo.setThursday(BindTradingHour.bindTradingHour(tradingDayDto.getThursday()));
            tradingDayVo.setFriday(BindTradingHour.bindTradingHour(tradingDayDto.getFriday()));
            tradingDayVo.setSaturday(BindTradingHour.bindTradingHour(tradingDayDto.getSaturday()));
            tradingDayVo.setSunday(BindTradingHour.bindTradingHour(tradingDayDto.getSunday()));
            tradingDayVo.setPubicHoliday(BindTradingHour.bindTradingHour(tradingDayDto.getPubicHoliday()));
        }
        return tradingDayVo;
    }

    public static List<TradingDayVo> bindTradingDayDtoList(List<TradingDayDto> tradingDayDtos) {
    List<TradingDayVo> tradingDayEntities = new ArrayList<TradingDayVo>();
        for (TradingDayDto tradingDayDto : tradingDayDtos) {
            tradingDayEntities.add(bindTradingDay(tradingDayDto));
        }
        return tradingDayEntities;
    }

    public static TradingDayDto bindTradingDay(TradingDayVo tradingDayVo) {
        TradingDayDto tradingDayDto = null;
        if (tradingDayVo != null)    {
            tradingDayDto = new TradingDayDto();
            tradingDayDto.setTradingDayId(tradingDayVo.getTradingDayId());
            tradingDayDto.setMonday(BindTradingHour.bindTradingHour(tradingDayVo.getMonday()));
            tradingDayDto.setTuesday(BindTradingHour.bindTradingHour(tradingDayVo.getTuesday()));
            tradingDayDto.setWednesday(BindTradingHour.bindTradingHour(tradingDayVo.getWednesday()));
            tradingDayDto.setThursday(BindTradingHour.bindTradingHour(tradingDayVo.getThursday()));
            tradingDayDto.setFriday(BindTradingHour.bindTradingHour(tradingDayVo.getFriday()));
            tradingDayDto.setSaturday(BindTradingHour.bindTradingHour(tradingDayVo.getSaturday()));
            tradingDayDto.setSunday(BindTradingHour.bindTradingHour(tradingDayVo.getSunday()));
            tradingDayDto.setPubicHoliday(BindTradingHour.bindTradingHour(tradingDayVo.getPubicHoliday()));
        }
        return tradingDayDto;
    }

    public static List<TradingDayDto> bindTradingDayVoList(List<TradingDayVo> tradingDayVos) {
        List<TradingDayDto> tradingDayDtos = new ArrayList<TradingDayDto>();
        for (TradingDayVo tradingDayVo : tradingDayVos) {
            tradingDayDtos.add(bindTradingDay(tradingDayVo));
        }
        return tradingDayDtos;
    }

}
