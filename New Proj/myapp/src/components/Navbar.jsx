import React from 'react';
import logo from '../assets/img/logo.png';
import '../assets/css/Navbar.css';

const Navbar = ({ onSignInClick }) => {
  return (
    <div className='banner1'>
      <div className='navbar'>
        <img src={logo} className='logo' alt='Logo' />
        <ul>
          <li><a href='/'>Home</a></li>
          <li><a href='/desc'>About</a></li>
          <li><a href='#'>Halls</a></li>
          <li><a href='#'>Reviews</a></li>
        </ul>
        <button className='btn' onClick={onSignInClick}>Sign-in</button>
      </div>
    </div>
  );
};

export default Navbar;

