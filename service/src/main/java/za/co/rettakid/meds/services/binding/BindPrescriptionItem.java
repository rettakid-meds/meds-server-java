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
            prescriptionItemEntity.setPrescription(BindPrescription.bindPrescription(prescriptionItemDto.getPrescription()));
            prescriptionItemEntity.setName(prescriptionItemDto.getName());
        }
        return prescriptionItemEntity;
    }

    public static PrescriptionItemEntity bindPrescriptionItem(PrescriptionItemDto prescriptionItemDto,PrescriptionItemEntity prescriptionItemEntity) {
        if (prescriptionItemDto != null && prescriptionItemEntity != null)    {
            if (prescriptionItemEntity.getPrescription().getPrescriptionId() != null) {
                prescriptionItemEntity.setPrescription(BindPrescription.bindPrescription(prescriptionItemDto.getPrescription(), prescriptionItemEntity.getPrescription()));
            } else  {
                prescriptionItemEntity.setPrescription(BindPrescription.bindPrescription(prescriptionItemDto.getPrescription(), new PrescriptionEntity()));
            }
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
            prescriptionItemDto.setPrescription(BindPrescription.bindPrescription(prescriptionItemEntity.getPrescription()));
            prescriptionItemDto.setName(prescriptionItemEntity.getName());
        }
        return prescriptionItemDto;
    }

    public static List<PrescriptionItemDto> bindPrescriptionItemEntityList(List<PrescriptionItemEntity> prescriptionItemEntitys) {
        List<PrescriptionItemDto> prescriptionItemDtos = new ArrayList<PrescriptionItemDto>();
        if (prescriptionItemEntitys != null)   {
            for (PrescriptionItemEntity prescriptionItemEntity : prescriptionItemEntitys) {
                prescriptionItemDtos.add(bindPrescriptionItem(prescriptionItemEntity));
            }
        }
        return prescriptionItemDtos;
    }

}
