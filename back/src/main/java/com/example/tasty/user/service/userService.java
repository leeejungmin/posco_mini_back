package com.example.tasty.user.service;

import com.example.tasty.user.model.UserDto;

import java.util.List;

public interface userService {
    List<UserDto> findUserList();

    List<UserDto> findUserById(UserDto userDto);

    UserDto serviceLogin(UserDto userDto);

    Integer createUser(UserDto userDto);

    Integer deleteUserById(UserDto userDto);

    Integer updateUserById(UserDto userDto);
}
