package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindDoctorPractice {

    public static DoctorPracticeEntity bindDoctorPractice(DoctorPracticeDto doctorPracticeDto) {
        DoctorPracticeEntity doctorPracticeEntity = null;
        if (doctorPracticeDto != null)    {
            doctorPracticeEntity = new DoctorPracticeEntity();
            doctorPracticeEntity.setMedsDoctorPracticeId(doctorPracticeDto.getMedsDoctorPracticeId());
            doctorPracticeEntity.setPractice(BindPractice.bindPractice(doctorPracticeDto.getPractice()));
            doctorPracticeEntity.setDoctor(BindDoctor.bindDoctor(doctorPracticeDto.getDoctor()));
        }
        return doctorPracticeEntity;
    }

    public static List<DoctorPracticeEntity> bindDoctorPracticeDtoList(List<DoctorPracticeDto> doctorPracticeDtos) {
    List<DoctorPracticeEntity> doctorPracticeEntities = new ArrayList<DoctorPracticeEntity>();
        for (DoctorPracticeDto doctorPracticeDto : doctorPracticeDtos) {
            doctorPracticeEntities.add(bindDoctorPractice(doctorPracticeDto));
        }
        return doctorPracticeEntities;
    }

    public static DoctorPracticeDto bindDoctorPractice(DoctorPracticeEntity doctorPracticeEntity) {
        DoctorPracticeDto doctorPracticeDto = null;
        if (doctorPracticeEntity != null)    {
            doctorPracticeDto = new DoctorPracticeDto();
            doctorPracticeDto.setMedsDoctorPracticeId(doctorPracticeEntity.getMedsDoctorPracticeId());
            doctorPracticeDto.setPractice(BindPractice.bindPractice(doctorPracticeEntity.getPractice()));
            doctorPracticeDto.setDoctor(BindDoctor.bindDoctor(doctorPracticeEntity.getDoctor()));
        }
        return doctorPracticeDto;
    }

    public static List<DoctorPracticeDto> bindDoctorPracticeEntityList(List<DoctorPracticeEntity> doctorPracticeEntitys) {
        List<DoctorPracticeDto> doctorPracticeDtos = new ArrayList<DoctorPracticeDto>();
        for (DoctorPracticeEntity doctorPracticeEntity : doctorPracticeEntitys) {
            doctorPracticeDtos.add(bindDoctorPractice(doctorPracticeEntity));
        }
        return doctorPracticeDtos;
    }

}
