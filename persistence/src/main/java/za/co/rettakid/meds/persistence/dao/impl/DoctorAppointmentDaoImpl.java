package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class DoctorAppointmentDaoImpl extends BaseDaoImpl<DoctorAppointmentEntity,Long> implements DoctorAppointmentDao   {

    public Class getEntityClass() {
        return DoctorAppointmentEntity.class;
    }

}