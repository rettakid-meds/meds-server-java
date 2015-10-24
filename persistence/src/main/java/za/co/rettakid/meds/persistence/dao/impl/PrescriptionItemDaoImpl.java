package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.PrescriptionItemDao;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class PrescriptionItemDaoImpl extends BaseDaoImpl<PrescriptionItemEntity,Long> implements PrescriptionItemDao   {

    public Class getEntityClass() {
        return PrescriptionItemEntity.class;
    }

}