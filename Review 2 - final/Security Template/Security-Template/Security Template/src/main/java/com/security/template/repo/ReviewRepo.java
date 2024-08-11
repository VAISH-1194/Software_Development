package com.security.template.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.template.model.Review;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Long>
{

}