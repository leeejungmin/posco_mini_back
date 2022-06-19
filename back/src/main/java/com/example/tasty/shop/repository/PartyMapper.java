package com.example.tasty.shop.repository;

import com.example.tasty.shop.model.PartyDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PartyMapper {

    Integer registerParty(PartyDto partyDto);

    List<PartyDto> findAll();
}
