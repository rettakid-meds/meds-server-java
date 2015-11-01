package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import java.util.Date;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class TradingHourDaoImpl extends BaseDaoImpl<TradingHourEntity,Long> implements TradingHourDao   {

    public Class getEntityClass() {
        return TradingHourEntity.class;
    }

}