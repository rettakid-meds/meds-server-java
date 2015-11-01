package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindPrescriptionItem {

    public static PrescriptionItemVo bindPrescriptionItem(PrescriptionItemDto prescriptionItemDto) {
        PrescriptionItemVo prescriptionItemVo = null;
        if (prescriptionItemDto != null)    {
            prescriptionItemVo = new PrescriptionItemVo();
            prescriptionItemVo.setPrescriptionItemId(prescriptionItemDto.getPrescriptionItemId());
            prescriptionItemVo.setPrescription(BindPrescription.bindPrescription(prescriptionItemDto.getPrescription()));
            prescriptionItemVo.setName(prescriptionItemDto.getName());
        }
        return prescriptionItemVo;
    }

    public static List<PrescriptionItemVo> bindPrescriptionItemDtoList(List<PrescriptionItemDto> prescriptionItemDtos) {
    List<PrescriptionItemVo> prescriptionItemEntities = new ArrayList<PrescriptionItemVo>();
        for (PrescriptionItemDto prescriptionItemDto : prescriptionItemDtos) {
            prescriptionItemEntities.add(bindPrescriptionItem(prescriptionItemDto));
        }
        return prescriptionItemEntities;
    }

    public static PrescriptionItemDto bindPrescriptionItem(PrescriptionItemVo prescriptionItemVo) {
        PrescriptionItemDto prescriptionItemDto = null;
        if (prescriptionItemVo != null)    {
            prescriptionItemDto = new PrescriptionItemDto();
            prescriptionItemDto.setPrescriptionItemId(prescriptionItemVo.getPrescriptionItemId());
            prescriptionItemDto.setPrescription(BindPrescription.bindPrescription(prescriptionItemVo.getPrescription()));
            prescriptionItemDto.setName(prescriptionItemVo.getName());
        }
        return prescriptionItemDto;
    }

    public static List<PrescriptionItemDto> bindPrescriptionItemVoList(List<PrescriptionItemVo> prescriptionItemVos) {
        List<PrescriptionItemDto> prescriptionItemDtos = new ArrayList<PrescriptionItemDto>();
        for (PrescriptionItemVo prescriptionItemVo : prescriptionItemVos) {
            prescriptionItemDtos.add(bindPrescriptionItem(prescriptionItemVo));
        }
        return prescriptionItemDtos;
    }

}
