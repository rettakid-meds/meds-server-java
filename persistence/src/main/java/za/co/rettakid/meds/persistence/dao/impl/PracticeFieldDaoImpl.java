package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.PracticeFieldDao;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class PracticeFieldDaoImpl extends BaseDaoImpl<PracticeFieldEntity,Long> implements PracticeFieldDao   {

    public Class getEntityClass() {
        return PracticeFieldEntity.class;
    }

}