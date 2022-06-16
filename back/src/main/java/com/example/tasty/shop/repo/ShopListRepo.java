package com.example.tasty.shop.repo;

import com.example.tasty.shop.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopListRepo  extends JpaRepository<Shop,Integer> {
    List<Shop> findAll();

}
