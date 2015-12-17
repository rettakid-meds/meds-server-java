package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindDoctorUser {

    public static DoctorUserEntity bindDoctorUser(DoctorUserDto doctorUserDto) {
        DoctorUserEntity doctorUserEntity = null;
        if (doctorUserDto != null)    {
            doctorUserEntity = new DoctorUserEntity();
            doctorUserEntity.setDoctorUserId(doctorUserDto.getDoctorUserId());
            doctorUserEntity.setUser(BindUser.bindUser(doctorUserDto.getUser()));
            doctorUserEntity.setDoctor(BindDoctor.bindDoctor(doctorUserDto.getDoctor()));
        }
        return doctorUserEntity;
    }

    public static DoctorUserEntity bindDoctorUser(DoctorUserDto doctorUserDto,DoctorUserEntity doctorUserEntity) {
        if (doctorUserDto != null && doctorUserEntity != null)    {
            if (doctorUserEntity.getUser().getUserId() != null) {
                doctorUserEntity.setUser(BindUser.bindUser(doctorUserDto.getUser(), doctorUserEntity.getUser()));
            } else  {
                doctorUserEntity.setUser(BindUser.bindUser(doctorUserDto.getUser(), new UserEntity()));
            }
            if (doctorUserEntity.getDoctor().getDoctorId() != null) {
                doctorUserEntity.setDoctor(BindDoctor.bindDoctor(doctorUserDto.getDoctor(), doctorUserEntity.getDoctor()));
            } else  {
                doctorUserEntity.setDoctor(BindDoctor.bindDoctor(doctorUserDto.getDoctor(), new DoctorEntity()));
            }
        }
        return doctorUserEntity;
    }

    public static List<DoctorUserEntity> bindDoctorUserDtoList(List<DoctorUserDto> doctorUserDtos) {
    List<DoctorUserEntity> doctorUserEntities = new ArrayList<DoctorUserEntity>();
        for (DoctorUserDto doctorUserDto : doctorUserDtos) {
            doctorUserEntities.add(bindDoctorUser(doctorUserDto));
        }
        return doctorUserEntities;
    }

    public static DoctorUserDto bindDoctorUser(DoctorUserEntity doctorUserEntity) {
        DoctorUserDto doctorUserDto = null;
        if (doctorUserEntity != null)    {
            doctorUserDto = new DoctorUserDto();
            doctorUserDto.setDoctorUserId(doctorUserEntity.getDoctorUserId());
            doctorUserDto.setUser(BindUser.bindUser(doctorUserEntity.getUser()));
            doctorUserDto.setDoctor(BindDoctor.bindDoctor(doctorUserEntity.getDoctor()));
        }
        return doctorUserDto;
    }

    public static List<DoctorUserDto> bindDoctorUserEntityList(List<DoctorUserEntity> doctorUserEntitys) {
        List<DoctorUserDto> doctorUserDtos = new ArrayList<DoctorUserDto>();
        if (doctorUserEntitys != null)   {
            for (DoctorUserEntity doctorUserEntity : doctorUserEntitys) {
                doctorUserDtos.add(bindDoctorUser(doctorUserEntity));
            }
        }
        return doctorUserDtos;
    }

}
