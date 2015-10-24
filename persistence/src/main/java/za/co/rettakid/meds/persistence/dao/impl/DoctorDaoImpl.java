package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.DoctorDao;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class DoctorDaoImpl extends BaseDaoImpl<DoctorEntity,Long> implements DoctorDao   {

    public Class getEntityClass() {
        return DoctorEntity.class;
    }

}