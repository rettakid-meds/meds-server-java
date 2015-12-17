package za.co.rettakid.meds.common.dto;

/**
 * Created by LWAZI8 on 22/11/2015.
 */
public class AppointmentAvailability {

    private Boolean available;
    private AppointmentDto appointment;

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public AppointmentDto getAppointment() {
        return appointment;
    }

    public void setAppointment(AppointmentDto appointment) {
        this.appointment = appointment;
    }
}
