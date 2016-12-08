
# 本题题意：给出一个字符串，该字符串会通过Z字形排列，然后给出Z字形排列的顺序读取结果。

class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows is 1:
            return s
        x = 2 * numRows - 2
        sbs = [[] for i in range(numRows)]
        isFront = True
        j = 0
        for i in range(0, len(s)):
            if int(i % x) == 0:
                isFront = True
            elif int(i % x) == numRows - 1:
                isFront = False;

            sbs[j].append(s[i])
            j += 1 if isFront else -1

        return "".join(["".join(e) for e in sbs])
