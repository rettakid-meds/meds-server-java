package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindAppointment {

    public static AppointmentVo bindAppointment(AppointmentDto appointmentDto) {
        AppointmentVo appointmentVo = null;
        if (appointmentDto != null)    {
            appointmentVo = new AppointmentVo();
            appointmentVo.setAppointmentId(appointmentDto.getAppointmentId());
            appointmentVo.setDoctor(BindDoctor.bindDoctor(appointmentDto.getDoctor()));
            appointmentVo.setUser(BindUser.bindUser(appointmentDto.getUser()));
            appointmentVo.setNote(BindDataContent.bindDataContent(appointmentDto.getNote()));
            appointmentVo.setExpectedFrm(appointmentDto.getExpectedFrm());
            appointmentVo.setExpectedTo(appointmentDto.getExpectedTo());
            appointmentVo.setActualFrm(appointmentDto.getActualFrm());
            appointmentVo.setActualTo(appointmentDto.getActualTo());
        }
        return appointmentVo;
    }

    public static List<AppointmentVo> bindAppointmentDtoList(List<AppointmentDto> appointmentDtos) {
    List<AppointmentVo> appointmentEntities = new ArrayList<AppointmentVo>();
        for (AppointmentDto appointmentDto : appointmentDtos) {
            appointmentEntities.add(bindAppointment(appointmentDto));
        }
        return appointmentEntities;
    }

    public static AppointmentDto bindAppointment(AppointmentVo appointmentVo) {
        AppointmentDto appointmentDto = null;
        if (appointmentVo != null)    {
            appointmentDto = new AppointmentDto();
            appointmentDto.setAppointmentId(appointmentVo.getAppointmentId());
            appointmentDto.setDoctor(BindDoctor.bindDoctor(appointmentVo.getDoctor()));
            appointmentDto.setUser(BindUser.bindUser(appointmentVo.getUser()));
            appointmentDto.setNote(BindDataContent.bindDataContent(appointmentVo.getNote()));
            appointmentDto.setExpectedFrm(appointmentVo.getExpectedFrm());
            appointmentDto.setExpectedTo(appointmentVo.getExpectedTo());
            appointmentDto.setActualFrm(appointmentVo.getActualFrm());
            appointmentDto.setActualTo(appointmentVo.getActualTo());
        }
        return appointmentDto;
    }

    public static List<AppointmentDto> bindAppointmentVoList(List<AppointmentVo> appointmentVos) {
        List<AppointmentDto> appointmentDtos = new ArrayList<AppointmentDto>();
        for (AppointmentVo appointmentVo : appointmentVos) {
            appointmentDtos.add(bindAppointment(appointmentVo));
        }
        return appointmentDtos;
    }

}
