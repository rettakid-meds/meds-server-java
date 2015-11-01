package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindDoctor {

    public static DoctorEntity bindDoctor(DoctorDto doctorDto) {
        DoctorEntity doctorEntity = null;
        if (doctorDto != null)    {
            doctorEntity = new DoctorEntity();
            doctorEntity.setDoctorId(doctorDto.getDoctorId());
            doctorEntity.setUser(BindUser.bindUser(doctorDto.getUser()));
            doctorEntity.setIcon(BindImage.bindImage(doctorDto.getIcon()));
            doctorEntity.setImage(BindImage.bindImage(doctorDto.getImage()));
            doctorEntity.setBio(BindDataContent.bindDataContent(doctorDto.getBio()));
        }
        return doctorEntity;
    }

    public static List<DoctorEntity> bindDoctorDtoList(List<DoctorDto> doctorDtos) {
    List<DoctorEntity> doctorEntities = new ArrayList<DoctorEntity>();
        for (DoctorDto doctorDto : doctorDtos) {
            doctorEntities.add(bindDoctor(doctorDto));
        }
        return doctorEntities;
    }

    public static DoctorDto bindDoctor(DoctorEntity doctorEntity) {
        DoctorDto doctorDto = null;
        if (doctorEntity != null)    {
            doctorDto = new DoctorDto();
            doctorDto.setDoctorId(doctorEntity.getDoctorId());
            doctorDto.setUser(BindUser.bindUser(doctorEntity.getUser()));
            doctorDto.setIcon(BindImage.bindImage(doctorEntity.getIcon()));
            doctorDto.setImage(BindImage.bindImage(doctorEntity.getImage()));
            doctorDto.setBio(BindDataContent.bindDataContent(doctorEntity.getBio()));
        }
        return doctorDto;
    }

    public static List<DoctorDto> bindDoctorEntityList(List<DoctorEntity> doctorEntitys) {
        List<DoctorDto> doctorDtos = new ArrayList<DoctorDto>();
        for (DoctorEntity doctorEntity : doctorEntitys) {
            doctorDtos.add(bindDoctor(doctorEntity));
        }
        return doctorDtos;
    }

}
