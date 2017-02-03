
# The count-and-say sequence is the sequence of integers beginning as follows:
# 1, 11, 21, 1211, 111221, ...
class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        if 1 == n :
            return '1'
        s, sb, k = [1], [], 1
        while k < n:
            pre, i, j, s_count = s[0], 1, 1, len(s)
            while j < s_count:
                c = s[j]
                if c == pre:
                    i += 1
                else :
                    sb.append(i)
                    sb.append(pre)
                    i = 1
                pre = c
                j += 1
            sb.append(i)
            sb.append(pre)
            s = sb
            sb = []
            k += 1
        return ''.join([chr(x+48) for x in s])
