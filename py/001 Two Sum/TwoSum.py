
# Given an array of integers, return indices of the two numbers such that they add up to a specific target.
# You may assume that each input would have exactly one solution.
# 给出一个int数组和目标值,从数组中找到两个值使得其和为目标值.返回两个下标位置.

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        map = {}
        for i,v in zip(range(len(nums)), nums):
            if v in map:
                if map[v]<i:
                    return [map[v], i]
            else:
                map[target-v] = i
