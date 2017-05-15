
/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */
public class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1, j = n - 1; k = n + m - 1;
        while (i > -1 && j > -1) A[k--] = A[i] > B[j] ? A[i--] : B[j--];
        while (j > -1) A[k--] = B[j--];
    }
}
