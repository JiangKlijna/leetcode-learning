
/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
func removeElement(nums []int, val int) int {
    non_val_size := 0
    for _, i := range nums {
        if i != val {
            nums[non_val_size] = i
            non_val_size += 1
        }
    }
    return non_val_size
}
