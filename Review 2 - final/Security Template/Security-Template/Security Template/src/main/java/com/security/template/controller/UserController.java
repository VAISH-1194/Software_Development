package com.security.template.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.security.template.model.Users;
import com.security.template.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String checkService() {return new String("Service is up and running."); }

    @PostMapping("/add/user")
    public Users addUser(@RequestBody Users user)
    {
        return userService.addUser(user);
    }

    @GetMapping("get/all/users")
    public List<Users> getAllUsers(){return userService.getAllUser(); }

    @DeleteMapping("/delete/user/{userID}")
    public String deleteUser(@PathVariable Long userID){
         boolean response = userService.deleteUser(userID);
         if(response)
             return "User : " + userID + " deleted successfully";
         else
             return "No such user";
    }
}
