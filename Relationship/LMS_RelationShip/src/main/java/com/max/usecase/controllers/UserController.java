package com.max.usecase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.max.usecase.models.User;
import com.max.usecase.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices uservice;

    @GetMapping("/all")
    public List<User> GetUsers() {
        return uservice.getUsers();
    }
    @PostMapping("/register")
    public User AddUser(@RequestBody User user){
        return uservice.addUser(user);
    }
}
