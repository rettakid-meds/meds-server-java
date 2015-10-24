package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface DoctorFieldService    {

    DoctorFieldListDto getDoctorFields();
    DoctorFieldDto getDoctorFields(Long doctorFieldId);
    void postDoctorFields(DoctorFieldDto doctorFieldDto);
    void postDoctorFields(DoctorFieldListDto doctorFieldListDto);
    void putDoctorFields(DoctorFieldDto doctorFieldDto);
    void deleteDoctorFields(Long doctorFieldId);

}