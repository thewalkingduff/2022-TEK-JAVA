const nums = [2,3,6,6,5, 8];

function getSecondLargest(nums) {
    let maxNum = 0;
    let arrayMinusMax = []
    for(let i = 0; i < nums.length; i++) {
        if(nums[i] > maxNum) {
            maxNum = nums[i]
        }
    }
    for(let i = 0; i < nums.length; i++) {
        if(nums[i] !== maxNum) {
            arrayMinusMax.push(nums[i])
        }
    }
    return Math.max(...arrayMinusMax)
}

console.log(getSecondLargest(nums));