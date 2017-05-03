
/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 */
class Solution {
    func plusOne(_ digits: [Int]) -> [Int] {
        var n = digits.count, i = n - 1, re = [] + digits
        while i >= 0 {
            re[i] = digits[i]
            if re[i] < 9 {
                re[i] += 1
                return re
            }
            re[i] = 0
            i -= 1
        }
        return [1] + re
    }
}
