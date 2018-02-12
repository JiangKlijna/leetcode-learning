
//Write a function to find the longest common prefix string amongst an array of strings.
class LongestCommonPrefix {
	fun longestCommonPrefix(strs: Array<String>): String {
		val n = strs.size
		if (n == 0)
			return ""
		if (n == 1)
			return strs[0]
		val common = strs[0].toCharArray()
		var valid = common.size
		for (i in 1 until n) {
			val s = strs[i]
			var j = 0
			val s_count = if (s.length < valid) s.length else valid
			while (j < s_count) {
				if (common[j] != s[j])
					break
				j++
			}
			valid = j
		}
		return String(common, 0, valid)
	}
}
