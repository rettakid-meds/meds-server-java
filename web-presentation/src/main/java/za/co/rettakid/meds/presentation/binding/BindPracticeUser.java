package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindPracticeUser {

    public static PracticeUserVo bindPracticeUser(PracticeUserDto practiceUserDto) {
        PracticeUserVo practiceUserVo = null;
        if (practiceUserDto != null)    {
            practiceUserVo = new PracticeUserVo();
            practiceUserVo.setPracticeUserId(practiceUserDto.getPracticeUserId());
            practiceUserVo.setUser(BindUser.bindUser(practiceUserDto.getUser()));
            practiceUserVo.setPractice(BindPractice.bindPractice(practiceUserDto.getPractice()));
        }
        return practiceUserVo;
    }

    public static List<PracticeUserVo> bindPracticeUserDtoList(List<PracticeUserDto> practiceUserDtos) {
    List<PracticeUserVo> practiceUserEntities = new ArrayList<PracticeUserVo>();
        for (PracticeUserDto practiceUserDto : practiceUserDtos) {
            practiceUserEntities.add(bindPracticeUser(practiceUserDto));
        }
        return practiceUserEntities;
    }

    public static PracticeUserDto bindPracticeUser(PracticeUserVo practiceUserVo) {
        PracticeUserDto practiceUserDto = null;
        if (practiceUserVo != null)    {
            practiceUserDto = new PracticeUserDto();
            practiceUserDto.setPracticeUserId(practiceUserVo.getPracticeUserId());
            practiceUserDto.setUser(BindUser.bindUser(practiceUserVo.getUser()));
            practiceUserDto.setPractice(BindPractice.bindPractice(practiceUserVo.getPractice()));
        }
        return practiceUserDto;
    }

    public static List<PracticeUserDto> bindPracticeUserVoList(List<PracticeUserVo> practiceUserVos) {
        List<PracticeUserDto> practiceUserDtos = new ArrayList<PracticeUserDto>();
        for (PracticeUserVo practiceUserVo : practiceUserVos) {
            practiceUserDtos.add(bindPracticeUser(practiceUserVo));
        }
        return practiceUserDtos;
    }

}
