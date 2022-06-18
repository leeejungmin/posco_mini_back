package com.example.tasty.shop.repository;


import com.example.tasty.shop.model.Review;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReviewMapper {
    Integer createReview(Review reviewDto);
}
