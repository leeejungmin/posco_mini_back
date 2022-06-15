package com.example.tasty.shop.service;

import com.example.tasty.shop.model.ReviewDto;

import java.util.List;

public interface ReviewListService {
    List<ReviewDto> findReviewByShopId(ReviewDto reviewDto);

}
