
// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
func merge(A []int, m int, B []int, n int)  {
    i, j, k := m - 1, n - 1, m + n - 1
    for i > -1 && j > -1 {
        if A[i] > B[j] {
            A[k] = A[i]
            i -= 1
        } else {
            A[k] = B[j]
            j -= 1
        }
        k -= 1
    }
    for j > -1 {
        A[k] = B[j]
        k -= 1
        j -= 1
    }
}
