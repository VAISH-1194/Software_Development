package com.max.usecase.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.usecase.models.JwtToken;

public interface JwtTokenRepo extends JpaRepository<JwtToken,Long>{

}
