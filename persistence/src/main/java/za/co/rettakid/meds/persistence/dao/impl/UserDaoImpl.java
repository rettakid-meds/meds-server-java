package za.co.rettakid.meds.persistence.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

import java.util.List;

@Service
public class UserDaoImpl extends BaseDaoImpl<UserEntity,Long> implements UserDao   {

    public Class getEntityClass() {
        return UserEntity.class;
    }

    @Override
    public UserEntity getUser(String email)  {
        Criteria criteria = createCriteria()
                .add(Restrictions.eq("email", email))
                .setMaxResults(1);
        List<UserEntity> userEntities = criteria.list();
        return (!userEntities.isEmpty()) ? userEntities.get(0) : null;
    }

    @Override
    public UserEntity getUser(String email,String password)  {
        Criteria criteria = createCriteria()
                .add(Restrictions.eq("email", email))
                .add(Restrictions.eq("password", password))
                .setMaxResults(1);
        List<UserEntity> userEntities = criteria.list();
        return (!userEntities.isEmpty()) ? userEntities.get(0) : null;
    }

}