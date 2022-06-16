package com.example.tasty.shop.service;


import com.example.tasty.shop.model.ReviewDto;
import com.example.tasty.shop.repository.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements reviewService {
    @Autowired
    ReviewMapper reviewMapper;
    @Override
    public Integer createReview(ReviewDto reviewDto) {
       return reviewMapper.createReview(reviewDto);
    }
}
