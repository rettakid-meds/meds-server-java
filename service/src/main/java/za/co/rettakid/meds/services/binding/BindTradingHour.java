package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindTradingHour {

    public static TradingHourEntity bindTradingHour(TradingHourDto tradingHourDto) {
        TradingHourEntity tradingHourEntity = null;
        if (tradingHourDto != null)    {
            tradingHourEntity = new TradingHourEntity();
            tradingHourEntity.setTradingHourId(tradingHourDto.getTradingHourId());
            tradingHourEntity.setEffFrm(tradingHourDto.getEffFrm());
            tradingHourEntity.setEffTo(tradingHourDto.getEffTo());
            tradingHourEntity.setOpen(tradingHourDto.getOpen());
        }
        return tradingHourEntity;
    }

    public static List<TradingHourEntity> bindTradingHourDtoList(List<TradingHourDto> tradingHourDtos) {
    List<TradingHourEntity> tradingHourEntities = new ArrayList<TradingHourEntity>();
        for (TradingHourDto tradingHourDto : tradingHourDtos) {
            tradingHourEntities.add(bindTradingHour(tradingHourDto));
        }
        return tradingHourEntities;
    }

    public static TradingHourDto bindTradingHour(TradingHourEntity tradingHourEntity) {
        TradingHourDto tradingHourDto = null;
        if (tradingHourEntity != null)    {
            tradingHourDto = new TradingHourDto();
            tradingHourDto.setTradingHourId(tradingHourEntity.getTradingHourId());
            tradingHourDto.setEffFrm(tradingHourEntity.getEffFrm());
            tradingHourDto.setEffTo(tradingHourEntity.getEffTo());
            tradingHourDto.setOpen(tradingHourEntity.getOpen());
        }
        return tradingHourDto;
    }

    public static List<TradingHourDto> bindTradingHourEntityList(List<TradingHourEntity> tradingHourEntitys) {
        List<TradingHourDto> tradingHourDtos = new ArrayList<TradingHourDto>();
        for (TradingHourEntity tradingHourEntity : tradingHourEntitys) {
            tradingHourDtos.add(bindTradingHour(tradingHourEntity));
        }
        return tradingHourDtos;
    }

}
