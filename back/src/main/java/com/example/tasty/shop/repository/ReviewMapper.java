package com.example.tasty.shop.repository;


import com.example.tasty.shop.model.ReviewDto;
import com.example.tasty.user.model.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReviewMapper {
    Integer createReview(ReviewDto reviewDto);
}
