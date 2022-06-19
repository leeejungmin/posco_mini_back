package com.example.tasty.shop.controller;
import com.example.tasty.user.model.UserDto;
import com.example.tasty.shop.model.PartyDto;
import com.example.tasty.shop.service.PartyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("party")
public class PartyController {

    @Autowired
    PartyServiceImpl partyService;

    @PostMapping("/create")
    public HashMap<String, Object> registerParty(@RequestBody PartyDto partyDto) {

        System.out.println(".................party"+ partyDto);

        HashMap<String, Object> map = new HashMap<String, Object>();


        LocalDate localDate = LocalDate.now();
        partyDto.setDate(String.valueOf(localDate));

        Integer partyDtos = partyService.registerParty(partyDto);
        System.out.println("..............findallpary" + findAllParty());
        return findAllParty();
    }

    @GetMapping("/")
    public HashMap<String, Object> findAllParty() {

        HashMap<String, Object> map = new HashMap<String, Object>();
        List<PartyDto> partyDtos = partyService.findAll();
        System.out.println("findAll......"+partyDtos);
        map.put("partyusers", partyDtos);

        return map;
    }

}