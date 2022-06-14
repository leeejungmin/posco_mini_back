package com.example.tasty.user.controller;

import com.example.tasty.config.SecurityService;
import com.example.tasty.user.model.UserDto;
import com.example.tasty.user.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")

public class UserController {
    // swagger
    // http://localhost:8000/swagger-ui/index.html#/
    @Autowired
    UserServiceImpl userService;

    @Autowired
    SecurityService securityService;

    @GetMapping("/")
    public List<UserDto> getUser(){

        return userService.findUserList();
    }

    @GetMapping("/{id}")
    public List<UserDto> getUserById(@PathVariable String id){
        UserDto userDto = new UserDto();
        userDto.setId(Integer.valueOf(id));
        return userService.findUserById(userDto);
    }

    @PostMapping("/login")
    public Map login(@RequestBody UserDto userDto){
        //받아온걸 통해서 진행
        //Bearer +token값
        System.out.println("Gooododd" + userDto);
        UserDto loginUser = userService.serviceLogin(userDto);
        String token = securityService.createToken(loginUser.getId().toString());
        Map<String, Object> map = new HashMap<>();
        map.put("token", token);
        map.put("name", loginUser.getName());
        map.put("phoneNum", loginUser.getPhoneNum());
        return map;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody UserDto userDto){
        HttpStatus httpStatus = userService.createUser(userDto) ==1
                ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
        return new ResponseEntity<>(httpStatus);
    }

    @DeleteMapping("/")
    public ResponseEntity<?> deleteUserById(){
        UserDto userDto = new UserDto();
        userDto.setId(securityService.getIdAtToken());
        HttpStatus httpStatus = userService.deleteUserById(userDto) == 1
                ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
        return new ResponseEntity<>(httpStatus);
    }

    @PutMapping("/")
    public ResponseEntity<?> updateUserById(@RequestBody UserDto userDto){
        //tesst
        userDto.setId(securityService.getIdAtToken());
        userDto.setPhoneNum(userDto.getPhoneNum());
        userDto.setName(userDto.getName());
        HttpStatus httpStatus = userService.updateUserById(userDto) == 1
                ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
        return new ResponseEntity<>(httpStatus);
    }

    @GetMapping("/check")
    public Boolean check(){
        return true;
    }
}
