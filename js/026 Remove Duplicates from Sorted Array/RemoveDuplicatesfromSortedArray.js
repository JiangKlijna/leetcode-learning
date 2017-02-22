
/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 */
 /**
  * @param {number[]} nums
  * @return {number}
  */
var removeDuplicates = function(nums) {
    if (nums.length == 0)
        return 0;
    let val = nums[0], size = 1;
    for (let i of nums)
        if (i != val)
            nums[size++] = val = i;
    return size;
};
