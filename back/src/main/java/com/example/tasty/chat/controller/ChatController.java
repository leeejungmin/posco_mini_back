package com.example.tasty.chat.controller;


import com.example.tasty.chat.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;


@Controller

public class ChatController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    // 다수의 대상인지에 따라서 사용되는 채널이 달라진다

    @MessageMapping("/message") // app/message
    @SendTo("/chatroom/public")
    public Message receivePublicMessage(@Payload Message message){
        return message;
    }

    @MessageMapping("/private-message")
    public Message receiverPrivateMessage(@Payload Message message){
        // /user/David/private
        simpMessagingTemplate.convertAndSendToUser(message.getReceiverName(), "/private", message);
        return message;
    }
}
