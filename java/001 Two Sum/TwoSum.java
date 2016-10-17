
import java.util.Map;
import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * 给出一个int数组和目标值,从数组中找到两个值使得其和为目标值.返回两个下标位置.
 *
 */
public class TwoSum{

  public int[] twoSum(int[] numbers, int target) {
		int[] re = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			Integer idx = map.get(numbers[i]);

			if (idx == null) {// 如果map中不存在就保存数据
				map.put(target - numbers[i], i);
			} else {// 若存在 即找到了所需要的元素
				if (idx < i) {
					re[0] = idx;
					re[1] = i;
					return re;
				}
			}
		}
		return re;
	}

}
