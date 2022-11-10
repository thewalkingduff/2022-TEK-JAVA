var prompt = require('prompt-sync')();
//
// get input from the user.
//
const length = prompt("Enter length:");


function printUpperTriangle(length) {
    let index = length;
    for (let i = 0; i < length; i++) {
        for (let j = 0; j < index; j++) {
            process.stdout.write("*");
        }  
        index--
        console.log("");
    } 
}

console.log();
console.log("UpperTriangle:");
printUpperTriangle( length);