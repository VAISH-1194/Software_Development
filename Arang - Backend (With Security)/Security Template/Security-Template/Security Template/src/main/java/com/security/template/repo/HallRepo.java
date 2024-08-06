package com.security.template.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.template.model.Hall;

@Repository
public interface HallRepo extends JpaRepository<Hall, Long> {

}
