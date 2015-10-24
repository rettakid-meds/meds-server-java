package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.AppointmentDao;
import za.co.rettakid.meds.persistence.entity.*;
import java.util.Date;

@Service
public class AppointmentDaoImpl extends BaseDaoImpl<AppointmentEntity,Long> implements AppointmentDao   {

    public Class getEntityClass() {
        return AppointmentEntity.class;
    }

}