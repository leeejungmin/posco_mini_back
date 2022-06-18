package com.example.tasty.shop.service;

import com.example.tasty.shop.model.Shop;
import com.example.tasty.shop.model.ShopDto;
import com.example.tasty.shop.repo.ShopListRepo;
import com.example.tasty.shop.repository.ShopPostMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ShopListServiceImpl implements ShopListService{

//    @Autowired
//    ShopListMapper shopListMapper;
    @Autowired
    ShopListRepo shopListRepo;

    @Autowired
    ShopPostMapper shopPostMapper;

    @Override
    public List<Shop> getShopList() {
        //eturn shopListMapper.getShopList();
        //System.out.println(shopListRepo.findAll());
        return shopListRepo.findAll();
    }

    @Override
    public List<ShopDto> getShopGrade() {
        return shopPostMapper.getShopGrade();
    }


}
