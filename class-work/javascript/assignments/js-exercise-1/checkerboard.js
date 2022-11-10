var prompt = require('prompt-sync')();
//
// get input from the user.
//
const width = prompt("Enter width:");
let height = prompt("Enter height: ");

function printCheckerboard(width, height) {
    for (let i = 0; i < height; i++) {
        let lineOfStars = "";
        for (let j = 0; j < width; j++) {
            if(j % 2 === 0) {
                lineOfStars += "*";
            } else {
                lineOfStars += " ";
            }
        }  
        if(i % 2 === 0) {
            console.log(lineOfStars + " ");
        }  else {
            console.log(" " + lineOfStars + " ");
        }
    } 
}

console.log();
console.log("Checkerboard:");
printCheckerboard(width, height);