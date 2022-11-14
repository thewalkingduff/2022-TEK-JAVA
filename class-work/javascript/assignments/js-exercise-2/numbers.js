var prompt = require('prompt-sync')();
//
// get input from the user.
//
const numbers = prompt("Enter numbers: ");


function addIntegers(numbers) {
    let arrayStrings = numbers.split(" ").filter(el => el !== "+");
    const arrOfNums = arrayStrings.map(str => {
        return Number(str);
    })
    return arrOfNums.reduce((prev, curr) => prev + curr);

}

console.log();
console.log("Sum: ");
console.log(addIntegers(numbers));