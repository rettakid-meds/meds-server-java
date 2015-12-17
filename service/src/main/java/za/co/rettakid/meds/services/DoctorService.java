package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.AppointmentAvailability;
import za.co.rettakid.meds.common.dto.DoctorDto;
import za.co.rettakid.meds.common.dto.DoctorListDto;

import java.util.Date;

public interface DoctorService    {

    DoctorListDto getDoctors();

    AppointmentAvailability isAvailable(Long doctorId, Date frmDate, Date toDate);

    DoctorDto getDoctors(Long doctorId);
    DoctorDto postDoctors(DoctorDto doctorDto);
    void putDoctors(DoctorDto doctorDto);
    void deleteDoctors(Long doctorId);

}