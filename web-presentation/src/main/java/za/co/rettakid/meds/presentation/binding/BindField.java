package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindField {

    public static FieldVo bindField(FieldDto fieldDto) {
        FieldVo fieldVo = null;
        if (fieldDto != null)    {
            fieldVo = new FieldVo();
            fieldVo.setFieldId(fieldDto.getFieldId());
            fieldVo.setName(fieldDto.getName());
            fieldVo.setMapColor(fieldDto.getMapColor());
        }
        return fieldVo;
    }

    public static List<FieldVo> bindFieldDtoList(List<FieldDto> fieldDtos) {
    List<FieldVo> fieldEntities = new ArrayList<FieldVo>();
        for (FieldDto fieldDto : fieldDtos) {
            fieldEntities.add(bindField(fieldDto));
        }
        return fieldEntities;
    }

    public static FieldDto bindField(FieldVo fieldVo) {
        FieldDto fieldDto = null;
        if (fieldVo != null)    {
            fieldDto = new FieldDto();
            fieldDto.setFieldId(fieldVo.getFieldId());
            fieldDto.setName(fieldVo.getName());
            fieldDto.setMapColor(fieldVo.getMapColor());
        }
        return fieldDto;
    }

    public static List<FieldDto> bindFieldVoList(List<FieldVo> fieldVos) {
        List<FieldDto> fieldDtos = new ArrayList<FieldDto>();
        for (FieldVo fieldVo : fieldVos) {
            fieldDtos.add(bindField(fieldVo));
        }
        return fieldDtos;
    }

}
