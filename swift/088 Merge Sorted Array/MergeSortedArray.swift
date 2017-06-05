
/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */
class Solution {
    func merge(_ nums1: inout [Int], _ m: Int, _ nums2: [Int], _ n: Int) {
        var i = m - 1, j = n - 1, k = n + m - 1
        while i > -1 && j > -1 {
            if A[i] > B[j] {
                A[k] = A[i]
                i -= 1
            } else {
                A[k] = B[j]
                j -= 1
            }
            k -= 1
        }
        while j > -1 {
            A[k] = B[j]
            j -= 1
            k -= 1
        }
    }
}
