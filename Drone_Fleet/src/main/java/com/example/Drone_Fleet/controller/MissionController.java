package com.example.Drone_Fleet.controller;

import com.example.Drone_Fleet.model.Mission;
import com.example.Drone_Fleet.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/missions")
public class MissionController {
    private final MissionService missionService;

    @Autowired
    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @PostMapping
    public Mission assignMission(@RequestBody Mission mission) {
        return missionService.assignMission(mission);
    }
} 