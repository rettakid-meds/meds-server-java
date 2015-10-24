package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface DoctorPracticeService    {

    DoctorPracticeListDto getDoctorPractices();
    DoctorPracticeDto getDoctorPractices(Long medsDoctorPracticeId);
    void postDoctorPractices(DoctorPracticeDto doctorPracticeDto);
    void postDoctorPractices(DoctorPracticeListDto doctorPracticeListDto);
    void putDoctorPractices(DoctorPracticeDto doctorPracticeDto);
    void deleteDoctorPractices(Long medsDoctorPracticeId);

}