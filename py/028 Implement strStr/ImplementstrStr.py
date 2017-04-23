
#Implement strStr(). Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        n, m = len(haystack), len(needle)
        if m > n:
            return -1
        elif m == 0:
            return 0
        for i in range(n - m + 1):
            tag = True
            j = i
            for s in needle:
                if haystack[j] != s:
                    tag = False
                    break
                j += 1
            if tag:
                return i
        return -1
