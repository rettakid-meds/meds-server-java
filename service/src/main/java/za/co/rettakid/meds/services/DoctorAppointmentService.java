package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface DoctorAppointmentService    {

    DoctorAppointmentListDto getDoctorAppointments();
    DoctorAppointmentDto getDoctorAppointments(Long medsDoctorAppointmentId);
    void postDoctorAppointments(DoctorAppointmentDto doctorAppointmentDto);
    void postDoctorAppointments(DoctorAppointmentListDto doctorAppointmentListDto);
    void putDoctorAppointments(DoctorAppointmentDto doctorAppointmentDto);
    void deleteDoctorAppointments(Long medsDoctorAppointmentId);

}