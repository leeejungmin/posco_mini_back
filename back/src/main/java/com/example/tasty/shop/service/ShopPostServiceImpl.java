package com.example.tasty.shop.service;

import com.example.tasty.shop.model.ShopDto;
import com.example.tasty.shop.repository.ShopPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopPostServiceImpl  implements ShopPostService{

    @Autowired
    ShopPostMapper shopPostMapper;


    @Override
    public List<ShopDto> findShopById(ShopDto shopDto) {
        return shopPostMapper.getShopPostById(shopDto);
    }
}
