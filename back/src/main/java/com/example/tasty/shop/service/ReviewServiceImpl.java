package com.example.tasty.shop.service;


import com.example.tasty.shop.model.Review;
import com.example.tasty.shop.repo.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements reviewService {
    @Autowired
    ReviewRepo reviewRepo;
    @Override
    public Boolean createReview(Review reviewDto) {

        Review new_review =reviewRepo.save(reviewDto);
        if(new_review.getId()!=null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Integer countReview(Integer userId) {
        return reviewRepo.countByUserId(userId);
    }
}