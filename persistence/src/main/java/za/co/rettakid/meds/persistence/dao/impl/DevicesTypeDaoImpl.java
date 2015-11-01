package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class DevicesTypeDaoImpl extends BaseDaoImpl<DevicesTypeEntity,Long> implements DevicesTypeDao   {

    public Class getEntityClass() {
        return DevicesTypeEntity.class;
    }

}