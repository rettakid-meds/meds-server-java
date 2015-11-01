package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindDoctorPractice {

    public static DoctorPracticeVo bindDoctorPractice(DoctorPracticeDto doctorPracticeDto) {
        DoctorPracticeVo doctorPracticeVo = null;
        if (doctorPracticeDto != null)    {
            doctorPracticeVo = new DoctorPracticeVo();
            doctorPracticeVo.setMedsDoctorPracticeId(doctorPracticeDto.getMedsDoctorPracticeId());
            doctorPracticeVo.setPractice(BindPractice.bindPractice(doctorPracticeDto.getPractice()));
            doctorPracticeVo.setDoctor(BindDoctor.bindDoctor(doctorPracticeDto.getDoctor()));
        }
        return doctorPracticeVo;
    }

    public static List<DoctorPracticeVo> bindDoctorPracticeDtoList(List<DoctorPracticeDto> doctorPracticeDtos) {
    List<DoctorPracticeVo> doctorPracticeEntities = new ArrayList<DoctorPracticeVo>();
        for (DoctorPracticeDto doctorPracticeDto : doctorPracticeDtos) {
            doctorPracticeEntities.add(bindDoctorPractice(doctorPracticeDto));
        }
        return doctorPracticeEntities;
    }

    public static DoctorPracticeDto bindDoctorPractice(DoctorPracticeVo doctorPracticeVo) {
        DoctorPracticeDto doctorPracticeDto = null;
        if (doctorPracticeVo != null)    {
            doctorPracticeDto = new DoctorPracticeDto();
            doctorPracticeDto.setMedsDoctorPracticeId(doctorPracticeVo.getMedsDoctorPracticeId());
            doctorPracticeDto.setPractice(BindPractice.bindPractice(doctorPracticeVo.getPractice()));
            doctorPracticeDto.setDoctor(BindDoctor.bindDoctor(doctorPracticeVo.getDoctor()));
        }
        return doctorPracticeDto;
    }

    public static List<DoctorPracticeDto> bindDoctorPracticeVoList(List<DoctorPracticeVo> doctorPracticeVos) {
        List<DoctorPracticeDto> doctorPracticeDtos = new ArrayList<DoctorPracticeDto>();
        for (DoctorPracticeVo doctorPracticeVo : doctorPracticeVos) {
            doctorPracticeDtos.add(bindDoctorPractice(doctorPracticeVo));
        }
        return doctorPracticeDtos;
    }

}
