package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindPracticeUser {

    public static PracticeUserEntity bindPracticeUser(PracticeUserDto practiceUserDto) {
        PracticeUserEntity practiceUserEntity = null;
        if (practiceUserDto != null)    {
            practiceUserEntity = new PracticeUserEntity();
            practiceUserEntity.setPracticeUserId(practiceUserDto.getPracticeUserId());
            practiceUserEntity.setUser(BindUser.bindUser(practiceUserDto.getUser()));
            practiceUserEntity.setPractice(BindPractice.bindPractice(practiceUserDto.getPractice()));
        }
        return practiceUserEntity;
    }

    public static PracticeUserEntity bindPracticeUser(PracticeUserDto practiceUserDto,PracticeUserEntity practiceUserEntity) {
        if (practiceUserDto != null && practiceUserEntity != null)    {
            if (practiceUserEntity.getUser().getUserId() != null) {
                practiceUserEntity.setUser(BindUser.bindUser(practiceUserDto.getUser(), practiceUserEntity.getUser()));
            } else  {
                practiceUserEntity.setUser(BindUser.bindUser(practiceUserDto.getUser(), new UserEntity()));
            }
            if (practiceUserEntity.getPractice().getPracticeId() != null) {
                practiceUserEntity.setPractice(BindPractice.bindPractice(practiceUserDto.getPractice(), practiceUserEntity.getPractice()));
            } else  {
                practiceUserEntity.setPractice(BindPractice.bindPractice(practiceUserDto.getPractice(), new PracticeEntity()));
            }
        }
        return practiceUserEntity;
    }

    public static List<PracticeUserEntity> bindPracticeUserDtoList(List<PracticeUserDto> practiceUserDtos) {
    List<PracticeUserEntity> practiceUserEntities = new ArrayList<PracticeUserEntity>();
        for (PracticeUserDto practiceUserDto : practiceUserDtos) {
            practiceUserEntities.add(bindPracticeUser(practiceUserDto));
        }
        return practiceUserEntities;
    }

    public static PracticeUserDto bindPracticeUser(PracticeUserEntity practiceUserEntity) {
        PracticeUserDto practiceUserDto = null;
        if (practiceUserEntity != null)    {
            practiceUserDto = new PracticeUserDto();
            practiceUserDto.setPracticeUserId(practiceUserEntity.getPracticeUserId());
            practiceUserDto.setUser(BindUser.bindUser(practiceUserEntity.getUser()));
            practiceUserDto.setPractice(BindPractice.bindPractice(practiceUserEntity.getPractice()));
        }
        return practiceUserDto;
    }

    public static List<PracticeUserDto> bindPracticeUserEntityList(List<PracticeUserEntity> practiceUserEntitys) {
        List<PracticeUserDto> practiceUserDtos = new ArrayList<PracticeUserDto>();
        if (practiceUserEntitys != null)   {
            for (PracticeUserEntity practiceUserEntity : practiceUserEntitys) {
                practiceUserDtos.add(bindPracticeUser(practiceUserEntity));
            }
        }
        return practiceUserDtos;
    }

}
