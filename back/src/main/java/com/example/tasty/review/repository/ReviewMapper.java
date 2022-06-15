package com.example.tasty.review.repository;

import com.example.tasty.review.model.ReviewDto;
import com.example.tasty.user.model.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReviewMapper {
    Integer createReview(ReviewDto reviewDto);
}
