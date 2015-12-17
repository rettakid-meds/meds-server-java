package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindUserMedicalAid {

    public static UserMedicalAidVo bindUserMedicalAid(UserMedicalAidDto userMedicalAidDto) {
        UserMedicalAidVo userMedicalAidVo = null;
        if (userMedicalAidDto != null)    {
            userMedicalAidVo = new UserMedicalAidVo();
            userMedicalAidVo.setUserMedicalAidId(userMedicalAidDto.getUserMedicalAidId());
            userMedicalAidVo.setUser(BindUser.bindUser(userMedicalAidDto.getUser()));
            userMedicalAidVo.setMedicalAid(BindMedicalAid.bindMedicalAid(userMedicalAidDto.getMedicalAid()));
        }
        return userMedicalAidVo;
    }

    public static List<UserMedicalAidVo> bindUserMedicalAidDtoList(List<UserMedicalAidDto> userMedicalAidDtos) {
    List<UserMedicalAidVo> userMedicalAidEntities = new ArrayList<UserMedicalAidVo>();
        for (UserMedicalAidDto userMedicalAidDto : userMedicalAidDtos) {
            userMedicalAidEntities.add(bindUserMedicalAid(userMedicalAidDto));
        }
        return userMedicalAidEntities;
    }

    public static UserMedicalAidDto bindUserMedicalAid(UserMedicalAidVo userMedicalAidVo) {
        UserMedicalAidDto userMedicalAidDto = null;
        if (userMedicalAidVo != null)    {
            userMedicalAidDto = new UserMedicalAidDto();
            userMedicalAidDto.setUserMedicalAidId(userMedicalAidVo.getUserMedicalAidId());
            userMedicalAidDto.setUser(BindUser.bindUser(userMedicalAidVo.getUser()));
            userMedicalAidDto.setMedicalAid(BindMedicalAid.bindMedicalAid(userMedicalAidVo.getMedicalAid()));
        }
        return userMedicalAidDto;
    }

    public static List<UserMedicalAidDto> bindUserMedicalAidVoList(List<UserMedicalAidVo> userMedicalAidVos) {
        List<UserMedicalAidDto> userMedicalAidDtos = new ArrayList<UserMedicalAidDto>();
        for (UserMedicalAidVo userMedicalAidVo : userMedicalAidVos) {
            userMedicalAidDtos.add(bindUserMedicalAid(userMedicalAidVo));
        }
        return userMedicalAidDtos;
    }

}
