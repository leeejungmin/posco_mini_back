package com.example.tasty.shop.repo;

import com.example.tasty.shop.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends JpaRepository<Review,Integer> {
    //List<Review> findByShopId(Review review);
    // 1.리뷰 작성하는 쿼리메소드 하기(reviewMapper)

//    @Query(value=" SELECT s.id AS newid, s.name AS name, s.location AS location, s.image AS image, g.rate AS grade, g.content, g.photo, g.rate FROM shop s " +
//            " JOIN (SELECT r.id, r.userId, AVG(r.rate) AS rate, r.content,  r.photo FROM review r GROUP BY r.id) g WHERE g.id = :shopId ", nativeQuery = true)
//    List<Review> findByShopId(@Param("shopId") Integer shopId);

}