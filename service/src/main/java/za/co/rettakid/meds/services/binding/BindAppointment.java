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
            appointmentEntity.setDoctor(BindDoctor.bindDoctor(appointmentDto.getDoctor()));
            appointmentEntity.setUser(BindUser.bindUser(appointmentDto.getUser()));
            appointmentEntity.setNote(BindDataContent.bindDataContent(appointmentDto.getNote()));
            appointmentEntity.setExpectedFrm(appointmentDto.getExpectedFrm());
            appointmentEntity.setExpectedTo(appointmentDto.getExpectedTo());
            appointmentEntity.setActualFrm(appointmentDto.getActualFrm());
            appointmentEntity.setActualTo(appointmentDto.getActualTo());
        }
        return appointmentEntity;
    }

    public static AppointmentEntity bindAppointment(AppointmentDto appointmentDto,AppointmentEntity appointmentEntity) {
        if (appointmentDto != null && appointmentEntity != null)    {
            if (appointmentEntity.getDoctor().getDoctorId() != null) {
                appointmentEntity.setDoctor(BindDoctor.bindDoctor(appointmentDto.getDoctor(), appointmentEntity.getDoctor()));
            } else  {
                appointmentEntity.setDoctor(BindDoctor.bindDoctor(appointmentDto.getDoctor(), new DoctorEntity()));
            }
            if (appointmentEntity.getUser().getUserId() != null) {
                appointmentEntity.setUser(BindUser.bindUser(appointmentDto.getUser(), appointmentEntity.getUser()));
            } else  {
                appointmentEntity.setUser(BindUser.bindUser(appointmentDto.getUser(), new UserEntity()));
            }
            if (appointmentEntity.getNote().getDataContentId() != null) {
                appointmentEntity.setNote(BindDataContent.bindDataContent(appointmentDto.getNote(), appointmentEntity.getNote()));
            } else  {
                appointmentEntity.setNote(BindDataContent.bindDataContent(appointmentDto.getNote(), new DataContentEntity()));
            }
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
            appointmentDto.setDoctor(BindDoctor.bindDoctor(appointmentEntity.getDoctor()));
            appointmentDto.setUser(BindUser.bindUser(appointmentEntity.getUser()));
            appointmentDto.setNote(BindDataContent.bindDataContent(appointmentEntity.getNote()));
            appointmentDto.setExpectedFrm(appointmentEntity.getExpectedFrm());
            appointmentDto.setExpectedTo(appointmentEntity.getExpectedTo());
            appointmentDto.setActualFrm(appointmentEntity.getActualFrm());
            appointmentDto.setActualTo(appointmentEntity.getActualTo());
        }
        return appointmentDto;
    }

    public static List<AppointmentDto> bindAppointmentEntityList(List<AppointmentEntity> appointmentEntitys) {
        List<AppointmentDto> appointmentDtos = new ArrayList<AppointmentDto>();
        if (appointmentEntitys != null)   {
            for (AppointmentEntity appointmentEntity : appointmentEntitys) {
                appointmentDtos.add(bindAppointment(appointmentEntity));
            }
        }
        return appointmentDtos;
    }

}
