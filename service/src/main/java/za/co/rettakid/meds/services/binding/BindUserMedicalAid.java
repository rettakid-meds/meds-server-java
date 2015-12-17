package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindUserMedicalAid {

    public static UserMedicalAidEntity bindUserMedicalAid(UserMedicalAidDto userMedicalAidDto) {
        UserMedicalAidEntity userMedicalAidEntity = null;
        if (userMedicalAidDto != null)    {
            userMedicalAidEntity = new UserMedicalAidEntity();
            userMedicalAidEntity.setUserMedicalAidId(userMedicalAidDto.getUserMedicalAidId());
            userMedicalAidEntity.setUser(BindUser.bindUser(userMedicalAidDto.getUser()));
            userMedicalAidEntity.setMedicalAid(BindMedicalAid.bindMedicalAid(userMedicalAidDto.getMedicalAid()));
        }
        return userMedicalAidEntity;
    }

    public static UserMedicalAidEntity bindUserMedicalAid(UserMedicalAidDto userMedicalAidDto,UserMedicalAidEntity userMedicalAidEntity) {
        if (userMedicalAidDto != null && userMedicalAidEntity != null)    {
            if (userMedicalAidEntity.getUser().getUserId() != null) {
                userMedicalAidEntity.setUser(BindUser.bindUser(userMedicalAidDto.getUser(), userMedicalAidEntity.getUser()));
            } else  {
                userMedicalAidEntity.setUser(BindUser.bindUser(userMedicalAidDto.getUser(), new UserEntity()));
            }
            if (userMedicalAidEntity.getMedicalAid().getMedicalAidId() != null) {
                userMedicalAidEntity.setMedicalAid(BindMedicalAid.bindMedicalAid(userMedicalAidDto.getMedicalAid(), userMedicalAidEntity.getMedicalAid()));
            } else  {
                userMedicalAidEntity.setMedicalAid(BindMedicalAid.bindMedicalAid(userMedicalAidDto.getMedicalAid(), new MedicalAidEntity()));
            }
        }
        return userMedicalAidEntity;
    }

    public static List<UserMedicalAidEntity> bindUserMedicalAidDtoList(List<UserMedicalAidDto> userMedicalAidDtos) {
    List<UserMedicalAidEntity> userMedicalAidEntities = new ArrayList<UserMedicalAidEntity>();
        for (UserMedicalAidDto userMedicalAidDto : userMedicalAidDtos) {
            userMedicalAidEntities.add(bindUserMedicalAid(userMedicalAidDto));
        }
        return userMedicalAidEntities;
    }

    public static UserMedicalAidDto bindUserMedicalAid(UserMedicalAidEntity userMedicalAidEntity) {
        UserMedicalAidDto userMedicalAidDto = null;
        if (userMedicalAidEntity != null)    {
            userMedicalAidDto = new UserMedicalAidDto();
            userMedicalAidDto.setUserMedicalAidId(userMedicalAidEntity.getUserMedicalAidId());
            userMedicalAidDto.setUser(BindUser.bindUser(userMedicalAidEntity.getUser()));
            userMedicalAidDto.setMedicalAid(BindMedicalAid.bindMedicalAid(userMedicalAidEntity.getMedicalAid()));
        }
        return userMedicalAidDto;
    }

    public static List<UserMedicalAidDto> bindUserMedicalAidEntityList(List<UserMedicalAidEntity> userMedicalAidEntitys) {
        List<UserMedicalAidDto> userMedicalAidDtos = new ArrayList<UserMedicalAidDto>();
        if (userMedicalAidEntitys != null)   {
            for (UserMedicalAidEntity userMedicalAidEntity : userMedicalAidEntitys) {
                userMedicalAidDtos.add(bindUserMedicalAid(userMedicalAidEntity));
            }
        }
        return userMedicalAidDtos;
    }

}
