
# Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
class Solution(object):
    def merge(self, A, m, B, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        i, j, k = m - 1, n - 1, m + n - 1
        while i > -1 and j > -1:
            if A[i] > B[j]:
                A[k] = A[i]
                i -= 1
            else:
                A[k] = B[j]
                j -= 1
            k -= 1
        while j > -1:
            A[k] = B[j]
            k -= 1
            j -= 1
