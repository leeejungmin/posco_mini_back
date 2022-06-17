package com.example.tasty.shop.service;

import com.example.tasty.shop.model.ReviewDto;
import com.example.tasty.shop.repository.ReviewListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewListServiceImpl implements ReviewListService{

    @Autowired
    ReviewListMapper reviewListMapper;

    @Override
    public List<ReviewDto> findReviewByShopId(ReviewDto reviewDto) {
        return reviewListMapper.getReviewByShopId(reviewDto);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> fbb4ee89cdae7f3e4d8bc7327a704909e60da4c1
