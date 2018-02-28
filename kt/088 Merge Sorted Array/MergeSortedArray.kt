
/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */
class Solution {
    fun merge(A: IntArray, m: Int, B: IntArray, n: Int): Unit {
        var i = m - 1
        var j = n - 1
        var k = n + m - 1
        while (i > -1 && j > -1) A[k--] = if(A[i] > B[j]) A[i--] else B[j--]
        while (j > -1) A[k--] = B[j--]
    }
}
