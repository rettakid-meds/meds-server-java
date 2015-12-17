package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.NotificationDto;

/**
 * Created by LWAZI8 on 27/11/2015.
 */
public interface NotificationService {


    void sendAllNotification(NotificationDto notificationDto);

    void sendEmailNotification(NotificationDto notificationDto);

    void sendPushNotification(NotificationDto notificationDto);

    void sendWebNotification(NotificationDto notificationDto);
}
