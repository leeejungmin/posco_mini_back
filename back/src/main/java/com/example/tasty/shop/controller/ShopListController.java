package com.example.tasty.shop.controller;

import com.example.tasty.shop.model.ShopDto;
import com.example.tasty.shop.service.ShopListService;
import com.example.tasty.shop.service.ShopListServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("shop")
public class ShopListController {

    @Autowired
    ShopListServiceImpl shopListService;

    @Autowired
    ShopDto shopDto;

    @GetMapping("/")
    public List<ShopDto> getShopList(){

        log.info(shopListService.getShopList().toString());
        return shopListService.getShopList();
    }
}
