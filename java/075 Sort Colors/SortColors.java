
/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int zero_size = 0, one_size = 0;
        for (int n : nums)
            if (n == 0)
                nums[zero_size++] = 0;
            else if (n == 1)
                one_size++;
        for (int i = zero_size; i < nums.length; i++)
            nums[i] = (one_size-- > 0) ? 1 : 2;
    }
}
