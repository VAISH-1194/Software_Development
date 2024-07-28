import React from 'react';
import Navbar from './Navbar';
import Chennai from "../assets/img/chennai.png"
import Mumbai from "../assets/img/mumbai.png"
import Kolkata from "../assets/img/kolkata.png"
import Pune from "../assets/img/pune.png"
import { useNavigate } from 'react-router-dom';


import '../assets/css/Landing.css';

const Landing = ({ onSignInClick }) => {

  const handleBookNowClick = () => {
    navigate('/book');
  };
  return (
    <div className='landing'>
      <div className='banner'>
        <Navbar onSignInClick={onSignInClick} />
        <div className="content">
          <h1>MAKE YOUR EVENT UNFORGETTABLE</h1>
          <p>
            Choose from a selection of exquisite halls and venues, each with its own unique charm.<br/>
            Let us help you create memories that will last a lifetime.
          </p>
          <div>
            <button type="btn1" className='btn1'><span></span>GET STARTED</button>
            <button type="btn1" className='btn1'><span></span>MY BOOKINGS</button>
          </div>
        </div>
      </div>

      <section class="section feature" aria-label="feature">
        <div class="container">

          <div class="grid-list">

            <li>
              <div class="feature-card">

                <div class="card-icon">
                  <img src= {Chennai} width="100" height="100" loading="lazy" alt="feature icon"
                    class="w-100"/>
                </div>

                <div>
                  <h3 class="h3 card-title">Chennai</h3>
                </div>

              </div>
            </li>

            <li>
              <div class="feature-card">

                <div class="card-icon">
                  <img src= {Mumbai} width="100" height="100" loading="lazy" alt="feature icon"
                    class="w-100"/>
                </div>

                <div>
                  <h3 class="h3 card-title">Mumbai</h3>
                </div>

              </div>
            </li>

            <li>
              <div class="feature-card">

                <div class="card-icon">
                  <img src= {Kolkata} width="100" height="100" loading="lazy" alt="feature icon"
                    class="w-100"/>
                </div>

                <div>
                  <h3 class="h3 card-title">Kolkata</h3>
                </div>

              </div>
            </li>

            <li>
              <div class="feature-card">

                <div class="card-icon">
                  <img src={Pune} width="100" height="100" loading="lazy" alt="feature icon"
                    class="w-100"/>
                </div>

                <div>
                  <h3 class="h3 card-title">Pune</h3>
                </div>

              </div>
            </li>
          </div>

        </div>
      </section>

      <section class="page-content3">
    <div class="card3">
      <div class="content3">
        <h2 class="title3">Hall 1</h2>
        <p class="copy3">Plan your next function with these fabulous destinations</p>
        <button className="btn3" onClick={handleBookNowClick}>Book Now</button>
      </div>
    </div>

    <div class="card3">
      <div class="content3">
        <h2 class="title3">Hall 2</h2>
        <p class="copy3">Plan your next function with these fabulous destinations</p>
        <button className="btn3" onClick={handleBookNowClick}>Book Now</button>
      </div>
    </div>

    <div class="card3">
      <div class="content3">
        <h2 class="title3">Hall 3</h2>
        <p class="copy3">Plan your next function with these fabulous destinations</p>
        <button className="btn3" onClick={handleBookNowClick}>Book Now</button>
      </div>
    </div>

    <div class="card3">
      <div class="content3">
        <h2 class="title3">Hall 4</h2>
        <p class="copy3">Plan your next function with these fabulous destinations</p>
        <button className="btn3" onClick={handleBookNowClick}>Book Now</button>
      </div>
    </div>

    <div class="card3">
      <div class="content3">
        <h2 class="title3">Hall 5</h2>
        <p class="copy3">Plan your next function with these fabulous destinations</p>
        <button className="btn3" onClick={handleBookNowClick}>Book Now</button>
      </div>
    </div>

    <div class="card3">
      <div class="content3">
        <h2 class="title3">Hall 6</h2>
        <p class="copy3">Plan your next function with these fabulous destinations</p>
        <button className="btn3" onClick={handleBookNowClick}>Book Now</button>
      </div>
    </div>

    <div class="card3">
      <div class="content3">
        <h2 class="title3">Hall 7</h2>
        <p class="copy3">Plan your next function with these fabulous destinations</p>
        <button className="btn3" onClick={handleBookNowClick}>Book Now</button>
      </div>
    </div>

    <div class="card3">
      <div class="content3">
        <h2 class="title3">Hall 8</h2>
        <p class="copy3">Plan your next function with these fabulous destinations</p>
        <button className="btn3" onClick={handleBookNowClick}>Book Now</button>
      </div>
    </div>
  </section>

  <footer class="footer">
  <div class="container">
      <div class="row">
          <div class="footer-col">
              <h4>company</h4>
              <ul>
                  <li><a href="#">about us</a></li>
                  <li><a href="#">our services</a></li>
                  <li><a href="#">privacy policy</a></li>
                  <li><a href="#">affiliate program</a></li>
              </ul>
          </div>
          <div class="footer-col">
              <h4>get help</h4>
              <ul>
                  <li><a href="#">FAQ</a></li>
                  <li><a href="#">shipping</a></li>
                  <li><a href="#">returns</a></li>
                  <li><a href="#">order status</a></li>
                  <li><a href="#">payment options</a></li>
              </ul>
          </div>
          <div class="footer-col">
              <h4>online shop</h4>
              <ul>
                  <li><a href="#">watch</a></li>
                  <li><a href="#">bag</a></li>
                  <li><a href="#">shoes</a></li>
                  <li><a href="#">dress</a></li>
              </ul>
          </div>
          <div class="footer-col">
              <h4>follow us</h4>
              <div class="social-links">
                  <a href="#"><i class="fas fa-question-circle"></i></a>
                  <a href="#"><i class="fab fa-twitter"></i></a>
                  <a href="#"><i class="fab fa-instagram"></i></a>
                  <a href="#"><i class="fab fa-linkedin-in"></i></a>
              </div>
          </div>
      </div>
  </div>
</footer>

    </div>
  );
};

export default Landing;
