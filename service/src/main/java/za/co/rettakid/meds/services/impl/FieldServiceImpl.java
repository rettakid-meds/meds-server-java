package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

@Service
public class FieldServiceImpl implements FieldService   {

    @Autowired
    private FieldDao fieldDao;

    @Override
    public FieldListDto getFields()  {
        FieldListDto fieldListDto = new FieldListDto();
        fieldListDto.addFieldList(BindField.bindFieldEntityList(fieldDao.read()));
        return fieldListDto;
    }
    
    @Override
    public FieldDto getFields(Long fieldId)  {
        return BindField.bindField(fieldDao.read(fieldId));
    }
    
    @Override
        public void postFields(FieldDto fieldDto)  {
        fieldDao.createOrUpdate(BindField.bindField(fieldDto));
    }

    @Override
    public void postFields(FieldListDto fieldListDto)  {
        for (FieldDto fieldDto : fieldListDto.getFieldList()) {
            fieldDao.createOrUpdate(BindField.bindField(fieldDto));
        }
    }

    @Override
    public void putFields(FieldDto fieldDto)  {
        fieldDao.createOrUpdate(BindField.bindField(fieldDto));
    }

    @Override
    public void deleteFields(Long fieldId)  {
        fieldDao.delete(fieldDao.read(fieldId));
}

}