package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import java.util.Date;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class PrescriptionDaoImpl extends BaseDaoImpl<PrescriptionEntity,Long> implements PrescriptionDao   {

    public Class getEntityClass() {
        return PrescriptionEntity.class;
    }

}