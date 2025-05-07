function Perform(){
    return(
        console.log("Clicked")
    )
}

export function Button(){
    return(
        <>
        <button onClick={Perform}>Click</button> 
       </>
    )
}