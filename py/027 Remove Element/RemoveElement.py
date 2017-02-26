
# Given an array and a value, remove all instances of that value in place and return the new length.
# Do not allocate extra space for another array, you must do this in place with constant memory.
# The order of elements can be changed. It doesn't matter what you leave beyond the new length.
class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        non_val_size = 0
        for i in nums :
            if i != val :
                nums[non_val_size] = i
                non_val_size += 1
        return non_val_size
