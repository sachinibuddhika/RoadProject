package com.roadProject.roadAPI.repository;

import com.roadProject.roadAPI.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepository extends JpaRepository<Business,Long> {
}
