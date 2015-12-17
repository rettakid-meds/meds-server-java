package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindField {

    public static FieldEntity bindField(FieldDto fieldDto) {
        FieldEntity fieldEntity = null;
        if (fieldDto != null)    {
            fieldEntity = new FieldEntity();
            fieldEntity.setFieldId(fieldDto.getFieldId());
            fieldEntity.setName(fieldDto.getName());
            fieldEntity.setMapColor(fieldDto.getMapColor());
        }
        return fieldEntity;
    }

    public static FieldEntity bindField(FieldDto fieldDto,FieldEntity fieldEntity) {
        if (fieldDto != null && fieldEntity != null)    {
            fieldEntity.setName(fieldDto.getName());
            fieldEntity.setMapColor(fieldDto.getMapColor());
        }
        return fieldEntity;
    }

    public static List<FieldEntity> bindFieldDtoList(List<FieldDto> fieldDtos) {
    List<FieldEntity> fieldEntities = new ArrayList<FieldEntity>();
        for (FieldDto fieldDto : fieldDtos) {
            fieldEntities.add(bindField(fieldDto));
        }
        return fieldEntities;
    }

    public static FieldDto bindField(FieldEntity fieldEntity) {
        FieldDto fieldDto = null;
        if (fieldEntity != null)    {
            fieldDto = new FieldDto();
            fieldDto.setFieldId(fieldEntity.getFieldId());
            fieldDto.setName(fieldEntity.getName());
            fieldDto.setMapColor(fieldEntity.getMapColor());
        }
        return fieldDto;
    }

    public static List<FieldDto> bindFieldEntityList(List<FieldEntity> fieldEntitys) {
        List<FieldDto> fieldDtos = new ArrayList<FieldDto>();
        if (fieldEntitys != null)   {
            for (FieldEntity fieldEntity : fieldEntitys) {
                fieldDtos.add(bindField(fieldEntity));
            }
        }
        return fieldDtos;
    }

}
