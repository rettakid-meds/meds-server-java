package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface MedicalAidService    {

    MedicalAidListDto getMedicalAids();
    MedicalAidDto getMedicalAids(Long medicalAidId);
    MedicalAidDto postMedicalAids(MedicalAidDto medicalAidDto);
    void putMedicalAids(MedicalAidDto medicalAidDto);
    void deleteMedicalAids(Long medicalAidId);

}