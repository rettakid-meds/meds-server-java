package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindPrescription {

    public static PrescriptionVo bindPrescription(PrescriptionDto prescriptionDto) {
        PrescriptionVo prescriptionVo = null;
        if (prescriptionDto != null)    {
            prescriptionVo = new PrescriptionVo();
            prescriptionVo.setPrescriptionId(prescriptionDto.getPrescriptionId());
            prescriptionVo.setAppointment(BindAppointment.bindAppointment(prescriptionDto.getAppointment()));
            prescriptionVo.setDoctor(BindDoctor.bindDoctor(prescriptionDto.getDoctor()));
            prescriptionVo.setUser(BindUser.bindUser(prescriptionDto.getUser()));
            prescriptionVo.setFile(BindFile.bindFile(prescriptionDto.getFile()));
            prescriptionVo.setEffFrm(prescriptionDto.getEffFrm());
            prescriptionVo.setEffTo(prescriptionDto.getEffTo());
        }
        return prescriptionVo;
    }

    public static List<PrescriptionVo> bindPrescriptionDtoList(List<PrescriptionDto> prescriptionDtos) {
    List<PrescriptionVo> prescriptionEntities = new ArrayList<PrescriptionVo>();
        for (PrescriptionDto prescriptionDto : prescriptionDtos) {
            prescriptionEntities.add(bindPrescription(prescriptionDto));
        }
        return prescriptionEntities;
    }

    public static PrescriptionDto bindPrescription(PrescriptionVo prescriptionVo) {
        PrescriptionDto prescriptionDto = null;
        if (prescriptionVo != null)    {
            prescriptionDto = new PrescriptionDto();
            prescriptionDto.setPrescriptionId(prescriptionVo.getPrescriptionId());
            prescriptionDto.setAppointment(BindAppointment.bindAppointment(prescriptionVo.getAppointment()));
            prescriptionDto.setDoctor(BindDoctor.bindDoctor(prescriptionVo.getDoctor()));
            prescriptionDto.setUser(BindUser.bindUser(prescriptionVo.getUser()));
            prescriptionDto.setFile(BindFile.bindFile(prescriptionVo.getFile()));
            prescriptionDto.setEffFrm(prescriptionVo.getEffFrm());
            prescriptionDto.setEffTo(prescriptionVo.getEffTo());
        }
        return prescriptionDto;
    }

    public static List<PrescriptionDto> bindPrescriptionVoList(List<PrescriptionVo> prescriptionVos) {
        List<PrescriptionDto> prescriptionDtos = new ArrayList<PrescriptionDto>();
        for (PrescriptionVo prescriptionVo : prescriptionVos) {
            prescriptionDtos.add(bindPrescription(prescriptionVo));
        }
        return prescriptionDtos;
    }

}
