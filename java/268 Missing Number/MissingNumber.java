
/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * For example, Given nums = [0, 1, 3] return 2.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0, n = nums.length;
        for (int i : nums)
            sum += i;
        return (n * (n + 1)) / 2 - sum;
    }
}
