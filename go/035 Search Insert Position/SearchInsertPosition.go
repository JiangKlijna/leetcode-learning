
// Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
func searchInsert(nums []int, target int) int {
    left, right := 0, len(nums) - 1
    for left <= right {
        mid := (left + right) >> 1
        if nums[mid] == target {
            return mid
        } else if nums[mid] < target {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    return left
}
