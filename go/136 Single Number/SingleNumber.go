
// Given an array of integers, every element appears twice except for one. Find that single one.
func singleNumber(nums []int) int {
    re := 0
    for _, n := range nums {
        re ^= n
    }
    return re
};
