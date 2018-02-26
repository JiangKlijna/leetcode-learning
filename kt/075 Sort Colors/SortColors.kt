
/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
 class SortColors {
 	fun sortColors(nums: IntArray) {
 		var zero_size = 0
 		var one_size = 0
 		for (n in nums)
 			if (n == 0)
 				nums[zero_size++] = 0
 			else if (n == 1)
 				one_size++
 		for (i in zero_size until nums.size)
 			nums[i] = if (one_size-- > 0) 1 else 2
 	}
 }
