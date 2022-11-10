var prompt = require('prompt-sync')();
//
// get input from the user.
//
const length = prompt("Enter length:");


function printLowerTriangle(length) {
    for (let i = 0; i < length; i++) {
        for (let j = 0; j < i + 1; j++) {
            process.stdout.write("*");
        }  
        console.log("");
    } 
}

console.log();
console.log("LowerTriangle:");
printLowerTriangle( length);