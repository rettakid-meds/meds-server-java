package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

@Service
@Transactional
public class DoctorAppointmentServiceImpl implements DoctorAppointmentService   {

    @Autowired
    private DoctorAppointmentDao doctorAppointmentDao;

    @Override
    public DoctorAppointmentListDto getDoctorAppointments()  {
        DoctorAppointmentListDto doctorAppointmentListDto = new DoctorAppointmentListDto();
        doctorAppointmentListDto.addDoctorAppointmentList(BindDoctorAppointment.bindDoctorAppointmentEntityList(doctorAppointmentDao.read()));
        return doctorAppointmentListDto;
    }

    @Override
    public DoctorAppointmentDto getDoctorAppointments(Long medsDoctorAppointmentId)  {
        return BindDoctorAppointment.bindDoctorAppointment(doctorAppointmentDao.read(medsDoctorAppointmentId));
    }
    
    @Override
    public void postDoctorAppointments(DoctorAppointmentDto doctorAppointmentDto)  {
        doctorAppointmentDao.createOrUpdate(BindDoctorAppointment.bindDoctorAppointment(doctorAppointmentDto));
    }

    @Override
    public void putDoctorAppointments(DoctorAppointmentDto doctorAppointmentDto)  {
        doctorAppointmentDao.createOrUpdate(BindDoctorAppointment.bindDoctorAppointment(doctorAppointmentDto));
    }

    @Override
    public void deleteDoctorAppointments(Long medsDoctorAppointmentId)  {
        doctorAppointmentDao.delete(doctorAppointmentDao.read(medsDoctorAppointmentId));
}

}