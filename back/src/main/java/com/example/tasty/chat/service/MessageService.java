package com.example.tasty.chat.service;

import com.example.tasty.chat.model.Message;

import java.util.List;

public interface MessageService {
    Integer insertChatLog(Message message);
    List<Message> getAllChatLog();
}
