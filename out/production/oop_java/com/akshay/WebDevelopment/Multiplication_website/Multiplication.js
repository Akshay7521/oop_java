const num1 = Marh.ceil(Math.random()*100);
const num2 = Marh.ceil(Math.random()*100);

const questionElement1 = document.getElementById('question');
questionElement1.innerText = "What is ${num1} multiply by ${num2}?";

let score = 0;
const formE1 = document.getElementById("form");
const inputE1 = document.getElementById("input");

const correctAns = num1 * num2;

formE1.addEventListener("submit", ()=>{
    const userAns = inputE1.value
    if(userAns == correctAns){
        score++
    } else{
        score--
    }

});

function updateLocalStorage(){
    localStorage.setItem("score", JSON.stringify(score))
};