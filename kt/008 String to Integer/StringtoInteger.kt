
/**
 * Implement atoi to convert a string to an integer.
 */
class StringtoInteger {
	fun myAtoi(str: String): Int {
		var i = 0
		val n = str.length
		if (n == 0) {
			return 0
		}
		while (i < n && str[i] == ' ')
			i++
		val first = str[i]
		var re: Long = 0
		var signal: Byte = 1
		if (first == '+') {
			i++
		} else if (first == '-') {
			i++
			signal = -1
		}
		while (i < n) {
			val c = str[i]
			if (c >= '0' && c <= '9') {
				re = re * 10 + signal * (c - '0')
			} else {
				break
			}
			if (re > 0x7fffffff) {
				return 0x7fffffff
			} else if (re < -0x80000000) {
				return -0x80000000
			}
			i++
		}
		return re.toInt()
	}
}
