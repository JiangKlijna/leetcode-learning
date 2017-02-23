
/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 */
class Solution {
    func removeDuplicates(_ nums: inout [Int]) -> Int {
        if nums.count == 0 {
            return 0
        }
        var val = nums[0], size = 1
        for var i in nums {
            if i != val {
                nums[size] = val = i
                size += 1
            }
        }
        return size
    }
}
