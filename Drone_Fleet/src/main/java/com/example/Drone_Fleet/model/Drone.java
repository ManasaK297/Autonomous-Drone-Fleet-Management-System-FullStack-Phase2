package com.example.Drone_Fleet.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Drone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String status;
    private int batteryLevel;

    @OneToMany(mappedBy = "drone", cascade = CascadeType.ALL)
    private List<Mission> missions;

    public Drone() {}

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public int getBatteryLevel() { return batteryLevel; }
    public void setBatteryLevel(int batteryLevel) { this.batteryLevel = batteryLevel; }
    public List<Mission> getMissions() { return missions; }
    public void setMissions(List<Mission> missions) { this.missions = missions; }
} 