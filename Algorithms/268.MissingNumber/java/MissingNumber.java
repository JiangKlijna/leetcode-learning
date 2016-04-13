// Source : https://leetcode.com/problems/missing-number/
// Author : jiangKlijna
/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 * 
 * For example, Given nums = [0, 1, 3] return 2.
 * 
 * Note: Your algorithm should run in linear runtime complexity. Could you
 * implement it using only constant extra space complexity?
 */
public class MissingNumber {
	public static void main(String[] args) {
		System.out.println(missingNumber(new int[]{2,1}));
	}

	public static int missingNumber(int[] nums) {
		java.util.Arrays.sort(nums);
		int i = 0;
		for (; i < nums.length; i++) {
			if (i != nums[i]) {
				return i;
			}
		}
		return i;
	}
}
