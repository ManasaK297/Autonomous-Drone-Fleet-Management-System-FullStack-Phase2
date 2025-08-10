import React from 'react';
import { useNavigate } from 'react-router-dom';

export default function Home() {
  const navigate = useNavigate();

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>🚁 Drone Fleet Management System</h1>
      <button onClick={() => navigate('/register')}>Register Drone</button><br /><br />
      <button onClick={() => navigate('/assign')}>Assign Mission</button><br /><br />
      <button onClick={() => navigate('/monitor')}>Monitor Drones</button><br /><br />
      <button onClick={() => navigate('/optimize')}>Optimize Fleet</button>
    </div>
  );
}
