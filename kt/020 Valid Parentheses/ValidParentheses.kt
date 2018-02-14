
/**
  * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
  * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
  */

  class ValidParentheses {
  	fun isValid(s: String): Boolean {
  		val stack = java.util.LinkedList<Char>()
  		var i = 0
  		val n = s.length
  		while (i < n) {
  			val c = s[i]
  			if (c == ']' || c == ')' || c == '}') {// ])}
  				if (stack.isEmpty()) {
  					return false
  				}
  				val v = c - stack.last
  				if (v > 2 || v < 0) {
  					return false
  				} else {
  					stack.removeLast()
  				}
  			} else {
  				stack.add(s[i])
  			}
  			i++
  		}
  		return stack.isEmpty()
  	}
  }
