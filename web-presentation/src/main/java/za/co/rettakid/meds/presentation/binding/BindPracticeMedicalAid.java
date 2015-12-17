package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindPracticeMedicalAid {

    public static PracticeMedicalAidVo bindPracticeMedicalAid(PracticeMedicalAidDto practiceMedicalAidDto) {
        PracticeMedicalAidVo practiceMedicalAidVo = null;
        if (practiceMedicalAidDto != null)    {
            practiceMedicalAidVo = new PracticeMedicalAidVo();
            practiceMedicalAidVo.setPracticeMedicalAidId(practiceMedicalAidDto.getPracticeMedicalAidId());
            practiceMedicalAidVo.setPractice(BindPractice.bindPractice(practiceMedicalAidDto.getPractice()));
            practiceMedicalAidVo.setMedicalAid(BindMedicalAid.bindMedicalAid(practiceMedicalAidDto.getMedicalAid()));
        }
        return practiceMedicalAidVo;
    }

    public static List<PracticeMedicalAidVo> bindPracticeMedicalAidDtoList(List<PracticeMedicalAidDto> practiceMedicalAidDtos) {
    List<PracticeMedicalAidVo> practiceMedicalAidEntities = new ArrayList<PracticeMedicalAidVo>();
        for (PracticeMedicalAidDto practiceMedicalAidDto : practiceMedicalAidDtos) {
            practiceMedicalAidEntities.add(bindPracticeMedicalAid(practiceMedicalAidDto));
        }
        return practiceMedicalAidEntities;
    }

    public static PracticeMedicalAidDto bindPracticeMedicalAid(PracticeMedicalAidVo practiceMedicalAidVo) {
        PracticeMedicalAidDto practiceMedicalAidDto = null;
        if (practiceMedicalAidVo != null)    {
            practiceMedicalAidDto = new PracticeMedicalAidDto();
            practiceMedicalAidDto.setPracticeMedicalAidId(practiceMedicalAidVo.getPracticeMedicalAidId());
            practiceMedicalAidDto.setPractice(BindPractice.bindPractice(practiceMedicalAidVo.getPractice()));
            practiceMedicalAidDto.setMedicalAid(BindMedicalAid.bindMedicalAid(practiceMedicalAidVo.getMedicalAid()));
        }
        return practiceMedicalAidDto;
    }

    public static List<PracticeMedicalAidDto> bindPracticeMedicalAidVoList(List<PracticeMedicalAidVo> practiceMedicalAidVos) {
        List<PracticeMedicalAidDto> practiceMedicalAidDtos = new ArrayList<PracticeMedicalAidDto>();
        for (PracticeMedicalAidVo practiceMedicalAidVo : practiceMedicalAidVos) {
            practiceMedicalAidDtos.add(bindPracticeMedicalAid(practiceMedicalAidVo));
        }
        return practiceMedicalAidDtos;
    }

}
