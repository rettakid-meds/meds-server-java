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
            practiceFieldEntity.setField(BindField.bindField(practiceFieldDto.getField()));
            practiceFieldEntity.setPractice(BindPractice.bindPractice(practiceFieldDto.getPractice()));
        }
        return practiceFieldEntity;
    }

    public static PracticeFieldEntity bindPracticeField(PracticeFieldDto practiceFieldDto,PracticeFieldEntity practiceFieldEntity) {
        if (practiceFieldDto != null && practiceFieldEntity != null)    {
            if (practiceFieldEntity.getField().getFieldId() != null) {
                practiceFieldEntity.setField(BindField.bindField(practiceFieldDto.getField(), practiceFieldEntity.getField()));
            } else  {
                practiceFieldEntity.setField(BindField.bindField(practiceFieldDto.getField(), new FieldEntity()));
            }
            if (practiceFieldEntity.getPractice().getPracticeId() != null) {
                practiceFieldEntity.setPractice(BindPractice.bindPractice(practiceFieldDto.getPractice(), practiceFieldEntity.getPractice()));
            } else  {
                practiceFieldEntity.setPractice(BindPractice.bindPractice(practiceFieldDto.getPractice(), new PracticeEntity()));
            }
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
            practiceFieldDto.setField(BindField.bindField(practiceFieldEntity.getField()));
            practiceFieldDto.setPractice(BindPractice.bindPractice(practiceFieldEntity.getPractice()));
        }
        return practiceFieldDto;
    }

    public static List<PracticeFieldDto> bindPracticeFieldEntityList(List<PracticeFieldEntity> practiceFieldEntitys) {
        List<PracticeFieldDto> practiceFieldDtos = new ArrayList<PracticeFieldDto>();
        if (practiceFieldEntitys != null)   {
            for (PracticeFieldEntity practiceFieldEntity : practiceFieldEntitys) {
                practiceFieldDtos.add(bindPracticeField(practiceFieldEntity));
            }
        }
        return practiceFieldDtos;
    }

}
