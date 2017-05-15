
/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(A, m, B, n) {
    let i = m - 1, j = n - 1; k = n + m - 1;
    while (i > -1 && j > -1) A[k--] = A[i] > B[j] ? A[i--] : B[j--];
    while (j > -1) A[k--] = B[j--];
};
