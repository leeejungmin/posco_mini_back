package com.example.tasty.shop.controller;

import com.example.tasty.shop.model.Shop;
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
<<<<<<< HEAD
    public List<ShopDto> getShopList(){
=======
    public List<Shop> getShopList(){

>>>>>>> fbb4ee89cdae7f3e4d8bc7327a704909e60da4c1
        log.info(shopListService.getShopList().toString());
        return shopListService.getShopList();
    }
}
