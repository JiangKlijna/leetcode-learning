

# Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
# The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        for c in s:
            if c == ']' or c == ')' or c == '}':# ])}
                if len(stack) == 0:
                    return False
                v = ord(c) - stack[-1]
                if v > 2 or v < 0:
                    return false
                else:
                    stack.pop()
            else:
                stack.append(ord(c))
        return len(stack) == 0
