package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindDoctorAppointment {

    public static DoctorAppointmentVo bindDoctorAppointment(DoctorAppointmentDto doctorAppointmentDto) {
        DoctorAppointmentVo doctorAppointmentVo = null;
        if (doctorAppointmentDto != null)    {
            doctorAppointmentVo = new DoctorAppointmentVo();
            doctorAppointmentVo.setMedsDoctorAppointmentId(doctorAppointmentDto.getMedsDoctorAppointmentId());
            doctorAppointmentVo.setAppointment(BindAppointment.bindAppointment(doctorAppointmentDto.getAppointment()));
            doctorAppointmentVo.setDoctor(BindDoctor.bindDoctor(doctorAppointmentDto.getDoctor()));
        }
        return doctorAppointmentVo;
    }

    public static List<DoctorAppointmentVo> bindDoctorAppointmentDtoList(List<DoctorAppointmentDto> doctorAppointmentDtos) {
    List<DoctorAppointmentVo> doctorAppointmentEntities = new ArrayList<DoctorAppointmentVo>();
        for (DoctorAppointmentDto doctorAppointmentDto : doctorAppointmentDtos) {
            doctorAppointmentEntities.add(bindDoctorAppointment(doctorAppointmentDto));
        }
        return doctorAppointmentEntities;
    }

    public static DoctorAppointmentDto bindDoctorAppointment(DoctorAppointmentVo doctorAppointmentVo) {
        DoctorAppointmentDto doctorAppointmentDto = null;
        if (doctorAppointmentVo != null)    {
            doctorAppointmentDto = new DoctorAppointmentDto();
            doctorAppointmentDto.setMedsDoctorAppointmentId(doctorAppointmentVo.getMedsDoctorAppointmentId());
            doctorAppointmentDto.setAppointment(BindAppointment.bindAppointment(doctorAppointmentVo.getAppointment()));
            doctorAppointmentDto.setDoctor(BindDoctor.bindDoctor(doctorAppointmentVo.getDoctor()));
        }
        return doctorAppointmentDto;
    }

    public static List<DoctorAppointmentDto> bindDoctorAppointmentVoList(List<DoctorAppointmentVo> doctorAppointmentVos) {
        List<DoctorAppointmentDto> doctorAppointmentDtos = new ArrayList<DoctorAppointmentDto>();
        for (DoctorAppointmentVo doctorAppointmentVo : doctorAppointmentVos) {
            doctorAppointmentDtos.add(bindDoctorAppointment(doctorAppointmentVo));
        }
        return doctorAppointmentDtos;
    }

}
