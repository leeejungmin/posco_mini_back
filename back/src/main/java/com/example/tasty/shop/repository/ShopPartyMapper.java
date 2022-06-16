package com.example.tasty.shop.repository;

import com.example.tasty.shop.model.PartyDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopPartyMapper extends JpaRepository<PartyDto, Integer>{


//    List<PartyDto> getPartyPostById(PartyDto partyDto);

//    //DB 데이터를 불러오는 메소드
//    List<PartyDto> getPartyList();
//
//    // DB에 데이터를 저장하는 메소드
//    void insertParty(PartyDto partyDto);


}