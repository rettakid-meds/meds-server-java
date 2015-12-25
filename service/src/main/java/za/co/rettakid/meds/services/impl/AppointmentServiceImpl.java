package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.common.dto.AppointmentDto;
import za.co.rettakid.meds.common.dto.AppointmentListDto;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.AppointmentEntity;
import za.co.rettakid.meds.persistence.entity.DataContentEntity;
import za.co.rettakid.meds.persistence.entity.DoctorEntity;
import za.co.rettakid.meds.persistence.entity.UserEntity;
import za.co.rettakid.meds.services.AppointmentService;
import za.co.rettakid.meds.services.binding.BindAppointment;

import java.util.List;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService   {

    @Autowired
    private AppointmentDao appointmentDao;
    @Autowired
    private DoctorDao doctorDao;
    @Autowired
    private DoctorUserDao doctorUserDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private DataContentDao dataContentDao;

    @Override
    public AppointmentListDto getAppointments()  {
        AppointmentListDto appointmentListDto = new AppointmentListDto();
        appointmentListDto.addAppointmentList(BindAppointment.bindAppointmentEntityList(appointmentDao.read()));
        return appointmentListDto;
    }

    @Override
    public AppointmentListDto getAppointments(Long userId,Long doctorId)  {
        AppointmentListDto appointmentListDto = new AppointmentListDto();
        appointmentListDto.addAppointmentList(BindAppointment.bindAppointmentEntityList(appointmentDao.getAppointments(userDao.read(userId),doctorDao.read(doctorId))));
        return appointmentListDto;
    }

    @Override
    public AppointmentDto getAppointments(Long appointmentId)  {
        return BindAppointment.bindAppointment(appointmentDao.read(appointmentId));
    }

    @Override
    public Boolean hasOwnership(Long appointmentId,Long userId)  {
        UserEntity userEntity = userDao.read(userId);
        for (DoctorEntity doctorEntity : doctorUserDao.getDoctors(userEntity)) {
            if (appointmentDao.isOwner(appointmentId,doctorEntity)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public AppointmentDto postAppointments(AppointmentDto appointmentDto)  {
        AppointmentEntity appointmentEntity = BindAppointment.bindAppointment(appointmentDto);
        appointmentEntity.setDoctor(doctorDao.read(appointmentEntity.getDoctor().getDoctorId()));
        appointmentEntity.setUser(userDao.read(appointmentEntity.getUser().getUserId()));
        DataContentEntity dataContentEntity = new DataContentEntity();
        dataContentEntity.setData(appointmentEntity.getNote().getData());
        dataContentDao.createOrUpdate(dataContentEntity);
        appointmentEntity.setNote(dataContentEntity);
        appointmentDao.createOrUpdate(appointmentEntity);
        return BindAppointment.bindAppointment(appointmentEntity);
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