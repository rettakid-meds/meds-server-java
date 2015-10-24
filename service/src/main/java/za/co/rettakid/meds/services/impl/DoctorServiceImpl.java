package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

@Service
public class DoctorServiceImpl implements DoctorService   {

    @Autowired
    private DoctorDao doctorDao;

    @Override
    public DoctorListDto getDoctors()  {
        DoctorListDto doctorListDto = new DoctorListDto();
        doctorListDto.addDoctorList(BindDoctor.bindDoctorEntityList(doctorDao.read()));
        return doctorListDto;
    }
    
    @Override
    public DoctorDto getDoctors(Long doctorId)  {
        return BindDoctor.bindDoctor(doctorDao.read(doctorId));
    }
    
    @Override
        public void postDoctors(DoctorDto doctorDto)  {
        doctorDao.createOrUpdate(BindDoctor.bindDoctor(doctorDto));
    }

    @Override
    public void postDoctors(DoctorListDto doctorListDto)  {
        for (DoctorDto doctorDto : doctorListDto.getDoctorList()) {
            doctorDao.createOrUpdate(BindDoctor.bindDoctor(doctorDto));
        }
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