package com.example.tasty.shop.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;

@Data
@Builder
//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AI 설정
    @Column(name="id")  //db의 칼럼명과 같아야 함
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="location")
    private String location;
    @Column(name="image")
    private String image;
}
