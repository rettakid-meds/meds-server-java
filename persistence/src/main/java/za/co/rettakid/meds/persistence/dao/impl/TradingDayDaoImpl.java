package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class TradingDayDaoImpl extends BaseDaoImpl<TradingDayEntity,Long> implements TradingDayDao   {

    public Class getEntityClass() {
        return TradingDayEntity.class;
    }

}