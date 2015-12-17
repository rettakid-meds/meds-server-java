package za.co.rettakid.meds.presentation.vo;

import za.co.rettakid.meds.common.dto.AppointmentAvailability;

import java.util.Date;

/**
 * Created by LWAZI8 on 09/11/2015.
 */
public class ScheduleVo {

    private Date effFrm;
    private Date effTo;
    private AppointmentAvailability appointmentAvailability;

    public Date getEffFrm() {
        return effFrm;
    }

    public void setEffFrm(Date effFrm) {
        this.effFrm = effFrm;
    }

    public Date getEffTo() {
        return effTo;
    }

    public void setEffTo(Date effTo) {
        this.effTo = effTo;
    }

    public AppointmentAvailability getAppointmentAvailability() {
        return appointmentAvailability;
    }

    public void setAppointmentAvailability(AppointmentAvailability appointmentAvailability) {
        this.appointmentAvailability = appointmentAvailability;
    }
}
