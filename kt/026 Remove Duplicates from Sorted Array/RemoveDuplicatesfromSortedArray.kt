
/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 */
 class RemoveDuplicatesfromSortedArray {
 	fun removeDuplicates(nums: IntArray): Int {
 		if (nums.size == 0)
 			return 0
 		var value = nums[0]
 		var size = 1
 		for (i in nums)
 			if (i != value) {
 				value = i
 				nums[size++] = value
 			}
 		return size
 	}
 }
k
