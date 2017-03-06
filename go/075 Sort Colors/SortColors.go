
/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
func sortColors(nums []int)  {
    zero_size, one_size := 0, 0
    for _, n := range nums {
        if n == 0 {
            nums[zero_size] = 0
            zero_size += 1
        } else if n == 1 {
            one_size += 1
        }
    }
    i, n := zero_size, len(nums)
    for i < n {
        if one_size > 0 {
            nums[i] = 1
            one_size -= 1
        } else {
            nums[i] = 2
        }
        i += 1
    }
}
