package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.common.dto.AppointmentAvailability;
import za.co.rettakid.meds.common.dto.DoctorDto;
import za.co.rettakid.meds.common.dto.DoctorListDto;
import za.co.rettakid.meds.persistence.dao.AppointmentDao;
import za.co.rettakid.meds.persistence.dao.DoctorDao;
import za.co.rettakid.meds.persistence.entity.DoctorEntity;
import za.co.rettakid.meds.services.DoctorService;
import za.co.rettakid.meds.services.TradingDayService;
import za.co.rettakid.meds.services.binding.BindAppointment;
import za.co.rettakid.meds.services.binding.BindDoctor;

import java.util.Date;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService   {

    @Autowired
    private DoctorDao doctorDao;
    @Autowired
    private TradingDayService tradingDayService;
    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public DoctorListDto getDoctors()  {
        DoctorListDto doctorListDto = new DoctorListDto();
        doctorListDto.addDoctorList(BindDoctor.bindDoctorEntityList(doctorDao.read()));
        return doctorListDto;
    }

    @Override
    public AppointmentAvailability isAvailable(Long doctorId,Date frmDate,Date toDate)    {
        DoctorEntity doctorEntity = doctorDao.read(doctorId);
        AppointmentAvailability doctorAppointmentAvailability = new AppointmentAvailability();
        doctorAppointmentAvailability.setAvailable(tradingDayService.isAvailable(doctorEntity.getTradingDay().getTradingDayId(),frmDate,toDate));
        doctorAppointmentAvailability.setAppointment(BindAppointment.bindAppointment(appointmentDao.getAppointment(doctorDao.read(doctorId),frmDate, toDate)));
        if (doctorAppointmentAvailability.getAppointment() != null) {
            doctorAppointmentAvailability.setAvailable(false);
        }
        return doctorAppointmentAvailability;
    }

    @Override
    public DoctorDto getDoctors(Long doctorId)  {
        return BindDoctor.bindDoctor(doctorDao.read(doctorId));
    }

    @Override
    public DoctorDto postDoctors(DoctorDto doctorDto)  {
        DoctorEntity doctorEntity = BindDoctor.bindDoctor(doctorDto);
        doctorDao.createOrUpdate(doctorEntity);
        return BindDoctor.bindDoctor(doctorEntity);
    }

    @Override
    public void putDoctors(DoctorDto doctorDto)  {
        doctorDao.createOrUpdate(BindDoctor.bindDoctor(doctorDto));
    }

    @Override
    public void deleteDoctors(Long doctorId)  {
        doctorDao.delete(doctorDao.read(doctorId));
}

}