
# Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
# For example: Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
class Solution(object):
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        sum = 0
        while num >= 10 :
            sum += int(num % 10)
            num = int(num / 10)
            if num < 10 :
                num += sum
                if num < 10 :
                    return num
                sum = 0
        return num
