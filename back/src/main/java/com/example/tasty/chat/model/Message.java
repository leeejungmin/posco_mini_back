package com.example.tasty.chat.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {
    private String sendName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;

}
