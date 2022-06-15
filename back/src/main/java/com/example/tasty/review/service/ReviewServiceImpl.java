package com.example.tasty.review.service;

import com.example.tasty.review.model.ReviewDto;
import com.example.tasty.review.repository.ReviewMapper;
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
