package com.arang.backend.service;

import com.arang.backend.model.Hall;
import com.arang.backend.model.Users;
import com.arang.backend.repo.HallRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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