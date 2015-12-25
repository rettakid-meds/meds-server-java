package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.AppointmentDto;
import za.co.rettakid.meds.common.dto.AppointmentListDto;

public interface AppointmentService    {

    AppointmentListDto getAppointments();

    AppointmentListDto getAppointments(Long userId, Long doctorId);

    AppointmentDto getAppointments(Long appointmentId);

    Boolean hasOwnership(Long appointmentId, Long userId);

    AppointmentDto postAppointments(AppointmentDto appointmentDto);
    void putAppointments(AppointmentDto appointmentDto);
    void deleteAppointments(Long appointmentId);

}