package com.example.tasty.chat.controller;

import com.example.tasty.chat.model.Message;
import com.example.tasty.chat.repository.MessageMapper;
import com.example.tasty.chat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetChatController {

    @Autowired
    MessageService messageService;

    @GetMapping("/chat/list")
    public List<Message> receiveAllPublicMessage() {
        return messageService.getAllChatLog();
    }
}
