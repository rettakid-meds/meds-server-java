package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DoctorUserServiceImpl implements DoctorUserService   {

    @Autowired
    private DoctorUserDao doctorUserDao;
    @Autowired
    private UserDao userDao;

    @Override
    public DoctorUserListDto getDoctorUsers()  {
        DoctorUserListDto doctorUserListDto = new DoctorUserListDto();
        doctorUserListDto.addDoctorUserList(BindDoctorUser.bindDoctorUserEntityList(doctorUserDao.read()));
        return doctorUserListDto;
    }

    @Override
    public DoctorUserDto getDoctorUsers(Long doctorUserId)  {
        return BindDoctorUser.bindDoctorUser(doctorUserDao.read(doctorUserId));
    }

    @Override
    public DoctorListDto getDoctors(Long userId)  {
        DoctorListDto doctorListDto = new DoctorListDto();
        doctorListDto.addDoctorList(BindDoctor.bindDoctorEntityList(doctorUserDao.getDoctors(userDao.read(userId))));
        return doctorListDto;
    }
    
    @Override
    public DoctorUserDto postDoctorUsers(DoctorUserDto doctorUserDto)  {
        DoctorUserEntity doctorUserEntity = BindDoctorUser.bindDoctorUser(doctorUserDto);
        doctorUserDao.createOrUpdate(doctorUserEntity);
        return BindDoctorUser.bindDoctorUser(doctorUserEntity);
}

    @Override
    public void putDoctorUsers(DoctorUserDto doctorUserDto)  {
        doctorUserDao.createOrUpdate(BindDoctorUser.bindDoctorUser(doctorUserDto));
    }

    @Override
    public void deleteDoctorUsers(Long doctorUserId)  {
        doctorUserDao.delete(doctorUserDao.read(doctorUserId));
    }

}