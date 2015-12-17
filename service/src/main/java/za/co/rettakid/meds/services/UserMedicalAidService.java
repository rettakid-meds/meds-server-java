package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface UserMedicalAidService    {

    UserMedicalAidListDto getUserMedicalAids();
    UserMedicalAidDto getUserMedicalAids(Long userMedicalAidId);
    UserMedicalAidDto postUserMedicalAids(UserMedicalAidDto userMedicalAidDto);
    void putUserMedicalAids(UserMedicalAidDto userMedicalAidDto);
    void deleteUserMedicalAids(Long userMedicalAidId);

}