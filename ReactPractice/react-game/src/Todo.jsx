import { useState } from "react";
import { v4 as uuidv4 } from "uuid";
export default function Todo(){
    const [todos,setTodos] = useState([{task:"Gym",id:uuidv4(),isDone:false}]);
    let [newTodos,setNewTodos] = useState("");
    let addTask = ()=>{
        setTodos([...todos,{task:newTodos,id:uuidv4(),isDone:false}])
        setNewTodos("");
    }
    let updateEvent = (event)=>{
        setNewTodos(event.target.value);
    }
    let deleteTodo = (id)=>{
      let copy = todos.filter((tdo)=>tdo.id != id)
         setTodos(copy)
    }
    let upperCaseTask = (id) =>{
       setTodos((todos) => todos.map((tdo) => {
            if (tdo.id === id) {
               return {
                  ...tdo,
                     task: tdo.task.toUpperCase()
               };
            }
           else{
               return tdo;
           }
       }))
    };
    let doneTask = (id)=>{
        setTodos((todos) => todos.map((tdo) =>{
            if(tdo.id ===id){
                return{
                    ...tdo,
                      isDone:true
                }
            }
            else{
                return tdo;
            }
        }))
    }
    return(
        <>
       <h2>This is Todo-List Dashboard</h2>
       <input placeholder="Enter you task" value={newTodos} onChange={updateEvent} style={{width:"250px" , height:"35px"}}/> &nbsp;
       <button style={{backgroundColor:"white",color:"black"}} onClick={addTask}>Add</button>
       <br /><br /><br /><br />
       <hr />
       <h3>Task TODO</h3>
       <hr />
       <ul>
        {
            todos.map((todo)=>(
                <li key={todo.id}>
                    <span style={todo.isDone ? {textDecoration: 'line-through',color:'green'}:{}}>
                    {todo.task}
                    </span>
                    &nbsp; <button onClick={() => deleteTodo(todo.id)}>Delete</button> &nbsp; <button onClick={() => upperCaseTask(todo.id)}>UpprCase</button>
                &nbsp; <button onClick={() => doneTask(todo.id)}>Done</button><br /> <br /></li>
            ))
        }
       </ul>
        </>
    )
}