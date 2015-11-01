package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface PrescriptionItemService    {

    PrescriptionItemListDto getPrescriptionItems();
    PrescriptionItemDto getPrescriptionItems(Long prescriptionItemId);
    void postPrescriptionItems(PrescriptionItemDto prescriptionItemDto);
    void putPrescriptionItems(PrescriptionItemDto prescriptionItemDto);
    void deletePrescriptionItems(Long prescriptionItemId);

}