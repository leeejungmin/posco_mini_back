package com.example.tasty.user.repository;

import com.example.tasty.user.model.UserDto;
import nonapi.io.github.classgraph.json.JSONUtils;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserDto> getUserList();

    List<UserDto> getUserById(UserDto userDto);

    UserDto getLoginByUserIdAndPassword(UserDto userDto);

    Integer createUser(UserDto userDto);

    Integer deleteUserById(UserDto userDto);

    Integer updateUserById(UserDto userDto);



}
