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
            doctorFieldEntity.setField(BindField.bindField(doctorFieldDto.getField()));
            doctorFieldEntity.setDoctor(BindDoctor.bindDoctor(doctorFieldDto.getDoctor()));
        }
        return doctorFieldEntity;
    }

    public static DoctorFieldEntity bindDoctorField(DoctorFieldDto doctorFieldDto,DoctorFieldEntity doctorFieldEntity) {
        if (doctorFieldDto != null && doctorFieldEntity != null)    {
            if (doctorFieldEntity.getField().getFieldId() != null) {
                doctorFieldEntity.setField(BindField.bindField(doctorFieldDto.getField(), doctorFieldEntity.getField()));
            } else  {
                doctorFieldEntity.setField(BindField.bindField(doctorFieldDto.getField(), new FieldEntity()));
            }
            if (doctorFieldEntity.getDoctor().getDoctorId() != null) {
                doctorFieldEntity.setDoctor(BindDoctor.bindDoctor(doctorFieldDto.getDoctor(), doctorFieldEntity.getDoctor()));
            } else  {
                doctorFieldEntity.setDoctor(BindDoctor.bindDoctor(doctorFieldDto.getDoctor(), new DoctorEntity()));
            }
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
            doctorFieldDto.setField(BindField.bindField(doctorFieldEntity.getField()));
            doctorFieldDto.setDoctor(BindDoctor.bindDoctor(doctorFieldEntity.getDoctor()));
        }
        return doctorFieldDto;
    }

    public static List<DoctorFieldDto> bindDoctorFieldEntityList(List<DoctorFieldEntity> doctorFieldEntitys) {
        List<DoctorFieldDto> doctorFieldDtos = new ArrayList<DoctorFieldDto>();
        if (doctorFieldEntitys != null)   {
            for (DoctorFieldEntity doctorFieldEntity : doctorFieldEntitys) {
                doctorFieldDtos.add(bindDoctorField(doctorFieldEntity));
            }
        }
        return doctorFieldDtos;
    }

}
