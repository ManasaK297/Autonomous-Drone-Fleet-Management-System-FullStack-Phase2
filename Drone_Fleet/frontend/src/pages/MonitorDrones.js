import React, { useEffect, useState } from 'react';
import { getDrones } from '../services/droneService';

export default function MonitorDrones() {
  const [drones, setDrones] = useState([]);

  useEffect(() => {
    getDrones().then(res => setDrones(res.data));
  }, []);

  return (
    <div>
      <h2>Drone Status</h2>
      <table>
        <thead>
          <tr>
            <th>ID</th><th>Model</th><th>Status</th><th>Battery</th>
          </tr>
        </thead>
        <tbody>
          {drones.map((drone, i) => (
            <tr key={i}>
              <td>{drone.id}</td>
              <td>{drone.model}</td>
              <td>{drone.status}</td>
              <td>{drone.batteryLevel}%</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}
