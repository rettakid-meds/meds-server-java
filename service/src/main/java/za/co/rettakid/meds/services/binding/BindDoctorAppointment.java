package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindDoctorAppointment {

    public static DoctorAppointmentEntity bindDoctorAppointment(DoctorAppointmentDto doctorAppointmentDto) {
        DoctorAppointmentEntity doctorAppointmentEntity = null;
        if (doctorAppointmentDto != null)    {
            doctorAppointmentEntity = new DoctorAppointmentEntity();
            doctorAppointmentEntity.setMedsDoctorAppointmentId(doctorAppointmentDto.getMedsDoctorAppointmentId());
            doctorAppointmentEntity.setAppointmentEntity(BindAppointment.bindAppointment(doctorAppointmentDto.getAppointment()));
            doctorAppointmentEntity.setDoctorEntity(BindDoctor.bindDoctor(doctorAppointmentDto.getDoctor()));
        }
        return doctorAppointmentEntity;
    }

    public static List<DoctorAppointmentEntity> bindDoctorAppointmentDtoList(List<DoctorAppointmentDto> doctorAppointmentDtos) {
    List<DoctorAppointmentEntity> doctorAppointmentEntities = new ArrayList<DoctorAppointmentEntity>();
        for (DoctorAppointmentDto doctorAppointmentDto : doctorAppointmentDtos) {
            doctorAppointmentEntities.add(bindDoctorAppointment(doctorAppointmentDto));
        }
        return doctorAppointmentEntities;
    }

    public static DoctorAppointmentDto bindDoctorAppointment(DoctorAppointmentEntity doctorAppointmentEntity) {
        DoctorAppointmentDto doctorAppointmentDto = null;
        if (doctorAppointmentEntity != null)    {
            doctorAppointmentDto = new DoctorAppointmentDto();
            doctorAppointmentDto.setMedsDoctorAppointmentId(doctorAppointmentEntity.getMedsDoctorAppointmentId());
            doctorAppointmentDto.setAppointment(BindAppointment.bindAppointment(doctorAppointmentEntity.getAppointmentEntity()));
            doctorAppointmentDto.setDoctor(BindDoctor.bindDoctor(doctorAppointmentEntity.getDoctorEntity()));
        }
        return doctorAppointmentDto;
    }

    public static List<DoctorAppointmentDto> bindDoctorAppointmentEntityList(List<DoctorAppointmentEntity> doctorAppointmentEntitys) {
        List<DoctorAppointmentDto> doctorAppointmentDtos = new ArrayList<DoctorAppointmentDto>();
        for (DoctorAppointmentEntity doctorAppointmentEntity : doctorAppointmentEntitys) {
            doctorAppointmentDtos.add(bindDoctorAppointment(doctorAppointmentEntity));
        }
        return doctorAppointmentDtos;
    }

}
