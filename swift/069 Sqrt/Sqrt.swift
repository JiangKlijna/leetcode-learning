
/**
  * Implement int sqrt(int x).
  * Compute and return the square root of x.
  */
class Solution {
    func mySqrt(_ x: Int) -> Int {
        if x < 2 {
            return x
        }
        var l = 1, r = x/2
        while l <= r {
            var mid = (l + r) >> 1, midv = x / mid
            if (midv > mid) {
                l = mid + 1
            } else if (midv < mid) {
                r = mid - 1
            } else {
                return mid
            }
        }
        return r
    }
}
