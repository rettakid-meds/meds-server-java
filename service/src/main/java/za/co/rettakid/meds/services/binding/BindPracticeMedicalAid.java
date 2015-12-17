package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindPracticeMedicalAid {

    public static PracticeMedicalAidEntity bindPracticeMedicalAid(PracticeMedicalAidDto practiceMedicalAidDto) {
        PracticeMedicalAidEntity practiceMedicalAidEntity = null;
        if (practiceMedicalAidDto != null)    {
            practiceMedicalAidEntity = new PracticeMedicalAidEntity();
            practiceMedicalAidEntity.setPracticeMedicalAidId(practiceMedicalAidDto.getPracticeMedicalAidId());
            practiceMedicalAidEntity.setPractice(BindPractice.bindPractice(practiceMedicalAidDto.getPractice()));
            practiceMedicalAidEntity.setMedicalAid(BindMedicalAid.bindMedicalAid(practiceMedicalAidDto.getMedicalAid()));
        }
        return practiceMedicalAidEntity;
    }

    public static PracticeMedicalAidEntity bindPracticeMedicalAid(PracticeMedicalAidDto practiceMedicalAidDto,PracticeMedicalAidEntity practiceMedicalAidEntity) {
        if (practiceMedicalAidDto != null && practiceMedicalAidEntity != null)    {
            if (practiceMedicalAidEntity.getPractice().getPracticeId() != null) {
                practiceMedicalAidEntity.setPractice(BindPractice.bindPractice(practiceMedicalAidDto.getPractice(), practiceMedicalAidEntity.getPractice()));
            } else  {
                practiceMedicalAidEntity.setPractice(BindPractice.bindPractice(practiceMedicalAidDto.getPractice(), new PracticeEntity()));
            }
            if (practiceMedicalAidEntity.getMedicalAid().getMedicalAidId() != null) {
                practiceMedicalAidEntity.setMedicalAid(BindMedicalAid.bindMedicalAid(practiceMedicalAidDto.getMedicalAid(), practiceMedicalAidEntity.getMedicalAid()));
            } else  {
                practiceMedicalAidEntity.setMedicalAid(BindMedicalAid.bindMedicalAid(practiceMedicalAidDto.getMedicalAid(), new MedicalAidEntity()));
            }
        }
        return practiceMedicalAidEntity;
    }

    public static List<PracticeMedicalAidEntity> bindPracticeMedicalAidDtoList(List<PracticeMedicalAidDto> practiceMedicalAidDtos) {
    List<PracticeMedicalAidEntity> practiceMedicalAidEntities = new ArrayList<PracticeMedicalAidEntity>();
        for (PracticeMedicalAidDto practiceMedicalAidDto : practiceMedicalAidDtos) {
            practiceMedicalAidEntities.add(bindPracticeMedicalAid(practiceMedicalAidDto));
        }
        return practiceMedicalAidEntities;
    }

    public static PracticeMedicalAidDto bindPracticeMedicalAid(PracticeMedicalAidEntity practiceMedicalAidEntity) {
        PracticeMedicalAidDto practiceMedicalAidDto = null;
        if (practiceMedicalAidEntity != null)    {
            practiceMedicalAidDto = new PracticeMedicalAidDto();
            practiceMedicalAidDto.setPracticeMedicalAidId(practiceMedicalAidEntity.getPracticeMedicalAidId());
            practiceMedicalAidDto.setPractice(BindPractice.bindPractice(practiceMedicalAidEntity.getPractice()));
            practiceMedicalAidDto.setMedicalAid(BindMedicalAid.bindMedicalAid(practiceMedicalAidEntity.getMedicalAid()));
        }
        return practiceMedicalAidDto;
    }

    public static List<PracticeMedicalAidDto> bindPracticeMedicalAidEntityList(List<PracticeMedicalAidEntity> practiceMedicalAidEntitys) {
        List<PracticeMedicalAidDto> practiceMedicalAidDtos = new ArrayList<PracticeMedicalAidDto>();
        if (practiceMedicalAidEntitys != null)   {
            for (PracticeMedicalAidEntity practiceMedicalAidEntity : practiceMedicalAidEntitys) {
                practiceMedicalAidDtos.add(bindPracticeMedicalAid(practiceMedicalAidEntity));
            }
        }
        return practiceMedicalAidDtos;
    }

}
