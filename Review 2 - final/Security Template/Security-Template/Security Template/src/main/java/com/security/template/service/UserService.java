package com.security.template.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.template.model.Users;
import com.security.template.repo.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Users addUser(Users user)
    {
        return userRepo.save(user);
    }

    public List<Users> getAllUser()
    {
        return userRepo.findAll();
    }

    public boolean deleteUser(Long userID) {
        Optional<Users> user = userRepo.findById(userID);
        if(user.isEmpty()) {
            return false;
        }
        userRepo.deleteById(userID);
        return true;
    }
}
