package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class DoctorFieldDaoImpl extends BaseDaoImpl<DoctorFieldEntity,Long> implements DoctorFieldDao   {

    public Class getEntityClass() {
        return DoctorFieldEntity.class;
    }

}