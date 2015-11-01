package za.co.rettakid.meds.services;

import java.util.Date;
import za.co.rettakid.meds.common.dto.*;

public interface AppointmentService    {

    AppointmentListDto getAppointments();
    AppointmentDto getAppointments(Long appointmentId);
    void postAppointments(AppointmentDto appointmentDto);
    void putAppointments(AppointmentDto appointmentDto);
    void deleteAppointments(Long appointmentId);

}