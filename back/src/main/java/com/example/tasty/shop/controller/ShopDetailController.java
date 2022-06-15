package com.example.tasty.shop.controller;

import com.example.tasty.config.SecurityService;
import com.example.tasty.shop.model.ShopDto;
import com.example.tasty.shop.service.ShopListServiceImpl;
import com.example.tasty.shop.service.ShopPostServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Slf4j
@RequestMapping("shop")
public class ShopDetailController {

    @Autowired
    ShopPostServiceImpl shopPostService;

    @Autowired
    SecurityService securityService;


    @GetMapping("detail/{id}")
    public List<ShopDto> getShopPostById(@PathVariable String id){
        ShopDto shopDto = new ShopDto();
        shopDto.setId(Integer.valueOf(id));
        return shopPostService.findShopById(shopDto);
    }
}
