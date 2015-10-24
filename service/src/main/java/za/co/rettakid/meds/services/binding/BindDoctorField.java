package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindDoctorField {

    public static DoctorFieldEntity bindDoctorField(DoctorFieldDto doctorFieldDto) {
        DoctorFieldEntity doctorFieldEntity = null;
        if (doctorFieldDto != null)    {
            doctorFieldEntity = new DoctorFieldEntity();
            doctorFieldEntity.setDoctorFieldId(doctorFieldDto.getDoctorFieldId());
            doctorFieldEntity.setFieldEntity(BindField.bindField(doctorFieldDto.getField()));
            doctorFieldEntity.setDoctorEntity(BindDoctor.bindDoctor(doctorFieldDto.getDoctor()));
        }
        return doctorFieldEntity;
    }

    public static List<DoctorFieldEntity> bindDoctorFieldDtoList(List<DoctorFieldDto> doctorFieldDtos) {
    List<DoctorFieldEntity> doctorFieldEntities = new ArrayList<DoctorFieldEntity>();
        for (DoctorFieldDto doctorFieldDto : doctorFieldDtos) {
            doctorFieldEntities.add(bindDoctorField(doctorFieldDto));
        }
        return doctorFieldEntities;
    }

    public static DoctorFieldDto bindDoctorField(DoctorFieldEntity doctorFieldEntity) {
        DoctorFieldDto doctorFieldDto = null;
        if (doctorFieldEntity != null)    {
            doctorFieldDto = new DoctorFieldDto();
            doctorFieldDto.setDoctorFieldId(doctorFieldEntity.getDoctorFieldId());
            doctorFieldDto.setField(BindField.bindField(doctorFieldEntity.getFieldEntity()));
            doctorFieldDto.setDoctor(BindDoctor.bindDoctor(doctorFieldEntity.getDoctorEntity()));
        }
        return doctorFieldDto;
    }

    public static List<DoctorFieldDto> bindDoctorFieldEntityList(List<DoctorFieldEntity> doctorFieldEntitys) {
        List<DoctorFieldDto> doctorFieldDtos = new ArrayList<DoctorFieldDto>();
        for (DoctorFieldEntity doctorFieldEntity : doctorFieldEntitys) {
            doctorFieldDtos.add(bindDoctorField(doctorFieldEntity));
        }
        return doctorFieldDtos;
    }

}
