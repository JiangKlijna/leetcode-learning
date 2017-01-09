
/**
  * Implement int sqrt(int x).
  * Compute and return the square root of x.
  */
func mySqrt(x int) int {
    if x < 2 {
        return x
    }
    l, r := 1, x/2
    for l <= r {
        mid := (l + r) >> 1
        midv := x / mid
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
