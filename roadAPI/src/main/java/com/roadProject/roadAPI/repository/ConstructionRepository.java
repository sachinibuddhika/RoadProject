package com.roadProject.roadAPI.repository;

import com.roadProject.roadAPI.model.Construction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConstructionRepository extends JpaRepository<Construction,Long> {
}
