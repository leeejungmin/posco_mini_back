package com.example.tasty.user.model;

import lombok.Data;

@Data
public class UserDto {
    private Integer id;
    private String userId;
    private String password;
    private String phoneNum;
    private String name;

}
