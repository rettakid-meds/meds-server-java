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
public class MedicalAidServiceImpl implements MedicalAidService   {

    @Autowired
    private MedicalAidDao medicalAidDao;

    @Override
    public MedicalAidListDto getMedicalAids()  {
        MedicalAidListDto medicalAidListDto = new MedicalAidListDto();
        medicalAidListDto.addMedicalAidList(BindMedicalAid.bindMedicalAidEntityList(medicalAidDao.read()));
        return medicalAidListDto;
    }

    @Override
    public MedicalAidDto getMedicalAids(Long medicalAidId)  {
        return BindMedicalAid.bindMedicalAid(medicalAidDao.read(medicalAidId));
    }
    
    @Override
    public MedicalAidDto postMedicalAids(MedicalAidDto medicalAidDto)  {
        MedicalAidEntity medicalAidEntity = BindMedicalAid.bindMedicalAid(medicalAidDto);
        medicalAidDao.createOrUpdate(medicalAidEntity);
        return BindMedicalAid.bindMedicalAid(medicalAidEntity);
}

    @Override
    public void putMedicalAids(MedicalAidDto medicalAidDto)  {
        medicalAidDao.createOrUpdate(BindMedicalAid.bindMedicalAid(medicalAidDto));
    }

    @Override
    public void deleteMedicalAids(Long medicalAidId)  {
        medicalAidDao.delete(medicalAidDao.read(medicalAidId));
    }

}