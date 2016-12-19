
# eval("0b"+a+"+0b"+b).toString(2);
# Given two binary strings, return their sum (also a binary string).
class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        al, bl, pre, sb, zero = len(a), len(b), 0, [], ord('0')
        for j in range(al if al > bl else bl):
            ai, bi = al - j - 1, bl - j - 1;
            if j >= bl:
                re = ord(a[ai]) - zero + pre
            elif j >= al:
                re = ord(b[bi]) - zero + pre
            else:
                re = ord(a[ai]) + ord(b[bi]) - zero - zero + pre
            if re == 2:
                pre, re = 1, 0
            elif re == 3:
                pre, re = 1, 1
            else:
                pre = 0
            sb.insert(0, str(re))
        if pre == 1:
            sb.insert(0, str(pre))
        return ''.join(sb)
