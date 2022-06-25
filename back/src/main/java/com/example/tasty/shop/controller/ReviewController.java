package com.example.tasty.shop.controller;


import com.example.tasty.config.SecurityService;
import com.example.tasty.shop.model.Review;
import com.example.tasty.shop.model.ReviewDto;
import com.example.tasty.shop.service.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("review")
public class ReviewController {

    // review 는 userId(토큰값에서 가져오기, user테이블에서 id번호임), shopId(세영이 리스트에서 클릭했을때 받아오기)
    @Autowired
    ReviewServiceImpl reviewService;

    @Autowired
    SecurityService securityService;

    @PostMapping("/create")
    public ResponseEntity<?> createReview(@RequestBody Review reviewDto ){


        reviewDto.setShopId(Integer.valueOf(reviewDto.getShopId())); // list를 눌렀을때 shopId가 넘어온다
        reviewDto.setUserId(securityService.getIdAtToken());
        reviewDto.setRate(Integer.valueOf(reviewDto.getRate()));


        System.out.println(reviewDto.getUserId());
        System.out.println(reviewDto.getShopId());
        System.out.println(reviewDto.getContent());
        System.out.println(reviewDto.getPhoto());
        System.out.println(reviewDto.getRate());

        HttpStatus httpStatus = reviewService.createReview(reviewDto) == true ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;

        return new ResponseEntity<>(httpStatus);
    }

    @GetMapping("/count")
    public Integer countReview(){
        System.out.println("count..............................");
        Integer userId = securityService.getIdAtToken();

        Integer count = reviewService.countReview(userId);
        System.out.println("count.............................."+userId+count);
        return count;
    }

}
