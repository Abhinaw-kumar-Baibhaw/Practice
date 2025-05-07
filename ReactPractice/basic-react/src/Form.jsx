function handleFormSubmission(event){
    event.preventDefault();
   console.log("Form submitted")
}

function Form(){
    return(
        <form>
            <input placeholder="enter your name"/>
            <button onClick={handleFormSubmission}>Click</button>
        </form>
    )
}

export default Form;