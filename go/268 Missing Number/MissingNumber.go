
/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * For example, Given nums = [0, 1, 3] return 2.
 */
func missingNumber(nums []int) int {
    miss := 0
    for i := 0; i < len(nums); i++ {
        miss ^= (i + 1) ^ nums[i]
    }
    return miss
}
