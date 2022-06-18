package com.example.tasty.shop.controller;

import com.example.tasty.config.SecurityService;
import com.example.tasty.shop.model.ReviewDto;
import com.example.tasty.shop.model.ShopDto;
import com.example.tasty.shop.service.ReviewListServiceImpl;
import com.example.tasty.shop.service.ShopListServiceImpl;
import com.example.tasty.shop.service.ShopPostServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;



@RestController
@Slf4j
@RequestMapping("shop")
public class ShopDetailController {

    @Autowired
    ShopPostServiceImpl shopPostService;

    @Autowired
    ReviewListServiceImpl reviewListService;

    @Autowired
    SecurityService securityService;


    @GetMapping("detail/{id}")
    public HashMap<String, Object> getShopPostById(@PathVariable String id){

        HashMap<String, Object> map = new HashMap<String, Object>();

        ShopDto shopDto = new ShopDto();
        shopDto.setId(Integer.valueOf(id));

        ReviewDto reviewDto = new ReviewDto();
        reviewDto.setShopId(Integer.valueOf(id));

        List<ShopDto> shopDetail = shopPostService.findShopById(shopDto);
        List<ReviewDto> reviewList = reviewListService.findReviewByShopId(reviewDto);

        map.put("shop", shopDetail);
        map.put("review", reviewList);

        return map;
    }

    @GetMapping("review/{id}")
    public List<ReviewDto> getReviewByShopId(@PathVariable String id){
        ReviewDto reviewDto = new ReviewDto();
        reviewDto.setShopId(Integer.valueOf(id));
        return reviewListService.findReviewByShopId(reviewDto);
    }
}