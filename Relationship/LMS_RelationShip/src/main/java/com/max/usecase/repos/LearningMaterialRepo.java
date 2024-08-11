package com.max.usecase.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.usecase.models.LearningMaterial;

public interface LearningMaterialRepo extends JpaRepository<LearningMaterial, Long> {

}
