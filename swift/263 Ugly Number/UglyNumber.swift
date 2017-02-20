
/**
 * Write a program to check whether a given number is an ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
 * Note that 1 is typically treated as an ugly number.
 */
class Solution {
    func isUgly(_ num: Int) -> Bool {
        if num <= 0 {
            return false
        }
        var re = num
        while (re % 5) == 0 {
            re /= 5
        }
        while (re % 3) == 0 {
            re /= 3
        }
        while (re % 2) == 0 {
            re /= 2
        }
        return re == 1
    }
}
