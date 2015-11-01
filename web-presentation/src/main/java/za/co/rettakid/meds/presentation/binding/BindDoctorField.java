package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindDoctorField {

    public static DoctorFieldVo bindDoctorField(DoctorFieldDto doctorFieldDto) {
        DoctorFieldVo doctorFieldVo = null;
        if (doctorFieldDto != null)    {
            doctorFieldVo = new DoctorFieldVo();
            doctorFieldVo.setDoctorFieldId(doctorFieldDto.getDoctorFieldId());
            doctorFieldVo.setField(BindField.bindField(doctorFieldDto.getField()));
            doctorFieldVo.setDoctor(BindDoctor.bindDoctor(doctorFieldDto.getDoctor()));
        }
        return doctorFieldVo;
    }

    public static List<DoctorFieldVo> bindDoctorFieldDtoList(List<DoctorFieldDto> doctorFieldDtos) {
    List<DoctorFieldVo> doctorFieldEntities = new ArrayList<DoctorFieldVo>();
        for (DoctorFieldDto doctorFieldDto : doctorFieldDtos) {
            doctorFieldEntities.add(bindDoctorField(doctorFieldDto));
        }
        return doctorFieldEntities;
    }

    public static DoctorFieldDto bindDoctorField(DoctorFieldVo doctorFieldVo) {
        DoctorFieldDto doctorFieldDto = null;
        if (doctorFieldVo != null)    {
            doctorFieldDto = new DoctorFieldDto();
            doctorFieldDto.setDoctorFieldId(doctorFieldVo.getDoctorFieldId());
            doctorFieldDto.setField(BindField.bindField(doctorFieldVo.getField()));
            doctorFieldDto.setDoctor(BindDoctor.bindDoctor(doctorFieldVo.getDoctor()));
        }
        return doctorFieldDto;
    }

    public static List<DoctorFieldDto> bindDoctorFieldVoList(List<DoctorFieldVo> doctorFieldVos) {
        List<DoctorFieldDto> doctorFieldDtos = new ArrayList<DoctorFieldDto>();
        for (DoctorFieldVo doctorFieldVo : doctorFieldVos) {
            doctorFieldDtos.add(bindDoctorField(doctorFieldVo));
        }
        return doctorFieldDtos;
    }

}
