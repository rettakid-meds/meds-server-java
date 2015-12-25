package za.co.rettakid.meds.persistence.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.AppointmentDao;
import za.co.rettakid.meds.persistence.entity.AppointmentEntity;
import za.co.rettakid.meds.persistence.entity.DoctorEntity;
import za.co.rettakid.meds.persistence.entity.UserEntity;

import java.util.Date;
import java.util.List;

@Service
public class AppointmentDaoImpl extends BaseDaoImpl<AppointmentEntity, Long> implements AppointmentDao {

    public Class getEntityClass() {
        return AppointmentEntity.class;
    }

    @Override
    public AppointmentEntity getAppointment(DoctorEntity doctorEntity,Date frmDate,Date toDate) {
        Criteria criteria = createCriteria();
        criteria.add(Restrictions.eq("doctor",doctorEntity))
                .setMaxResults(1)
                .add(Restrictions.disjunction()
                    .add(
                            Restrictions.and(
                            Restrictions.eq("expectedFrm",frmDate),
                            Restrictions.eq("expectedTo",toDate)
                    ))
                    .add(
                            Restrictions.and(
                            Restrictions.eq("expectedFrm",frmDate),
                            Restrictions.gt("expectedTo",toDate)
                    ))
                    .add(
                            Restrictions.and(
                            Restrictions.lt("expectedFrm",frmDate),
                            Restrictions.eq("expectedTo",toDate)
                    ))

                    .add(
                            Restrictions.and(
                            Restrictions.gt("expectedFrm",frmDate),
                            Restrictions.lt("expectedFrm",toDate)
                    ))
                    .add(
                            Restrictions.and(
                            Restrictions.gt("expectedTo",frmDate),
                            Restrictions.lt("expectedTo",toDate)
                    ))
                    .add(
                            Restrictions.and(
                            Restrictions.gt("expectedFrm",frmDate),
                            Restrictions.lt("expectedTo",toDate)
                    ))
                    .add(
                            Restrictions.and(
                            Restrictions.lt("expectedFrm",frmDate),
                            Restrictions.gt("expectedTo",toDate)
                    ))
                );
        return (AppointmentEntity)criteria.uniqueResult();
    }

    @Override
    public Boolean isOwner(Long appointmentId,DoctorEntity doctorEntity)    {
        Criteria criteria = createCriteria();
        criteria.add(Restrictions.eq("appointmentId",appointmentId));
        criteria.add(Restrictions.eq("doctor",doctorEntity));
        return !criteria.list().isEmpty();
    }

    @Override
    public List<AppointmentEntity> getAppointments(UserEntity user,DoctorEntity doctor)    {
        Criteria criteria = createCriteria();
        criteria.add(Restrictions.eq("user",user));
        criteria.add(Restrictions.eq("doctor",doctor));
        return criteria.list();
    }

}