package com.roadProject.roadAPI.repository;

import com.roadProject.roadAPI.model.Cultivation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CultivationRepository extends JpaRepository<Cultivation,Long> {
}
