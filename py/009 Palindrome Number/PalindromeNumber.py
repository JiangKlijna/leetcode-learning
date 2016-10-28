
# 本题题意：判斷回文數字

class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        s = str(x)
        length = len(s)
        for i in range(int(length / 2)):
            if s[i] != s[length - 1 - i]:
                return False
        return True
