
/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * 给出一个int数组和目标值,从数组中找到两个值使得其和为目标值.返回两个下标位置.
 *
 */
class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var map: [Int: Int] = [:]
        for i in 0...nums.count {
            let idx: Optional<Int> = map[nums[i]]
            if idx == nil {
                map[target - nums[i]] = i
            } else {
                if idx! < i {
                    return [idx!, i]
                }
            }
        }
        return [0, 0]
    }
}
