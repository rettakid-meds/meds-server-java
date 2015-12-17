package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import za.co.rettakid.meds.common.dto.NotificationDto;
import za.co.rettakid.meds.common.dto.UserDto;
import za.co.rettakid.meds.presentation.common.PageDirectory;

import java.security.Principal;
import java.util.List;

/**
 * Created by LWAZI8 on 02/12/2015.
 */
@Controller
@RequestMapping("/chat")
public class ChatController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(ChatController.class);

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;

    @RequestMapping
    public String getChat()  {
        return PageDirectory.CHAT;
    }

    @SubscribeMapping("/notifications")
    public List<NotificationDto> getNotifications(Principal principal) throws Exception {
        LOGGER.debug("Positions for " + principal.getName());
        return null;
    }

    @MessageMapping("/ws")
    @SendTo("/topic/ws")
    public NotificationDto getNotification()  {
        NotificationDto notificationDto = new NotificationDto();
        notificationDto.setHeader("head");
        notificationDto.setBody("here is my body");
        notificationDto.setUserId(2L);
        return notificationDto;
    }

    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public NotificationDto getAllNotification() {
        NotificationDto notificationDto = new NotificationDto();
        notificationDto.setHeader("head");
        notificationDto.setBody("");
        return notificationDto;
    }

    @MessageMapping("/user/chat")
    @SendToUser("/topic/chat")
    public NotificationDto getUserNotification(@Payload String message, StompHeaderAccessor stompHeaderAccessor, Principal principal) {
        NotificationDto notificationDto = new NotificationDto();
        notificationDto.setHeader("head");
        notificationDto.setBody(message);
        return notificationDto;
    }

    @ResponseBody
    @RequestMapping("/socket")
    public String sendSocket()  {
        Principal principal = SecurityContextHolder.getContext().getAuthentication();
        messagingTemplate.convertAndSendToUser("lwazi","/app/message","this worked");
        return "works";
    }

}
