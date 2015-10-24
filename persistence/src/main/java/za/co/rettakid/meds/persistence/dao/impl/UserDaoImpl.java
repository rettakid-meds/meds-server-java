package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.UserDao;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class UserDaoImpl extends BaseDaoImpl<UserEntity,Long> implements UserDao   {

    public Class getEntityClass() {
        return UserEntity.class;
    }

}