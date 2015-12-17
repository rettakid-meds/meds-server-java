package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface DoctorUserService    {

    DoctorUserListDto getDoctorUsers();
    DoctorUserDto getDoctorUsers(Long doctorUserId);

    DoctorListDto getDoctors(Long userId);

    DoctorUserDto postDoctorUsers(DoctorUserDto doctorUserDto);
    void putDoctorUsers(DoctorUserDto doctorUserDto);
    void deleteDoctorUsers(Long doctorUserId);

}