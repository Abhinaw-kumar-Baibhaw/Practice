import { useState } from "react"


export default function LikeButton(){
    let [isLiked,setIsLiked] = useState(false);
    let clickButton =()=>{
     setIsLiked(!isLiked);  
    }
    return(
        <>
          <p onClick={clickButton}>
            {isLiked ?(<i className="fa-solid fa-heart"></i>):
           (<i className="fa-regular fa-heart"></i>)}
            </p>
        </>
    )
}