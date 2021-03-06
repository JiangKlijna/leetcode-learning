
/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 */
 class Solution {
 	fun plusOne(digits: IntArray): IntArray {
 		var i = digits.size - 1
 		while (i >= 0) {
 			if (digits[i] < 9) {
 				digits[i] += 1
 				return digits
 			}
 			digits[i] = 0
 			i--
 		}
 		val re = IntArray(digits.size + 1)
 		re[0] = 1
 		return re
 	}
 }
