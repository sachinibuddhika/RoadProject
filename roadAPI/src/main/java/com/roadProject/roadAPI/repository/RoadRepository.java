package com.roadProject.roadAPI.repository;

import com.roadProject.roadAPI.model.Road;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoadRepository extends JpaRepository<Road,Long> {
}
