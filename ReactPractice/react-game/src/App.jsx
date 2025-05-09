import { useSelector, useDispatch } from 'react-redux';
import './App.css';

function App() {
  const count = useSelector((state) => state.count);     // ✅ Access count from Redux store
  const dispatch = useDispatch();                         // ✅ Get dispatch function

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      <h1>Counter: {count}</h1>
      <button onClick={() => dispatch({ type: 'INCREMENT' })}>+</button> &nbsp; &nbsp;
      <button onClick={() => dispatch({ type: 'DECREMENT' })}>-</button>
    </div>
  );
}

export default App;
