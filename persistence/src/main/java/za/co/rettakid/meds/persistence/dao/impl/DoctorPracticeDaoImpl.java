package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class DoctorPracticeDaoImpl extends BaseDaoImpl<DoctorPracticeEntity,Long> implements DoctorPracticeDao   {

    public Class getEntityClass() {
        return DoctorPracticeEntity.class;
    }

}