
/**
  * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
  * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
  */
class Solution {
    func isValid(_ s: String) -> Bool {
        var stack:[Int] = []
        let t1 = Int(("}" as UnicodeScalar).value), t2 = Int((")" as UnicodeScalar).value), t3 = Int(("]" as UnicodeScalar).value)
        for cs in s.unicodeScalars {
            let c = Int(cs.value)
            if c == t1 || c == t2 || c == t3 {
                let length:Int = stack.count
                if length == 0 {
                    return false
                }
                let v = c - stack[length - 1]
                if v > 2 || v < 0 {
                    return false
                } else {
                    stack.remove(at:length - 1)
                }
            } else {
                stack.append(c)
            }
        }
        return stack.count == 0
    }
}
