package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindPracticeField {

    public static PracticeFieldVo bindPracticeField(PracticeFieldDto practiceFieldDto) {
        PracticeFieldVo practiceFieldVo = null;
        if (practiceFieldDto != null)    {
            practiceFieldVo = new PracticeFieldVo();
            practiceFieldVo.setPracticeFieldId(practiceFieldDto.getPracticeFieldId());
            practiceFieldVo.setField(BindField.bindField(practiceFieldDto.getField()));
            practiceFieldVo.setPractice(BindPractice.bindPractice(practiceFieldDto.getPractice()));
        }
        return practiceFieldVo;
    }

    public static List<PracticeFieldVo> bindPracticeFieldDtoList(List<PracticeFieldDto> practiceFieldDtos) {
    List<PracticeFieldVo> practiceFieldEntities = new ArrayList<PracticeFieldVo>();
        for (PracticeFieldDto practiceFieldDto : practiceFieldDtos) {
            practiceFieldEntities.add(bindPracticeField(practiceFieldDto));
        }
        return practiceFieldEntities;
    }

    public static PracticeFieldDto bindPracticeField(PracticeFieldVo practiceFieldVo) {
        PracticeFieldDto practiceFieldDto = null;
        if (practiceFieldVo != null)    {
            practiceFieldDto = new PracticeFieldDto();
            practiceFieldDto.setPracticeFieldId(practiceFieldVo.getPracticeFieldId());
            practiceFieldDto.setField(BindField.bindField(practiceFieldVo.getField()));
            practiceFieldDto.setPractice(BindPractice.bindPractice(practiceFieldVo.getPractice()));
        }
        return practiceFieldDto;
    }

    public static List<PracticeFieldDto> bindPracticeFieldVoList(List<PracticeFieldVo> practiceFieldVos) {
        List<PracticeFieldDto> practiceFieldDtos = new ArrayList<PracticeFieldDto>();
        for (PracticeFieldVo practiceFieldVo : practiceFieldVos) {
            practiceFieldDtos.add(bindPracticeField(practiceFieldVo));
        }
        return practiceFieldDtos;
    }

}
