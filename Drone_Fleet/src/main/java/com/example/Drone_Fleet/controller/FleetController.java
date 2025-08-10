package com.example.Drone_Fleet.controller;

import com.example.Drone_Fleet.service.FleetManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/optimize")
public class FleetController {
    private final FleetManagerService fleetManagerService;

    @Autowired
    public FleetController(FleetManagerService fleetManagerService) {
        this.fleetManagerService = fleetManagerService;
    }

    @PostMapping
    public String optimizeFleet() {
        fleetManagerService.optimizeFleet();
        return "Fleet optimization triggered.";
    }
} 