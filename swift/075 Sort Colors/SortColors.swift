
/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
class Solution {
    func sortColors(_ nums: inout [Int]) {
        var zero_size = 0, one_size = 0
        for var n in nums {
            if n == 0 {
                nums[zero_size] = 0
                zero_size += 1
            } else if n == 1 {
                one_size += 1
            }
        }
        for var i in zero_size..<nums.count {
            if one_size > 0 {
                nums[i] = 1
                one_size -= 1
            } else {
                nums[i] = 2
            }
        }
    }
}
