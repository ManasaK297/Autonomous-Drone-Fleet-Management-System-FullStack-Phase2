package com.example.Drone_Fleet.service;

import com.example.Drone_Fleet.model.Drone;
import com.example.Drone_Fleet.repository.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DroneService {
    private final DroneRepository droneRepository;

    @Autowired
    public DroneService(DroneRepository droneRepository) {
        this.droneRepository = droneRepository;
    }

    public Drone registerDrone(Drone drone) {
        return droneRepository.save(drone);
    }

    public List<Drone> getAllDrones() {
        return droneRepository.findAll();
    }

    public Optional<Drone> getDroneById(Long id) {
        return droneRepository.findById(id);
    }

    public Drone updateDrone(Drone drone) {
        return droneRepository.save(drone);
    }
} 