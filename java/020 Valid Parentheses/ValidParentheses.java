
/**
  * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
  * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
  */

public class ValidParentheses {
    public boolean isValid(String s) {
        java.util.LinkedList<Character> stack = new java.util.LinkedList<Character>();
        for (int i = 0, n = s.length(); i < n; i++) {
            char c = s.charAt(i);
            if (c == ']' || c == ')' || c == '}') {// ])}
                if (stack.isEmpty()) {
                    return false;
                }
                int v = c - stack.getLast();
                if (v > 2 || v < 0) {
                    return false;
                } else {
                    stack.removeLast();
                }
            } else {
                stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
