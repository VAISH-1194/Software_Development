package com.max.usecase.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.usecase.models.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {

}
