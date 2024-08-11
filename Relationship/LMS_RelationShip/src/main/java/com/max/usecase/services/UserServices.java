package com.max.usecase.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.max.usecase.models.User;
import com.max.usecase.repos.UserRepo;

@Service
public class UserServices {
    @Autowired
    private UserRepo urepo;


    public List<User> getUsers(){
        return urepo.findAll();
    }

    public User addUser(User user){
        return urepo.save(user);
    }
}
