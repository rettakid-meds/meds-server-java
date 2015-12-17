package za.co.rettakid.meds.services.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.common.dto.NotificationDto;
import za.co.rettakid.meds.services.NotificationService;

/**
 * Created by LWAZI8 on 27/11/2015.
 */
@Service
public class NotificationServiceImpl implements NotificationService {

    @Override
    public void sendAllNotification(NotificationDto notificationDto)  {
        sendEmailNotification(notificationDto);
        sendPushNotification(notificationDto);
        sendWebNotification(notificationDto);
    }

    @Override
    public void sendEmailNotification(NotificationDto notificationDto)  {

    }

    @Override
    public void sendPushNotification(NotificationDto notificationDto)   {

    }

    @Override
    public void sendWebNotification(NotificationDto notificationDto)   {

    }

}
