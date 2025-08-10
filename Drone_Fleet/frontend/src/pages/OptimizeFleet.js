import React from 'react';
import { optimizeFleet } from '../services/droneService';

export default function OptimizeFleet() {
  const handleClick = async () => {
    await optimizeFleet();
    alert("Fleet optimized!");
  };

  return (
    <div className="form-container">
      <h2>Optimize Fleet</h2>
      <button onClick={handleClick}>Optimize Now</button>
    </div>
  );
}
