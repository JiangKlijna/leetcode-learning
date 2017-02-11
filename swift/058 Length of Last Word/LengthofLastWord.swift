
/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * For example, Given s = "Hello World", return 5.
 */
class Solution {
    func lengthOfLastWord(_ s: String) -> Int {
        var str:[Int] = []
        for i in s.utf8 {
            str.append(Int(i))
        }
        var n = s.characters.count - 1
        if n == -1 {
            return 0;
        }
        let c_space = Int((" " as UnicodeScalar).value)
        while n >= 0 && str[n] == c_space {
            n -= 1
        }
        let size = n + 1
        while n >= 0 {
            if str[n] == c_space {
                return size - n - 1
            }
            n -= 1
        }
        return size
    }
}
