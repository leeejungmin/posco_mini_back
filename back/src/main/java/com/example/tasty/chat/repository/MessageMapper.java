package com.example.tasty.chat.repository;

import com.example.tasty.chat.model.Message;
import com.example.tasty.chat.service.MessageServiceImpl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {
    Integer insertChatLog(Message message);
    List<Message> getAllChatLog();
}
