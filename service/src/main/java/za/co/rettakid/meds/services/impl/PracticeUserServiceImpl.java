package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.common.dto.PracticeListDto;
import za.co.rettakid.meds.common.dto.PracticeUserDto;
import za.co.rettakid.meds.common.dto.PracticeUserListDto;
import za.co.rettakid.meds.persistence.dao.PracticeUserDao;
import za.co.rettakid.meds.persistence.dao.UserDao;
import za.co.rettakid.meds.persistence.entity.PracticeUserEntity;
import za.co.rettakid.meds.services.PracticeUserService;
import za.co.rettakid.meds.services.binding.BindPractice;
import za.co.rettakid.meds.services.binding.BindPracticeUser;

@Service
public class PracticeUserServiceImpl implements PracticeUserService   {

    @Autowired
    private PracticeUserDao practiceUserDao;
    @Autowired
    private UserDao userDao;

    @Override
    public PracticeUserListDto getPracticeUsers()  {
        PracticeUserListDto practiceUserListDto = new PracticeUserListDto();
        practiceUserListDto.addPracticeUserList(BindPracticeUser.bindPracticeUserEntityList(practiceUserDao.read()));
        return practiceUserListDto;
    }

    @Override
    public PracticeListDto getPracticesForUser(Long userId)  {
        PracticeListDto practiceListDto = new PracticeListDto();
        practiceListDto.addPracticeList(BindPractice.bindPracticeEntityList(practiceUserDao.getPracticesForUser(userDao.read(userId))));
        return practiceListDto;
    }

    @Override
    public PracticeUserDto getPracticeUsers(Long practiceUserId)  {
        return BindPracticeUser.bindPracticeUser(practiceUserDao.read(practiceUserId));
    }

    @Override
    public PracticeUserDto postPracticeUsers(PracticeUserDto practiceUserDto)  {
        PracticeUserEntity practiceUserEntity = BindPracticeUser.bindPracticeUser(practiceUserDto);
        practiceUserDao.createOrUpdate(practiceUserEntity);
        return BindPracticeUser.bindPracticeUser(practiceUserEntity);
    }

    @Override
    public void putPracticeUsers(PracticeUserDto practiceUserDto)  {
        practiceUserDao.createOrUpdate(BindPracticeUser.bindPracticeUser(practiceUserDto));
    }

    @Override
    public void deletePracticeUsers(Long practiceUserId)  {
        practiceUserDao.delete(practiceUserDao.read(practiceUserId));
}

}