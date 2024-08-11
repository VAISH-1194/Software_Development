package com.arang.backend.repo;

import com.arang.backend.model.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepo extends JpaRepository<Hall, Long> {

}
