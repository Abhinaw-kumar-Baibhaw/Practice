//change the color of heading 

let heading = document.querySelector('h1');

heading.style.color='purple';

let heading1 = document.querySelector('h2');

heading1.style.color='red';

heading1.style.backgroundColor="yellow";

//adding a button inside a div

let box = document.querySelector(".box");

let button = document.createElement("button");

box.append(button);

button.innerText = "click me";
