package com.example.Drone_Fleet.repository;

import com.example.Drone_Fleet.model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Long> {
} 