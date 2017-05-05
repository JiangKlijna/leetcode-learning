
// Given an array of integers, every element appears twice except for one. Find that single one.
/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let re = 0;
    for (let n of nums)
        re ^= n;
    return re;
};
