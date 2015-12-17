package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
@Transactional
public class DoctorFieldServiceImpl implements DoctorFieldService   {

    @Autowired
    private DoctorFieldDao doctorFieldDao;

    @Override
    public DoctorFieldListDto getDoctorFields()  {
        DoctorFieldListDto doctorFieldListDto = new DoctorFieldListDto();
        doctorFieldListDto.addDoctorFieldList(BindDoctorField.bindDoctorFieldEntityList(doctorFieldDao.read()));
        return doctorFieldListDto;
    }

    @Override
    public DoctorFieldDto getDoctorFields(Long doctorFieldId)  {
        return BindDoctorField.bindDoctorField(doctorFieldDao.read(doctorFieldId));
    }
    
    @Override
    public DoctorFieldDto postDoctorFields(DoctorFieldDto doctorFieldDto)  {
        DoctorFieldEntity doctorFieldEntity = BindDoctorField.bindDoctorField(doctorFieldDto);
        doctorFieldDao.createOrUpdate(doctorFieldEntity);
        return BindDoctorField.bindDoctorField(doctorFieldEntity);
}

    @Override
    public void putDoctorFields(DoctorFieldDto doctorFieldDto)  {
        doctorFieldDao.createOrUpdate(BindDoctorField.bindDoctorField(doctorFieldDto));
    }

    @Override
    public void deleteDoctorFields(Long doctorFieldId)  {
        doctorFieldDao.delete(doctorFieldDao.read(doctorFieldId));
    }

}