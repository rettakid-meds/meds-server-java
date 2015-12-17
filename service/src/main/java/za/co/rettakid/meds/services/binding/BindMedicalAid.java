package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindMedicalAid {

    public static MedicalAidEntity bindMedicalAid(MedicalAidDto medicalAidDto) {
        MedicalAidEntity medicalAidEntity = null;
        if (medicalAidDto != null)    {
            medicalAidEntity = new MedicalAidEntity();
            medicalAidEntity.setMedicalAidId(medicalAidDto.getMedicalAidId());
            medicalAidEntity.setMedicalAidName(medicalAidDto.getMedicalAidName());
        }
        return medicalAidEntity;
    }

    public static MedicalAidEntity bindMedicalAid(MedicalAidDto medicalAidDto,MedicalAidEntity medicalAidEntity) {
        if (medicalAidDto != null && medicalAidEntity != null)    {
            medicalAidEntity.setMedicalAidName(medicalAidDto.getMedicalAidName());
        }
        return medicalAidEntity;
    }

    public static List<MedicalAidEntity> bindMedicalAidDtoList(List<MedicalAidDto> medicalAidDtos) {
    List<MedicalAidEntity> medicalAidEntities = new ArrayList<MedicalAidEntity>();
        for (MedicalAidDto medicalAidDto : medicalAidDtos) {
            medicalAidEntities.add(bindMedicalAid(medicalAidDto));
        }
        return medicalAidEntities;
    }

    public static MedicalAidDto bindMedicalAid(MedicalAidEntity medicalAidEntity) {
        MedicalAidDto medicalAidDto = null;
        if (medicalAidEntity != null)    {
            medicalAidDto = new MedicalAidDto();
            medicalAidDto.setMedicalAidId(medicalAidEntity.getMedicalAidId());
            medicalAidDto.setMedicalAidName(medicalAidEntity.getMedicalAidName());
        }
        return medicalAidDto;
    }

    public static List<MedicalAidDto> bindMedicalAidEntityList(List<MedicalAidEntity> medicalAidEntitys) {
        List<MedicalAidDto> medicalAidDtos = new ArrayList<MedicalAidDto>();
        if (medicalAidEntitys != null)   {
            for (MedicalAidEntity medicalAidEntity : medicalAidEntitys) {
                medicalAidDtos.add(bindMedicalAid(medicalAidEntity));
            }
        }
        return medicalAidDtos;
    }

}
