
# Implement int sqrt(int x).
# Compute and return the square root of x.
class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x < 2 :
            return x
        l, r = 1, x - 1
        while l <= r :
            mid = (l + r) >> 1
            midv = x / mid
            if midv > mid :
                l = mid + 1
            elif midv < mid :
                r = mid - 1
            else :
                return mid
        return r
