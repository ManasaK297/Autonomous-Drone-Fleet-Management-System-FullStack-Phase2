package com.example.Drone_Fleet.repository;

import com.example.Drone_Fleet.model.Drone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneRepository extends JpaRepository<Drone, Long> {
} 