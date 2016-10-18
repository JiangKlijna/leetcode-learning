
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution.
// 给出一个int数组和目标值,从数组中找到两个值使得其和为目标值.返回两个下标位置.

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
  map = {};
  for (let i = 0;i<nums.length;i++) {
    let v = nums[i];
    let data = map[v];
    if (data != null) {
      if (data < i) {
        return [data, i];
      }
    } else {
      map[target-v] = i;
    }
  }

};
