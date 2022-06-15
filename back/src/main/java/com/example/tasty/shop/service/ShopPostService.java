package com.example.tasty.shop.service;

import com.example.tasty.shop.model.ShopDto;

import java.util.List;

public interface ShopPostService {
    List<ShopDto> findShopById(ShopDto shopDto);
}
