package com.example.tasty.shop.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

// party 테이블 DB 변수 선언
// Lombok의 Data로 getter, setter를 대신한다.
@Entity
@Table(name = "party")
@Data
public class PartyDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // id 자동 생성

    @Column(name = "userId")
    private Integer userId;
    @Column(name = "shopId")
    private Integer shopId;
    @Column(name = "date")
    private Date date;

    public PartyDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }


}