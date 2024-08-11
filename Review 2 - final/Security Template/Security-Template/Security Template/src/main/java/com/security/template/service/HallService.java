package com.security.template.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.template.model.Hall;
import com.security.template.repo.HallRepo;

import java.util.List;

@Service
public class HallService {

    @Autowired
    private HallRepo hallRepo;

    public Hall addHall(Hall hall)
    {
        return hallRepo.save(hall);
    }

    public List<Hall> getAllHall()
    {
        return hallRepo.findAll();
    }
}
