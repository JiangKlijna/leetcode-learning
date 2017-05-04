
// Given an array of integers, every element appears twice except for one. Find that single one.
public class Solution {
    public int singleNumber(int[] nums) {
        int re = 0;
        for (int n : nums)
            re ^= n;
        return re;
    }
}
