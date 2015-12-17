package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class UserMedicalAidDaoImpl extends BaseDaoImpl<UserMedicalAidEntity,Long> implements UserMedicalAidDao   {

    public Class getEntityClass() {
        return UserMedicalAidEntity.class;
    }

}