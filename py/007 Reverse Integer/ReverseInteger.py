
import sys

#本题题意：给出一个int，反轉整形數
class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        maxint = 2147483647
        y = abs(x)
        re = 0
        while y > 0:
            if re != 0 and maxint / re < 10:
                return 0
            re *= 10
            re += int(y % 10)
            y = int(y / 10)
        if x < 0:
            re = -re
        return re
