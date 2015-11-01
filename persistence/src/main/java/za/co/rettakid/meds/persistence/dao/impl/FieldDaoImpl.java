package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class FieldDaoImpl extends BaseDaoImpl<FieldEntity,Long> implements FieldDao   {

    public Class getEntityClass() {
        return FieldEntity.class;
    }

}