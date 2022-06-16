package com.example.tasty.shop.service;

import com.example.tasty.shop.model.PartyDto;
import com.example.tasty.shop.repository.ShopPartyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopPartyServiceImpl implements ShopPartyService{

    @Autowired
    private ShopPartyMapper shopPartyMapper;

    @Override
    public PartyDto saveParty(PartyDto partyDto) {
        return shopPartyMapper.save(partyDto);
    }
}