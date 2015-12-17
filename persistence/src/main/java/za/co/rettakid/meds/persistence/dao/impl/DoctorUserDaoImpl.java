package za.co.rettakid.meds.persistence.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

import java.util.List;

@Service
public class DoctorUserDaoImpl extends BaseDaoImpl<DoctorUserEntity,Long> implements DoctorUserDao   {

    public Class getEntityClass() {
        return DoctorUserEntity.class;
    }

    @Override
    public List<DoctorEntity> getDoctors(UserEntity userEntity)  {
        Criteria criteria = createCriteria();
        criteria.add(Restrictions.eq("user",userEntity))
        .setProjection(Projections.groupProperty("doctor"));
        return criteria.list();
    }

}