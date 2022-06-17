package com.example.tasty.shop.model;


import lombok.Data;

@Data
public class ReviewDto {
    private Integer id;
    private String userId;
    private Integer shopId;
    private Integer rate;
    private String content;
    private String photo;
}
