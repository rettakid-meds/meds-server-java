package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.TradingHourDao;
import za.co.rettakid.meds.persistence.entity.*;
import java.util.Date;

@Service
public class TradingHourDaoImpl extends BaseDaoImpl<TradingHourEntity,Long> implements TradingHourDao   {

    public Class getEntityClass() {
        return TradingHourEntity.class;
    }

}