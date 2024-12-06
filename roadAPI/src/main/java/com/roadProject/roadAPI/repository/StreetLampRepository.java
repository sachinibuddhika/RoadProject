package com.roadProject.roadAPI.repository;

import com.roadProject.roadAPI.model.StreetLamp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetLampRepository extends JpaRepository<StreetLamp,Long> {
}
