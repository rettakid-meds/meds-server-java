package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindPrescriptionItem {

    public static PrescriptionItemEntity bindPrescriptionItem(PrescriptionItemDto prescriptionItemDto) {
        PrescriptionItemEntity prescriptionItemEntity = null;
        if (prescriptionItemDto != null)    {
            prescriptionItemEntity = new PrescriptionItemEntity();
            prescriptionItemEntity.setPrescriptionItemId(prescriptionItemDto.getPrescriptionItemId());
            prescriptionItemEntity.setPrescriptionEntity(BindPrescription.bindPrescription(prescriptionItemDto.getPrescription()));
            prescriptionItemEntity.setName(prescriptionItemDto.getName());
        }
        return prescriptionItemEntity;
    }

    public static List<PrescriptionItemEntity> bindPrescriptionItemDtoList(List<PrescriptionItemDto> prescriptionItemDtos) {
    List<PrescriptionItemEntity> prescriptionItemEntities = new ArrayList<PrescriptionItemEntity>();
        for (PrescriptionItemDto prescriptionItemDto : prescriptionItemDtos) {
            prescriptionItemEntities.add(bindPrescriptionItem(prescriptionItemDto));
        }
        return prescriptionItemEntities;
    }

    public static PrescriptionItemDto bindPrescriptionItem(PrescriptionItemEntity prescriptionItemEntity) {
        PrescriptionItemDto prescriptionItemDto = null;
        if (prescriptionItemEntity != null)    {
            prescriptionItemDto = new PrescriptionItemDto();
            prescriptionItemDto.setPrescriptionItemId(prescriptionItemEntity.getPrescriptionItemId());
            prescriptionItemDto.setPrescription(BindPrescription.bindPrescription(prescriptionItemEntity.getPrescriptionEntity()));
            prescriptionItemDto.setName(prescriptionItemEntity.getName());
        }
        return prescriptionItemDto;
    }

    public static List<PrescriptionItemDto> bindPrescriptionItemEntityList(List<PrescriptionItemEntity> prescriptionItemEntitys) {
        List<PrescriptionItemDto> prescriptionItemDtos = new ArrayList<PrescriptionItemDto>();
        for (PrescriptionItemEntity prescriptionItemEntity : prescriptionItemEntitys) {
            prescriptionItemDtos.add(bindPrescriptionItem(prescriptionItemEntity));
        }
        return prescriptionItemDtos;
    }

}
