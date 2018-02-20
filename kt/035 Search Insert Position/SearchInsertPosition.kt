
//Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            var mid = (left + right) / 2
            if (nums[mid] === target)
                return mid
            else if (nums[mid] < target)
                left = mid + 1
            else
                right = mid - 1
        }
        return left
    }
}
