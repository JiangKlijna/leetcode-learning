
/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 */
 class CountandSay {
 	fun countAndSay(n: Int): String {
 		if (1 == n) {
 			return "1"
 		}
 		var s = "1"
 		val sb = StringBuilder()
 		for (k in 0 until n - 1) {
 			var pre = s[0] - '0'
 			var i = 1
 			var j = 1
 			val count = s.length
 			while (j < count) {
 				val c = s[j] - '0'
 				if (c == pre) {
 					i++
 				} else {
 					sb.append(i).append(pre)
 					i = 1
 				}
 				pre = c
 				j++
 			}
 			s = sb.append(i).append(pre).toString()
 			sb.delete(0, sb.length)
 		}
 		return s
 	}
 }
