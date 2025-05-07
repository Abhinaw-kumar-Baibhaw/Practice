import "./Box.css";

function Box({title,price}){
    let div = {backgroundColor:"yellow"}
    let title1 = {color:"green"}
    let price1 = {color: "blue"}
    return(
        <>
           <div style={div} className="product">
            <h1 style={title1}>{title}</h1>
            <h3 style={price1}>Price : {price}</h3>
           </div>
        </>
    )
}

export default Box;