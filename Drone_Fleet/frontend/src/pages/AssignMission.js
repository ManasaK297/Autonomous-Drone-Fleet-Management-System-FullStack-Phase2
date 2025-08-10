import React, { useState } from 'react';
import { assignMission } from '../services/droneService';

export default function AssignMission() {
  const [mission, setMission] = useState({ missionType: '', assignedDrone: '' });

  const handleChange = (e) => {
    setMission({ ...mission, [e.target.name]: e.target.value });
  };

  const handleSubmit = async () => {
    await assignMission(mission);
    alert("Mission assigned!");
  };

  return (
    <div className="form-container">
      <h2>Assign a Mission</h2>
      <input type="text" name="missionType" placeholder="Mission Type" onChange={handleChange} /><br />
      <input type="text" name="assignedDrone" placeholder="Drone ID" onChange={handleChange} /><br />
      <button onClick={handleSubmit}>Assign</button>
    </div>
  );
}
