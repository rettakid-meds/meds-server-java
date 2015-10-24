package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.PrescriptionDao;
import za.co.rettakid.meds.persistence.entity.*;
import java.util.Date;

@Service
public class PrescriptionDaoImpl extends BaseDaoImpl<PrescriptionEntity,Long> implements PrescriptionDao   {

    public Class getEntityClass() {
        return PrescriptionEntity.class;
    }

}