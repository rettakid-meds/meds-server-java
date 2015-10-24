package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

@Service
public class DoctorPracticeServiceImpl implements DoctorPracticeService   {

    @Autowired
    private DoctorPracticeDao doctorPracticeDao;

    @Override
    public DoctorPracticeListDto getDoctorPractices()  {
        DoctorPracticeListDto doctorPracticeListDto = new DoctorPracticeListDto();
        doctorPracticeListDto.addDoctorPracticeList(BindDoctorPractice.bindDoctorPracticeEntityList(doctorPracticeDao.read()));
        return doctorPracticeListDto;
    }
    
    @Override
    public DoctorPracticeDto getDoctorPractices(Long medsDoctorPracticeId)  {
        return BindDoctorPractice.bindDoctorPractice(doctorPracticeDao.read(medsDoctorPracticeId));
    }
    
    @Override
        public void postDoctorPractices(DoctorPracticeDto doctorPracticeDto)  {
        doctorPracticeDao.createOrUpdate(BindDoctorPractice.bindDoctorPractice(doctorPracticeDto));
    }

    @Override
    public void postDoctorPractices(DoctorPracticeListDto doctorPracticeListDto)  {
        for (DoctorPracticeDto doctorPracticeDto : doctorPracticeListDto.getDoctorPracticeList()) {
            doctorPracticeDao.createOrUpdate(BindDoctorPractice.bindDoctorPractice(doctorPracticeDto));
        }
    }

    @Override
    public void putDoctorPractices(DoctorPracticeDto doctorPracticeDto)  {
        doctorPracticeDao.createOrUpdate(BindDoctorPractice.bindDoctorPractice(doctorPracticeDto));
    }

    @Override
    public void deleteDoctorPractices(Long medsDoctorPracticeId)  {
        doctorPracticeDao.delete(doctorPracticeDao.read(medsDoctorPracticeId));
}

}