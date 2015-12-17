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
public class PracticeFieldServiceImpl implements PracticeFieldService   {

    @Autowired
    private PracticeFieldDao practiceFieldDao;

    @Override
    public PracticeFieldListDto getPracticeFields()  {
        PracticeFieldListDto practiceFieldListDto = new PracticeFieldListDto();
        practiceFieldListDto.addPracticeFieldList(BindPracticeField.bindPracticeFieldEntityList(practiceFieldDao.read()));
        return practiceFieldListDto;
    }

    @Override
    public PracticeFieldDto getPracticeFields(Long practiceFieldId)  {
        return BindPracticeField.bindPracticeField(practiceFieldDao.read(practiceFieldId));
    }
    
    @Override
    public PracticeFieldDto postPracticeFields(PracticeFieldDto practiceFieldDto)  {
        PracticeFieldEntity practiceFieldEntity = BindPracticeField.bindPracticeField(practiceFieldDto);
        practiceFieldDao.createOrUpdate(practiceFieldEntity);
        return BindPracticeField.bindPracticeField(practiceFieldEntity);
}

    @Override
    public void putPracticeFields(PracticeFieldDto practiceFieldDto)  {
        practiceFieldDao.createOrUpdate(BindPracticeField.bindPracticeField(practiceFieldDto));
    }

    @Override
    public void deletePracticeFields(Long practiceFieldId)  {
        practiceFieldDao.delete(practiceFieldDao.read(practiceFieldId));
    }

}