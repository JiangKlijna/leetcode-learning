
# Implement atoi to convert a string to an integer.
class Solution(object):
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        i, n = 0, len(str)
        if n == 0:
            return 0
        c_space, c_0, c_9 = ord(' '), ord('0'), ord('9')
        while i < n and ord(str[i]) == c_space:
            i += 1
        first, signal, re = str[i], 1, 0
        if first == '+':
            i += 1
        elif first == '-':
            i += 1
            signal = -1
        while i < n:
            c = ord(str[i])
            if c >= c_0 and c <= c_9:
                re = re * 10 + signal * (c - c_0)
            else:
                break
            if re > 0x7fffffff:
                return 0x7fffffff
            elif re < -0x80000000:
                return -0x80000000
            i += 1
        return re
