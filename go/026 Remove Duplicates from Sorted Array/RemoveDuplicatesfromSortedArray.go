
/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 */
func removeDuplicates(nums []int) int {
    if len(nums) == 0 {
        return 0
    }
    val, size := nums[0], 1
    for _, i := range nums {
        if i != val {
            val = i
            nums[size] = i
            size += 1
        }
    }
    return size
}
