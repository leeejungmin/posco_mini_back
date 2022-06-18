package com.example.tasty.shop.repository;


import com.example.tasty.shop.model.ShopDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopPostMapper {
    List<ShopDto> getShopPostById(ShopDto shopDto);

    List<ShopDto> getShopGrade();

}
