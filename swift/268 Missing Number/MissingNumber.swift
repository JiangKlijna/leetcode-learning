
/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * For example, Given nums = [0, 1, 3] return 2.
 */
class Solution {
    func missingNumber(_ nums: [Int]) -> Int {
        var miss = 0, i = 0
        for var num in nums {
            i += 1
            miss += i - num
        }
        return miss
    }
}
