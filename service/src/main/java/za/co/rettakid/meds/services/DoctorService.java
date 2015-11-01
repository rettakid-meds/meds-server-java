package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface DoctorService    {

    DoctorListDto getDoctors();
    DoctorDto getDoctors(Long doctorId);
    void postDoctors(DoctorDto doctorDto);
    void putDoctors(DoctorDto doctorDto);
    void deleteDoctors(Long doctorId);

}