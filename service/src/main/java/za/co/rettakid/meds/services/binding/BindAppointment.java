package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindAppointment {

    public static AppointmentEntity bindAppointment(AppointmentDto appointmentDto) {
        AppointmentEntity appointmentEntity = null;
        if (appointmentDto != null)    {
            appointmentEntity = new AppointmentEntity();
            appointmentEntity.setAppointmentId(appointmentDto.getAppointmentId());
            appointmentEntity.setPracticeEntity(BindPractice.bindPractice(appointmentDto.getPractice()));
            appointmentEntity.setUserEntity(BindUser.bindUser(appointmentDto.getUser()));
            appointmentEntity.setNoteEntity(BindDataContent.bindDataContent(appointmentDto.getNote()));
            appointmentEntity.setExpectedFrm(appointmentDto.getExpectedFrm());
            appointmentEntity.setExpectedTo(appointmentDto.getExpectedTo());
            appointmentEntity.setActualFrm(appointmentDto.getActualFrm());
            appointmentEntity.setActualTo(appointmentDto.getActualTo());
        }
        return appointmentEntity;
    }

    public static List<AppointmentEntity> bindAppointmentDtoList(List<AppointmentDto> appointmentDtos) {
    List<AppointmentEntity> appointmentEntities = new ArrayList<AppointmentEntity>();
        for (AppointmentDto appointmentDto : appointmentDtos) {
            appointmentEntities.add(bindAppointment(appointmentDto));
        }
        return appointmentEntities;
    }

    public static AppointmentDto bindAppointment(AppointmentEntity appointmentEntity) {
        AppointmentDto appointmentDto = null;
        if (appointmentEntity != null)    {
            appointmentDto = new AppointmentDto();
            appointmentDto.setAppointmentId(appointmentEntity.getAppointmentId());
            appointmentDto.setPractice(BindPractice.bindPractice(appointmentEntity.getPracticeEntity()));
            appointmentDto.setUser(BindUser.bindUser(appointmentEntity.getUserEntity()));
            appointmentDto.setNote(BindDataContent.bindDataContent(appointmentEntity.getNoteEntity()));
            appointmentDto.setExpectedFrm(appointmentEntity.getExpectedFrm());
            appointmentDto.setExpectedTo(appointmentEntity.getExpectedTo());
            appointmentDto.setActualFrm(appointmentEntity.getActualFrm());
            appointmentDto.setActualTo(appointmentEntity.getActualTo());
        }
        return appointmentDto;
    }

    public static List<AppointmentDto> bindAppointmentEntityList(List<AppointmentEntity> appointmentEntitys) {
        List<AppointmentDto> appointmentDtos = new ArrayList<AppointmentDto>();
        for (AppointmentEntity appointmentEntity : appointmentEntitys) {
            appointmentDtos.add(bindAppointment(appointmentEntity));
        }
        return appointmentDtos;
    }

}
