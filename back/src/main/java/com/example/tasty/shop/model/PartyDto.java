package com.example.tasty.shop.model;

import lombok.Data;

@Data
public class PartyDto {
        private Integer id;
        private Integer userId;
        private Integer shopId;
        private String date;
        private String name;
}
