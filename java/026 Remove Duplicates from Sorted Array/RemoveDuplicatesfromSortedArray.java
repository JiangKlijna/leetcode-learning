
/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int val = nums[0], size = 1;
        for (int i : nums)
            if (i != val)
                nums[size++] = val = i;
        return size;
    }
}
