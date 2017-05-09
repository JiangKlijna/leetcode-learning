
// Given an array of integers, every element appears twice except for one. Find that single one.
class Solution {
    func singleNumber(_ nums: [Int]) -> Int {
        var re = 0
        for var n in nums {
            re ^= n
        }
        return re
    }
}
