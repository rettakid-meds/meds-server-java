package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import java.util.Date;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class PracticeDaoImpl extends BaseDaoImpl<PracticeEntity,Long> implements PracticeDao   {

    public Class getEntityClass() {
        return PracticeEntity.class;
    }

}