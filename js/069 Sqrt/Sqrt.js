
/**
  * Implement int sqrt(int x).
  * Compute and return the square root of x.
  */
/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    if (x < 2) {
        return x;
    }
    let l = 1, r = x - 1;
    while (l <= r) {
        int mid = (l + r) >> 1, midv = parseInt(x / mid);
        if (midv > mid) {
            l = mid + 1;
        } else if (midv < mid) {
            r = mid - 1;
        } else {
            return mid;
        }
    }
    return r;
};
