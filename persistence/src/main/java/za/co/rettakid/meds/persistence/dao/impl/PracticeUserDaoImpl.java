package za.co.rettakid.meds.persistence.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.PracticeUserDao;
import za.co.rettakid.meds.persistence.entity.PracticeEntity;
import za.co.rettakid.meds.persistence.entity.PracticeUserEntity;
import za.co.rettakid.meds.persistence.entity.UserEntity;

import java.util.List;

@Service
public class PracticeUserDaoImpl extends BaseDaoImpl<PracticeUserEntity,Long> implements PracticeUserDao   {

    public Class getEntityClass() {
        return PracticeUserEntity.class;
    }

    @Override
    public List<PracticeEntity> getPracticesForUser(UserEntity userEntity)  {
        Criteria criteria = createCriteria();
        criteria.add(Restrictions.eq("user",userEntity))
        .setProjection(Projections.property("practice"));

        return criteria.list();
    }

}