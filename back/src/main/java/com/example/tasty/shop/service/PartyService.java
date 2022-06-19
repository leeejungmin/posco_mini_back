package com.example.tasty.shop.service;

import com.example.tasty.shop.model.PartyDto;

import java.util.List;

public interface PartyService {
    Integer registerParty(PartyDto PartyDto);

    List<PartyDto> findAll();
}
