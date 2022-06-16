package com.example.tasty.shop.controller;

import com.example.tasty.shop.model.PartyDto;
import com.example.tasty.shop.model.ShopDto;
import com.example.tasty.shop.repository.ShopPartyMapper;
import com.example.tasty.shop.service.ShopPartyService;
import com.example.tasty.shop.service.ShopPartyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/party")
public class ShopPartyController {
    @Autowired
    private ShopPartyService ShopPartyService;

    @PostMapping("/add")
    public String add(@RequestBody PartyDto partyDto){
        System.out.println("들어옴?");
        ShopPartyService.saveParty(partyDto);
        return "New participant is added";

    }




}