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
public class UserMedicalAidServiceImpl implements UserMedicalAidService   {

    @Autowired
    private UserMedicalAidDao userMedicalAidDao;

    @Override
    public UserMedicalAidListDto getUserMedicalAids()  {
        UserMedicalAidListDto userMedicalAidListDto = new UserMedicalAidListDto();
        userMedicalAidListDto.addUserMedicalAidList(BindUserMedicalAid.bindUserMedicalAidEntityList(userMedicalAidDao.read()));
        return userMedicalAidListDto;
    }

    @Override
    public UserMedicalAidDto getUserMedicalAids(Long userMedicalAidId)  {
        return BindUserMedicalAid.bindUserMedicalAid(userMedicalAidDao.read(userMedicalAidId));
    }
    
    @Override
    public UserMedicalAidDto postUserMedicalAids(UserMedicalAidDto userMedicalAidDto)  {
        UserMedicalAidEntity userMedicalAidEntity = BindUserMedicalAid.bindUserMedicalAid(userMedicalAidDto);
        userMedicalAidDao.createOrUpdate(userMedicalAidEntity);
        return BindUserMedicalAid.bindUserMedicalAid(userMedicalAidEntity);
}

    @Override
    public void putUserMedicalAids(UserMedicalAidDto userMedicalAidDto)  {
        userMedicalAidDao.createOrUpdate(BindUserMedicalAid.bindUserMedicalAid(userMedicalAidDto));
    }

    @Override
    public void deleteUserMedicalAids(Long userMedicalAidId)  {
        userMedicalAidDao.delete(userMedicalAidDao.read(userMedicalAidId));
    }

}