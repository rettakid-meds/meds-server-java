package za.co.rettakid.meds.presentation.common;

import org.apache.log4j.Logger;
import za.co.rettakid.meds.common.MedsConstantes;
import za.co.rettakid.meds.common.dto.AppointmentAvailability;
import za.co.rettakid.meds.presentation.vo.ScheduleVo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by LWAZI8 on 09/11/2015.
 */
public abstract class ScheduleCreator {

    private static final Logger LOGGER = Logger.getLogger(ScheduleCreator.class);

    public List<ScheduleVo> getSchedule(Date date)   {
        List<ScheduleVo> scheduleVos = new ArrayList<>();
        Date endDayDate = getEndDayDate(date);
        Date currDate = getStartDayDate(date);
        if (endDayDate != null) {
            while (currDate != null && currDate.before(endDayDate)) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(currDate);
                calendar.add(Calendar.MINUTE, 30);
                ScheduleVo scheduleVo = new ScheduleVo();
                scheduleVo.setEffFrm(currDate);
                scheduleVo.setEffTo(calendar.getTime());
                scheduleVo.setAppointmentAvailability(isOpen(currDate, calendar.getTime()));
                scheduleVos.add(scheduleVo);
                currDate = calendar.getTime();
            }
        }
        return scheduleVos;
    }

    public abstract AppointmentAvailability isOpen(Date startDate,Date endDate);

    private Date getStartDayDate(Date date)  {
        SimpleDateFormat dateFormat = new SimpleDateFormat(MedsConstantes.DATE_FORMAT);
        try {
            return new SimpleDateFormat(MedsConstantes.DATE_TIME_FORMAT).parse(dateFormat.format(date) + " 00:00");
        } catch (ParseException e) {
            LOGGER.error("Could not get start day date",e);
            return null;
        }
    }

    private Date getEndDayDate(Date date)  {
        SimpleDateFormat dateFormat = new SimpleDateFormat(MedsConstantes.DATE_FORMAT);
        String dateString = dateFormat.format(date) + " 23:59";
        try {
            SimpleDateFormat dateTimeFormat = new SimpleDateFormat(MedsConstantes.DATE_TIME_FORMAT);
            return dateTimeFormat.parse(dateString);
        } catch (ParseException e) {
            LOGGER.error("Could not get end day date",e);
            return null;
        }
    }

}
