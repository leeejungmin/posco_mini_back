package com.example.tasty.review.model;

import lombok.Data;

@Data
public class ReviewDto {
    private Integer id;
    private Integer userId;
    private Integer shopId;
    private Integer rate;
    private String content;
    private String photo;

}
