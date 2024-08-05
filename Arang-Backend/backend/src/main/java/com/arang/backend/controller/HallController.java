package com.arang.backend.controller;

import com.arang.backend.model.Hall;
import com.arang.backend.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
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
