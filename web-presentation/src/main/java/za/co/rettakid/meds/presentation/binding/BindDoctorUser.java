package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindDoctorUser {

    public static DoctorUserVo bindDoctorUser(DoctorUserDto doctorUserDto) {
        DoctorUserVo doctorUserVo = null;
        if (doctorUserDto != null)    {
            doctorUserVo = new DoctorUserVo();
            doctorUserVo.setDoctorUserId(doctorUserDto.getDoctorUserId());
            doctorUserVo.setUser(BindUser.bindUser(doctorUserDto.getUser()));
            doctorUserVo.setDoctor(BindDoctor.bindDoctor(doctorUserDto.getDoctor()));
        }
        return doctorUserVo;
    }

    public static List<DoctorUserVo> bindDoctorUserDtoList(List<DoctorUserDto> doctorUserDtos) {
    List<DoctorUserVo> doctorUserEntities = new ArrayList<DoctorUserVo>();
        for (DoctorUserDto doctorUserDto : doctorUserDtos) {
            doctorUserEntities.add(bindDoctorUser(doctorUserDto));
        }
        return doctorUserEntities;
    }

    public static DoctorUserDto bindDoctorUser(DoctorUserVo doctorUserVo) {
        DoctorUserDto doctorUserDto = null;
        if (doctorUserVo != null)    {
            doctorUserDto = new DoctorUserDto();
            doctorUserDto.setDoctorUserId(doctorUserVo.getDoctorUserId());
            doctorUserDto.setUser(BindUser.bindUser(doctorUserVo.getUser()));
            doctorUserDto.setDoctor(BindDoctor.bindDoctor(doctorUserVo.getDoctor()));
        }
        return doctorUserDto;
    }

    public static List<DoctorUserDto> bindDoctorUserVoList(List<DoctorUserVo> doctorUserVos) {
        List<DoctorUserDto> doctorUserDtos = new ArrayList<DoctorUserDto>();
        for (DoctorUserVo doctorUserVo : doctorUserVos) {
            doctorUserDtos.add(bindDoctorUser(doctorUserVo));
        }
        return doctorUserDtos;
    }

}
