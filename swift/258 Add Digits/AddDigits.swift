
/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example: Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */
class Solution {
    func addDigits(_ num: Int) -> Int {
        var sum = 0, re = num
        while re >= 10 {
            sum += re % 10
            re /= 10
            if re < 10 {
                re += sum
                if re < 10 {
                    return re
                }
                sum = 0
            }
        }
        return re
    }
}
