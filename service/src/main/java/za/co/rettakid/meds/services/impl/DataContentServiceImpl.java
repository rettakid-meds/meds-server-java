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
public class DataContentServiceImpl implements DataContentService   {

    @Autowired
    private DataContentDao dataContentDao;

    @Override
    public DataContentListDto getDataContents()  {
        DataContentListDto dataContentListDto = new DataContentListDto();
        dataContentListDto.addDataContentList(BindDataContent.bindDataContentEntityList(dataContentDao.read()));
        return dataContentListDto;
    }

    @Override
    public DataContentDto getDataContents(Long dataContentId)  {
        return BindDataContent.bindDataContent(dataContentDao.read(dataContentId));
    }
    
    @Override
    public DataContentDto postDataContents(DataContentDto dataContentDto)  {
        DataContentEntity dataContentEntity = BindDataContent.bindDataContent(dataContentDto);
        dataContentDao.createOrUpdate(dataContentEntity);
        return BindDataContent.bindDataContent(dataContentEntity);
}

    @Override
    public void putDataContents(DataContentDto dataContentDto)  {
        dataContentDao.createOrUpdate(BindDataContent.bindDataContent(dataContentDto));
    }

    @Override
    public void deleteDataContents(Long dataContentId)  {
        dataContentDao.delete(dataContentDao.read(dataContentId));
    }

}