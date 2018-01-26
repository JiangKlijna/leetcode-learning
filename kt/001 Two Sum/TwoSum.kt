
/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * 给出一个int数组和目标值,从数组中找到两个值使得其和为目标值.返回两个下标位置.
 *
 */
class TwoSum {

	fun twoSum(numbers: IntArray, target: Int): IntArray {
		val re = IntArray(2)
		val map = hashMapOf<Int, Int>()
		for (i in numbers.indices) {
			val idx = map[numbers[i]]

			if (idx == null) {// 如果map中不存在就保存数据
				map.put(target - numbers[i], i)
			} else {// 若存在 即找到了所需要的元素
				if (idx < i) {
					re[0] = idx
					re[1] = i
					return re
				}
			}
		}
		return re
	}

}
