package com.max.usecase.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.usecase.models.CourseRating;

public interface CourseRatingRepo extends JpaRepository<CourseRating, Long> {

    
}