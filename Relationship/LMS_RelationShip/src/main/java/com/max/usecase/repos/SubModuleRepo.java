package com.max.usecase.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.usecase.models.SubModule;

public interface SubModuleRepo extends JpaRepository<SubModule, Long> {

}
