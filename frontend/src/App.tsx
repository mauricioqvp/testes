import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Home from './Pages';
import Dados from './Page2';
import './App.css';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Dados />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
