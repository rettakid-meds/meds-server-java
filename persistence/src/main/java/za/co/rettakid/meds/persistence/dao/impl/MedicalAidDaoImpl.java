package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class MedicalAidDaoImpl extends BaseDaoImpl<MedicalAidEntity,Long> implements MedicalAidDao   {

    public Class getEntityClass() {
        return MedicalAidEntity.class;
    }

}