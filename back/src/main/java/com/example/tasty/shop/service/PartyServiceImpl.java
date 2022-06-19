package com.example.tasty.shop.service;
import com.example.tasty.shop.model.PartyDto;
import com.example.tasty.shop.repository.PartyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyServiceImpl implements PartyService{

        @Autowired
        PartyMapper partyMapper;

        @Override
        public Integer registerParty(PartyDto partyDto) {
            return partyMapper.registerParty(partyDto);
        }

        @Override
        public List<PartyDto> findAll() {
                return partyMapper.findAll();
        }

       // public List<PartyDto> findAll() {
                //return partyMapper.findAll();
       // }
}
