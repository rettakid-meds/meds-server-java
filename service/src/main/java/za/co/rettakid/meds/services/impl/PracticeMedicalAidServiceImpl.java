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
public class PracticeMedicalAidServiceImpl implements PracticeMedicalAidService   {

    @Autowired
    private PracticeMedicalAidDao practiceMedicalAidDao;

    @Override
    public PracticeMedicalAidListDto getPracticeMedicalAids()  {
        PracticeMedicalAidListDto practiceMedicalAidListDto = new PracticeMedicalAidListDto();
        practiceMedicalAidListDto.addPracticeMedicalAidList(BindPracticeMedicalAid.bindPracticeMedicalAidEntityList(practiceMedicalAidDao.read()));
        return practiceMedicalAidListDto;
    }

    @Override
    public PracticeMedicalAidDto getPracticeMedicalAids(Long practiceMedicalAidId)  {
        return BindPracticeMedicalAid.bindPracticeMedicalAid(practiceMedicalAidDao.read(practiceMedicalAidId));
    }
    
    @Override
    public PracticeMedicalAidDto postPracticeMedicalAids(PracticeMedicalAidDto practiceMedicalAidDto)  {
        PracticeMedicalAidEntity practiceMedicalAidEntity = BindPracticeMedicalAid.bindPracticeMedicalAid(practiceMedicalAidDto);
        practiceMedicalAidDao.createOrUpdate(practiceMedicalAidEntity);
        return BindPracticeMedicalAid.bindPracticeMedicalAid(practiceMedicalAidEntity);
}

    @Override
    public void putPracticeMedicalAids(PracticeMedicalAidDto practiceMedicalAidDto)  {
        practiceMedicalAidDao.createOrUpdate(BindPracticeMedicalAid.bindPracticeMedicalAid(practiceMedicalAidDto));
    }

    @Override
    public void deletePracticeMedicalAids(Long practiceMedicalAidId)  {
        practiceMedicalAidDao.delete(practiceMedicalAidDao.read(practiceMedicalAidId));
    }

}