package com.arang.backend.service;

import com.arang.backend.model.Users;
import com.arang.backend.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
