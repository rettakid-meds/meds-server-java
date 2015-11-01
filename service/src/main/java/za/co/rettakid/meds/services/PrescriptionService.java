package za.co.rettakid.meds.services;

import java.util.Date;
import za.co.rettakid.meds.common.dto.*;

public interface PrescriptionService    {

    PrescriptionListDto getPrescriptions();
    PrescriptionDto getPrescriptions(Long prescriptionId);
    void postPrescriptions(PrescriptionDto prescriptionDto);
    void putPrescriptions(PrescriptionDto prescriptionDto);
    void deletePrescriptions(Long prescriptionId);

}