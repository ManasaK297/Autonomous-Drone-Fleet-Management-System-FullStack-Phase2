# 🚁 Autonomous Drone Fleet Management System

A **full-stack web application** for managing and monitoring a fleet of autonomous drones.  
Built using **Spring Boot** (Backend), **React.js** (Frontend), and **MySQL** (Database).

---

##  Features Implemented

### Backend (Spring Boot)
- **Drone Registration** – Add new drones with battery level, status, and unique ID.
- **Get All Drones** – View all drones stored in the database.
- **REST API Endpoints** for:
  - `/api/drones` (GET) → Fetch all drones.
  - `/api/drones` (POST) → Register a new drone.
  - `/api/missions` (POST) → Assign a mission to a drone.
  - `/api/optimize` (POST) → Optimize fleet usage.
- **CORS Configuration** for frontend communication.

###  Frontend (React)
- **Drone Registration Form** – Input drone name, battery level, and status.
- **Drone List Page** – View registered drones.
- **Axios Integration** – Connects frontend to backend APIs.
- Responsive UI (styling work in progress).

###  Database (MySQL)
- Stores drone details:  
  ```sql
  id | name | status | batteryLevel | missions
