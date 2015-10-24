package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

@Service
public class PracticeServiceImpl implements PracticeService   {

    @Autowired
    private PracticeDao practiceDao;

    @Override
    public PracticeListDto getPractices()  {
        PracticeListDto practiceListDto = new PracticeListDto();
        practiceListDto.addPracticeList(BindPractice.bindPracticeEntityList(practiceDao.read()));
        return practiceListDto;
    }
    
    @Override
    public PracticeDto getPractices(Long practiceId)  {
        return BindPractice.bindPractice(practiceDao.read(practiceId));
    }
    
    @Override
        public void postPractices(PracticeDto practiceDto)  {
        practiceDao.createOrUpdate(BindPractice.bindPractice(practiceDto));
    }

    @Override
    public void postPractices(PracticeListDto practiceListDto)  {
        for (PracticeDto practiceDto : practiceListDto.getPracticeList()) {
            practiceDao.createOrUpdate(BindPractice.bindPractice(practiceDto));
        }
    }

    @Override
    public void putPractices(PracticeDto practiceDto)  {
        practiceDao.createOrUpdate(BindPractice.bindPractice(practiceDto));
    }

    @Override
    public void deletePractices(Long practiceId)  {
        practiceDao.delete(practiceDao.read(practiceId));
}

}