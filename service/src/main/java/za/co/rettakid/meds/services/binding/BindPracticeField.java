package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindPracticeField {

    public static PracticeFieldEntity bindPracticeField(PracticeFieldDto practiceFieldDto) {
        PracticeFieldEntity practiceFieldEntity = null;
        if (practiceFieldDto != null)    {
            practiceFieldEntity = new PracticeFieldEntity();
            practiceFieldEntity.setPracticeFieldId(practiceFieldDto.getPracticeFieldId());
            practiceFieldEntity.setFieldEntity(BindField.bindField(practiceFieldDto.getField()));
            practiceFieldEntity.setPracticeEntity(BindPractice.bindPractice(practiceFieldDto.getPractice()));
        }
        return practiceFieldEntity;
    }

    public static List<PracticeFieldEntity> bindPracticeFieldDtoList(List<PracticeFieldDto> practiceFieldDtos) {
    List<PracticeFieldEntity> practiceFieldEntities = new ArrayList<PracticeFieldEntity>();
        for (PracticeFieldDto practiceFieldDto : practiceFieldDtos) {
            practiceFieldEntities.add(bindPracticeField(practiceFieldDto));
        }
        return practiceFieldEntities;
    }

    public static PracticeFieldDto bindPracticeField(PracticeFieldEntity practiceFieldEntity) {
        PracticeFieldDto practiceFieldDto = null;
        if (practiceFieldEntity != null)    {
            practiceFieldDto = new PracticeFieldDto();
            practiceFieldDto.setPracticeFieldId(practiceFieldEntity.getPracticeFieldId());
            practiceFieldDto.setField(BindField.bindField(practiceFieldEntity.getFieldEntity()));
            practiceFieldDto.setPractice(BindPractice.bindPractice(practiceFieldEntity.getPracticeEntity()));
        }
        return practiceFieldDto;
    }

    public static List<PracticeFieldDto> bindPracticeFieldEntityList(List<PracticeFieldEntity> practiceFieldEntitys) {
        List<PracticeFieldDto> practiceFieldDtos = new ArrayList<PracticeFieldDto>();
        for (PracticeFieldEntity practiceFieldEntity : practiceFieldEntitys) {
            practiceFieldDtos.add(bindPracticeField(practiceFieldEntity));
        }
        return practiceFieldDtos;
    }

}
