package com.example.Drone_Fleet.service;

import com.example.Drone_Fleet.model.Drone;
import com.example.Drone_Fleet.model.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FleetManagerService {
    private final DroneService droneService;
    private final MissionService missionService;

    @Autowired
    public FleetManagerService(DroneService droneService, MissionService missionService) {
        this.droneService = droneService;
        this.missionService = missionService;
    }

    // Observer pattern hooks would be implemented here to notify when drone status changes
    public void optimizeFleet() {
        List<Drone> drones = droneService.getAllDrones();
        for (Drone drone : drones) {
            if (drone.getBatteryLevel() < 20 && drone.getMissions() != null && !drone.getMissions().isEmpty()) {
                // Find another available drone
                for (Drone candidate : drones) {
                    if (!candidate.getId().equals(drone.getId()) && candidate.getBatteryLevel() > 50) {
                        // Reassign all missions from low-battery drone to candidate
                        for (Mission mission : drone.getMissions()) {
                            mission.setDrone(candidate);
                            missionService.assignMission(mission);
                        }
                        drone.getMissions().clear();
                        droneService.updateDrone(drone);
                        break;
                    }
                }
            }
        }
    }
} 