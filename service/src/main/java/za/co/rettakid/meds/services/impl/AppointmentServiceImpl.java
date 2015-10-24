package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

@Service
public class AppointmentServiceImpl implements AppointmentService   {

    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public AppointmentListDto getAppointments()  {
        AppointmentListDto appointmentListDto = new AppointmentListDto();
        appointmentListDto.addAppointmentList(BindAppointment.bindAppointmentEntityList(appointmentDao.read()));
        return appointmentListDto;
    }
    
    @Override
    public AppointmentDto getAppointments(Long appointmentId)  {
        return BindAppointment.bindAppointment(appointmentDao.read(appointmentId));
    }
    
    @Override
        public void postAppointments(AppointmentDto appointmentDto)  {
        appointmentDao.createOrUpdate(BindAppointment.bindAppointment(appointmentDto));
    }

    @Override
    public void postAppointments(AppointmentListDto appointmentListDto)  {
        for (AppointmentDto appointmentDto : appointmentListDto.getAppointmentList()) {
            appointmentDao.createOrUpdate(BindAppointment.bindAppointment(appointmentDto));
        }
    }

    @Override
    public void putAppointments(AppointmentDto appointmentDto)  {
        appointmentDao.createOrUpdate(BindAppointment.bindAppointment(appointmentDto));
    }

    @Override
    public void deleteAppointments(Long appointmentId)  {
        appointmentDao.delete(appointmentDao.read(appointmentId));
}

}