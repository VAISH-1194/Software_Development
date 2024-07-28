// import React, { useState } from 'react';
// import "./App.css";
// import Login from './components/Login';
// import Landing from './components/Landing';
// import Book from './components/Book';

// const App = () => {
//   const [showLogin, setShowLogin] = useState(false);

//   const handleSignInClick = () => {
//     setShowLogin(true);
//   };

//   const handleOverlayClick = (e) => {
//     if (e.target === e.currentTarget) {
//       setShowLogin(false);
//     }
//   };

//   const handleCloseLogin = () => {
//     setShowLogin(false);
//   };

//   return (
//     <div className="app-container">
//       <Landing onSignInClick={handleSignInClick} />
//       {showLogin && (
//         <div className="overlay" onClick={handleOverlayClick}>
//           <div className="login-modal">
//             <Login onClose={handleCloseLogin} />
//           </div>
//         </div>
//       )}
//     </div>
//   );
// };

// export default App;













import React, { useState } from 'react';
import { BrowserRouter as Router, Route, Routes, useNavigate } from 'react-router-dom';
import "./App.css";
import Login from './components/Login';
import Landing from './components/Landing';
import Book from './components/Book';

const App = () => {
  const [showLogin, setShowLogin] = useState(false);

  const handleSignInClick = () => {
    setShowLogin(true);
  };

  const handleOverlayClick = (e) => {
    if (e.target === e.currentTarget) {
      setShowLogin(false);
    }
  };

  const handleCloseLogin = () => {
    setShowLogin(false);
  };

  return (
    <Router>
      <div className="app-container">
        <Routes>
          <Route path="/" element={<Landing onSignInClick={handleSignInClick} />} />
          <Route path="/book" element={<Book />} />
        </Routes>
        {showLogin && (
          <div className="overlay" onClick={handleOverlayClick}>
            <div className="login-modal">
              <Login onClose={handleCloseLogin} />
            </div>
          </div>
        )}
      </div>
    </Router>
  );
};

export default App;
