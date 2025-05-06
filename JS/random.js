let btn = document.querySelector("button");
let h3 = document.querySelector('h3');
let div = document.querySelector("div");

btn.addEventListener("click", function(){
    h3.innerText = getColor();
    div.style.backgroundColor = getColor();
});

function getColor(){
    let r = Math.floor(Math.random() * 255);
    let g = Math.floor(Math.random() * 255);
    let b = Math.floor(Math.random() * 255);
    let res = `rgb(${r},${g},${b})`;
    return res;
}