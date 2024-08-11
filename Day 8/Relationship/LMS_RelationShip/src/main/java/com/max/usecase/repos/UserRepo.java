package com.max.usecase.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.max.usecase.models.User;



public interface UserRepo extends JpaRepository<User,Long>{  
}
