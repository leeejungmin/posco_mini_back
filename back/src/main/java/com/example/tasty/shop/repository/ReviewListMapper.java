package com.example.tasty.shop.repository;


import com.example.tasty.shop.model.ReviewDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewListMapper {
    List<ReviewDto> getReviewByShopId(ReviewDto reviewDto);
}