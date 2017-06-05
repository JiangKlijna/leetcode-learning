
/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 */
class Solution {
    func moveZeroes(_ nums: inout [Int]) {
        var zero_time = 0, non_zero_size = 0
        for var i in nums {
            if i == 0 {
                zero_time += 1
            } else {
                nums[non_zero_size] = i
                non_zero_size += 1
            }
        }
        while zero_time > 0 {
            nums[nums.count - zero_time] = 0
            zero_time -= 1
        }
    }
}
