package com.example.tasty.shop.repository;


import com.example.tasty.shop.model.ReviewDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewListMapper {
    List<ReviewDto> getReviewByShopId(ReviewDto reviewDto);
<<<<<<< HEAD
}
=======
}
>>>>>>> fbb4ee89cdae7f3e4d8bc7327a704909e60da4c1
