package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.DataContentDao;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class DataContentDaoImpl extends BaseDaoImpl<DataContentEntity,Long> implements DataContentDao   {

    public Class getEntityClass() {
        return DataContentEntity.class;
    }

}