package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindMedicalAid {

    public static MedicalAidVo bindMedicalAid(MedicalAidDto medicalAidDto) {
        MedicalAidVo medicalAidVo = null;
        if (medicalAidDto != null)    {
            medicalAidVo = new MedicalAidVo();
            medicalAidVo.setMedicalAidId(medicalAidDto.getMedicalAidId());
            medicalAidVo.setMedicalAidName(medicalAidDto.getMedicalAidName());
        }
        return medicalAidVo;
    }

    public static List<MedicalAidVo> bindMedicalAidDtoList(List<MedicalAidDto> medicalAidDtos) {
    List<MedicalAidVo> medicalAidEntities = new ArrayList<MedicalAidVo>();
        for (MedicalAidDto medicalAidDto : medicalAidDtos) {
            medicalAidEntities.add(bindMedicalAid(medicalAidDto));
        }
        return medicalAidEntities;
    }

    public static MedicalAidDto bindMedicalAid(MedicalAidVo medicalAidVo) {
        MedicalAidDto medicalAidDto = null;
        if (medicalAidVo != null)    {
            medicalAidDto = new MedicalAidDto();
            medicalAidDto.setMedicalAidId(medicalAidVo.getMedicalAidId());
            medicalAidDto.setMedicalAidName(medicalAidVo.getMedicalAidName());
        }
        return medicalAidDto;
    }

    public static List<MedicalAidDto> bindMedicalAidVoList(List<MedicalAidVo> medicalAidVos) {
        List<MedicalAidDto> medicalAidDtos = new ArrayList<MedicalAidDto>();
        for (MedicalAidVo medicalAidVo : medicalAidVos) {
            medicalAidDtos.add(bindMedicalAid(medicalAidVo));
        }
        return medicalAidDtos;
    }

}
