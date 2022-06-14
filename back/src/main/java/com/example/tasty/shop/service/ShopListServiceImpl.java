package com.example.tasty.shop.service;

import com.example.tasty.shop.model.ShopDto;
import com.example.tasty.shop.repository.ShopListMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ShopListServiceImpl implements ShopListService{

    @Autowired
    ShopListMapper shopListMapper;
    @Override
    public List<ShopDto> getShopList() {
        return shopListMapper.getShopList();
    }
}
