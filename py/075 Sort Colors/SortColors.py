
# Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
# Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        zero_size, one_size = 0, 0
        for n in nums :
            if n == 0 :
                nums[zero_size] = 0
                zero_size += 1
            elif n == 1 :
                one_size += 1
        i, n = zero_size, len(nums)
        while i < n:
            if one_size > 0:
                nums[i] = 1
                one_size -= 1
            else :
                nums[i] = 2
            i += 1
