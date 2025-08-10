import axios from 'axios';

const API_BASE = "http://localhost:8080/api";

export const getDrones = () => axios.get(`${API_BASE}/drones`);
export const registerDrone = (drone) => axios.post(`${API_BASE}/drones`, drone);
export const assignMission = (mission) => axios.post(`${API_BASE}/missions`, mission);
export const optimizeFleet = () => axios.post(`${API_BASE}/optimize`);
