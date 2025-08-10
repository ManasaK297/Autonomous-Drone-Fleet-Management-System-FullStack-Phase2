import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Home from "./pages/Home";
import RegisterDrone from "./pages/RegisterDrone";
import AssignMission from "./pages/AssignMission";
import MonitorDrones from "./pages/MonitorDrones";
import OptimizeFleet from "./pages/OptimizeFleet";
import './css/styles.css';


export default function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/register" element={<RegisterDrone />} />
        <Route path="/assign" element={<AssignMission />} />
        <Route path="/monitor" element={<MonitorDrones />} />
        <Route path="/optimize" element={<OptimizeFleet />} />
      </Routes>
    </Router>
  );
}
