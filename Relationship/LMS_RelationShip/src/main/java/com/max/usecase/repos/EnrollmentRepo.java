package com.max.usecase.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.usecase.models.Enrollment;

public interface EnrollmentRepo extends JpaRepository<Enrollment, Long> {

}
