package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindTradingHour {

    public static TradingHourVo bindTradingHour(TradingHourDto tradingHourDto) {
        TradingHourVo tradingHourVo = null;
        if (tradingHourDto != null)    {
            tradingHourVo = new TradingHourVo();
            tradingHourVo.setTradingHourId(tradingHourDto.getTradingHourId());
            tradingHourVo.setEffFrm(tradingHourDto.getEffFrm());
            tradingHourVo.setEffTo(tradingHourDto.getEffTo());
            tradingHourVo.setBreakAEffFrm(tradingHourDto.getBreakAEffFrm());
            tradingHourVo.setBreakAEffTo(tradingHourDto.getBreakAEffTo());
            tradingHourVo.setBreakBEffFrm(tradingHourDto.getBreakBEffFrm());
            tradingHourVo.setBreakBEffTo(tradingHourDto.getBreakBEffTo());
            tradingHourVo.setOpen(tradingHourDto.getOpen());
        }
        return tradingHourVo;
    }

    public static List<TradingHourVo> bindTradingHourDtoList(List<TradingHourDto> tradingHourDtos) {
    List<TradingHourVo> tradingHourEntities = new ArrayList<TradingHourVo>();
        for (TradingHourDto tradingHourDto : tradingHourDtos) {
            tradingHourEntities.add(bindTradingHour(tradingHourDto));
        }
        return tradingHourEntities;
    }

    public static TradingHourDto bindTradingHour(TradingHourVo tradingHourVo) {
        TradingHourDto tradingHourDto = null;
        if (tradingHourVo != null)    {
            tradingHourDto = new TradingHourDto();
            tradingHourDto.setTradingHourId(tradingHourVo.getTradingHourId());
            tradingHourDto.setEffFrm(tradingHourVo.getEffFrm());
            tradingHourDto.setEffTo(tradingHourVo.getEffTo());
            tradingHourDto.setBreakAEffFrm(tradingHourVo.getBreakAEffFrm());
            tradingHourDto.setBreakAEffTo(tradingHourVo.getBreakAEffTo());
            tradingHourDto.setBreakBEffFrm(tradingHourVo.getBreakBEffFrm());
            tradingHourDto.setBreakBEffTo(tradingHourVo.getBreakBEffTo());
            tradingHourDto.setOpen(tradingHourVo.getOpen());
        }
        return tradingHourDto;
    }

    public static List<TradingHourDto> bindTradingHourVoList(List<TradingHourVo> tradingHourVos) {
        List<TradingHourDto> tradingHourDtos = new ArrayList<TradingHourDto>();
        for (TradingHourVo tradingHourVo : tradingHourVos) {
            tradingHourDtos.add(bindTradingHour(tradingHourVo));
        }
        return tradingHourDtos;
    }

}
