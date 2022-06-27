package com.example.tasty.push.controller;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("push")
public class PushController {

    @RequestMapping("/send/token")
    public String sendToToken() throws FirebaseMessagingException {

        // This registration token comes from the client FCM SDKs.
        String registrationToken = "ExponentPushToken[4LvYoqLypf-0FmJ2joBi3s]ㅋ";

        // See documentation on defining a message payload.
        Message message = Message.builder()
                .putData("title", "메시지를 보낼거야")
                .putData("content", "너에게")
                .setToken(registrationToken)
                .build();

        // Send a message to the device corresponding to the provided
        // registration token.
        String response = FirebaseMessaging.getInstance().send(message);
        // Response is a message ID string.
        System.out.println("Successfully sent message: " + response);

        return response;
    }
}