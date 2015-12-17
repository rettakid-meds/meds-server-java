package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface DoctorPracticeService    {

    DoctorPracticeListDto getDoctorPractices();
    DoctorPracticeDto getDoctorPractices(Long medsDoctorPracticeId);
    DoctorPracticeDto postDoctorPractices(DoctorPracticeDto doctorPracticeDto);
    void putDoctorPractices(DoctorPracticeDto doctorPracticeDto);
    void deleteDoctorPractices(Long medsDoctorPracticeId);

}