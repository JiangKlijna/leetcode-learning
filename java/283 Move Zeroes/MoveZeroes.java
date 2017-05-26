
/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zero_time = 0, non_zero_size = 0;
        for (int i : nums) {
            if (i == 0)
                zero_time++;
            else
                nums[non_zero_size++] = i;
        }
        while (zero_time > 0)
            nums[nums.length - zero_time--] = 0;
    }
}
