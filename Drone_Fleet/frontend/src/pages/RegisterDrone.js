import React, { useState } from 'react';
import { registerDrone } from '../services/droneService';

export default function RegisterDrone() {
  const [drone, setDrone] = useState({ model: '', status: 'Available', batteryLevel: 100 });

  const handleChange = (e) => {
    setDrone({ ...drone, [e.target.name]: e.target.value });
  };

  const handleSubmit = async () => {
    await registerDrone(drone);
    alert("Drone registered!");
  };

  return (
    <div className="form-container">
      <h2>Register a New Drone</h2>
      <input type="text" name="model" placeholder="Model" onChange={handleChange} /><br />
      <input type="number" name="batteryLevel" placeholder="Battery Level" onChange={handleChange} /><br />
      <button onClick={handleSubmit}>Register</button>
    </div>
  );
}
