package com.security.template.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.security.template.model.Hall;
import com.security.template.service.HallService;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class HallController {

    @Autowired
    private HallService hallService;

    @PostMapping("/add/hall")
    public Hall addHalls(@RequestBody Hall hall){
        return hallService.addHall(hall);
    }

    @GetMapping("get/all/halls")
    public List<Hall> getAllHalls(){return hallService.getAllHall(); }

}
