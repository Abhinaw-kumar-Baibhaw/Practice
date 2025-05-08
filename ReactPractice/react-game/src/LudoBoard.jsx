import { useState } from "react";

export default function LudoBoard(){
    let blue={backgroundColor:"blue"};
    let yellow = {backgroundColor:"yellow",color:"black"};
    let green = {backgroundColor:"green"};
    let red = {backgroundColor:"red"};
    const [moves,setMoves] = useState({blue:0,yellow:0,green:0,red:0})

    let updateBlue = ()=>{
          setMoves((preMoves) =>{
            return {...preMoves,blue:preMoves.blue+1};
    });
  };
    let updateYellow = ()=>{
          setMoves((preMoves) =>{
            return {...preMoves,yellow:preMoves.yellow+1};
    });
 };
    let updateGreen = ()=>{
          setMoves((preMoves) =>{
            return {...preMoves,green:preMoves.green+1};
    });
 };
    let updateRed = ()=>{
          setMoves((preMoves) =>{
            return {...preMoves,red:preMoves.red+1};
    });
};
    return(
        <>
           <h2>This is basic Ludo Game Dashboard</h2>
           <p>Blue Moves : {moves.blue}</p>
           <button style={blue} onClick={updateBlue}>+1</button>
           <p>Yellow Moves : {moves.yellow}</p>
           <button style={yellow} onClick={updateYellow}>+1</button>
           <p>Green Moves : {moves.green}</p>
           <button style={green} onClick={updateGreen}>+1</button>
           <p>Red Moves : {moves.red}</p>
           <button style={red} onClick={updateRed}>+1</button>
        </>
    )
}