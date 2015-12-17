package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface PracticeMedicalAidService    {

    PracticeMedicalAidListDto getPracticeMedicalAids();
    PracticeMedicalAidDto getPracticeMedicalAids(Long practiceMedicalAidId);
    PracticeMedicalAidDto postPracticeMedicalAids(PracticeMedicalAidDto practiceMedicalAidDto);
    void putPracticeMedicalAids(PracticeMedicalAidDto practiceMedicalAidDto);
    void deletePracticeMedicalAids(Long practiceMedicalAidId);

}