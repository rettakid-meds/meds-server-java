package za.co.rettakid.meds.persistence.dao;

import java.util.List;
import java.util.Date;
import za.co.rettakid.meds.persistence.entity.*;

public interface AppointmentDao extends BaseDao<AppointmentEntity,Long>    {

    AppointmentEntity getAppointment(DoctorEntity doctorEntity, Date frmDate, Date toDate);
}