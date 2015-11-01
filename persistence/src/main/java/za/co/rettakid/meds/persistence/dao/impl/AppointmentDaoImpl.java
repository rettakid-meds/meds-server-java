package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import java.util.Date;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class AppointmentDaoImpl extends BaseDaoImpl<AppointmentEntity,Long> implements AppointmentDao   {

    public Class getEntityClass() {
        return AppointmentEntity.class;
    }

}