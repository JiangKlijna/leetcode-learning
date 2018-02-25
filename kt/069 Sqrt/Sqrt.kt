
/**
  * Implement int sqrt(int x).
  * Compute and return the square root of x.
  */
  class Sqrt {
  	fun mySqrt(x: Int): Int {
  		if (x < 2)
  			return x
  		var l = 1
  		var r = x / 2
  		while (l <= r) {
  			val mid = l + r shr 1
  			val midv = x / mid
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
