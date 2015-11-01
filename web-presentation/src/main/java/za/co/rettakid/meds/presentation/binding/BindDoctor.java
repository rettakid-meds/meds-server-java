package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindDoctor {

    public static DoctorVo bindDoctor(DoctorDto doctorDto) {
        DoctorVo doctorVo = null;
        if (doctorDto != null)    {
            doctorVo = new DoctorVo();
            doctorVo.setDoctorId(doctorDto.getDoctorId());
            doctorVo.setUser(BindUser.bindUser(doctorDto.getUser()));
            doctorVo.setIcon(BindImage.bindImage(doctorDto.getIcon()));
            doctorVo.setImage(BindImage.bindImage(doctorDto.getImage()));
            doctorVo.setBio(BindDataContent.bindDataContent(doctorDto.getBio()));
        }
        return doctorVo;
    }

    public static List<DoctorVo> bindDoctorDtoList(List<DoctorDto> doctorDtos) {
    List<DoctorVo> doctorEntities = new ArrayList<DoctorVo>();
        for (DoctorDto doctorDto : doctorDtos) {
            doctorEntities.add(bindDoctor(doctorDto));
        }
        return doctorEntities;
    }

    public static DoctorDto bindDoctor(DoctorVo doctorVo) {
        DoctorDto doctorDto = null;
        if (doctorVo != null)    {
            doctorDto = new DoctorDto();
            doctorDto.setDoctorId(doctorVo.getDoctorId());
            doctorDto.setUser(BindUser.bindUser(doctorVo.getUser()));
            doctorDto.setIcon(BindImage.bindImage(doctorVo.getIcon()));
            doctorDto.setImage(BindImage.bindImage(doctorVo.getImage()));
            doctorDto.setBio(BindDataContent.bindDataContent(doctorVo.getBio()));
        }
        return doctorDto;
    }

    public static List<DoctorDto> bindDoctorVoList(List<DoctorVo> doctorVos) {
        List<DoctorDto> doctorDtos = new ArrayList<DoctorDto>();
        for (DoctorVo doctorVo : doctorVos) {
            doctorDtos.add(bindDoctor(doctorVo));
        }
        return doctorDtos;
    }

}
