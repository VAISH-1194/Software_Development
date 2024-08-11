package com.max.usecase.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.usecase.models.Assignment;

public interface AssignmentRepo extends JpaRepository<Assignment,Long>{
    
}
