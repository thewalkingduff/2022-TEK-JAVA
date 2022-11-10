var prompt = require('prompt-sync')();
//
// get input from the user.
//
const height = prompt("Enter height of cross:");


function printCross(height) {
    for (let i = 0; i <= height; i++) {
        for (let j = 0; j <= height; j++) {
            if(i === j || j === height){
                process.stdout.write("*");
                // console.log("*");
            } else {
                process.stdout.write(" "); 
                // console.log(" ");
            }        
        }  
        console.log("");
    } 
}

console.log();
console.log("Cross:");
printCross(height);