package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.AppointmentDto;
import za.co.rettakid.meds.common.dto.AppointmentListDto;

public interface AppointmentService    {

    AppointmentListDto getAppointments();
    AppointmentDto getAppointments(Long appointmentId);
    AppointmentDto postAppointments(AppointmentDto appointmentDto);
    void putAppointments(AppointmentDto appointmentDto);
    void deleteAppointments(Long appointmentId);

}