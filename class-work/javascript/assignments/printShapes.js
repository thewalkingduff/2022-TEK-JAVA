// const width = prompt("Enter width:");
// console.log("Input width: " + width);
// let height = prompt("Enter height: ");
// console.log("Input height: " + height);

var prompt = require('prompt-sync')();
//
// get input from the user.
//
const width = prompt("Enter width:");
let height = prompt("Enter height: ");

function printShape(width, height) {
    for (let i = 0; i < height; i++) {
        let lineOfStars = "";
        for (let j = 0; j < width; j++) {
            lineOfStars += "*";
        }  
        console.log(lineOfStars);  
    } 
}

console.log();
console.log("Shape:");
printShape(width, height);


