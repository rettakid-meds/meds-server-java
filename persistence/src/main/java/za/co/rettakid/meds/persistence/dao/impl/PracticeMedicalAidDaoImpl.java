package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class PracticeMedicalAidDaoImpl extends BaseDaoImpl<PracticeMedicalAidEntity,Long> implements PracticeMedicalAidDao   {

    public Class getEntityClass() {
        return PracticeMedicalAidEntity.class;
    }

}