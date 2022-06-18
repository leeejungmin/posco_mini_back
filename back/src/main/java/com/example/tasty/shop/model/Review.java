package com.example.tasty.shop.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity(name="review")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AI 설정
    @Column(name="id")  //db의 칼럼명과 같아야 함
    private Integer id;

    @Column(name="userId")
    private Integer userId;

    @Column(name="shopId")
    private Integer shopId;

    @Column(name="rate")
    private Integer rate;

    @Column(name="content")
    private String content;

    @Column(name="photo")
    private String photo;

//    @ManyToOne
//    @JoinColumn(name="shop_id")
//    private Shop shop;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "shop_id")
//    @JsonBackReference
//    private Shop shop;
//    //이 테이블의 shopId랑 shop테이블의 id를 조인

//    @OneToMany
//    @JoinColumns(foreignKey = @JoinColumn(name="id"),
//            )
//    @JoinTable(name="Review_Shop",
//            joinColumns = @JoinColumn(name="shopId"),
//            inverseJoinColumns = @JoinColumn(name="id"))
//    private List<Review> review = new ArrayList<Review>();
//    @JoinColumn(name="id")
//    private List<Review> review = new ArrayList<Review>();

}