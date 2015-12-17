package za.co.rettakid.meds.presentation.websockets;

import org.apache.log4j.Logger;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.rettakid.meds.common.dto.NotificationDto;
import za.co.rettakid.meds.common.dto.UserDto;
import za.co.rettakid.meds.presentation.controllers.BaseController;

import java.security.Principal;
import java.util.List;

/**
 * Created by LWAZI8 on 29/11/2015.
 */
@Controller
@RequestMapping("/notif")
public class NotificationController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(NotificationController.class);

/*    @SubscribeMapping("/notifications")
    public List<NotificationDto> getNotifications(Principal principal) throws Exception {
        LOGGER.debug("Positions for " + principal.getName());
        return null;
    }*/

    /*@MessageMapping("/ws")
    @SendTo("/topic/ws")
    public NotificationDto getNotification()  {
        NotificationDto notificationDto = new NotificationDto();
        notificationDto.setHeader("head");
        notificationDto.setBody("here is my body");
        notificationDto.setUserId(2L);
        return notificationDto;
    }

    @MessageMapping("/notif")
    @SendToUser("/notif/user")
    public NotificationDto getUserNotification(@Payload UserDto userDto, StompHeaderAccessor stompHeaderAccessor, Principal principal) {
        NotificationDto notificationDto = new NotificationDto();
        notificationDto.setHeader("head");
        notificationDto.setBody("here is my body");
        notificationDto.setUserId(2L);
        return notificationDto;
    }*/

}
