
/*
* 本题题意：判斷回文數字
*/
class PalindromeNumber {
	fun isPalindrome(x: Int): Boolean {
		val str = x.toString() + ""
		val length = str.length
		var i = 0
		val n = length / 2
		while (i < n) {
			if (str[i] != str[length - 1 - i]) {
				return false
			}
			i++
		}
		return true
	}
}
