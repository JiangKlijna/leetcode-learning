
# Write a function to find the longest common prefix string amongst an array of strings.
class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        n = len(strs)
        if n == 0 :
            return ""
        if n == 1 :
            return strs[0]
        common = strs[0]
        valid = len(common)
        i = 1
        while i < n:
            s, j = strs[i], 0
            s_count = len(s)
            while j < valid and j < s_count :
                if common[j] != s[j] :
                    break
                j += 1
            valid = j
            i += 1
        if valid == len(common):
            return common
        else:
            return common[:valid]
