package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface DoctorFieldService    {

    DoctorFieldListDto getDoctorFields();
    DoctorFieldDto getDoctorFields(Long doctorFieldId);
    DoctorFieldDto postDoctorFields(DoctorFieldDto doctorFieldDto);
    void putDoctorFields(DoctorFieldDto doctorFieldDto);
    void deleteDoctorFields(Long doctorFieldId);

}