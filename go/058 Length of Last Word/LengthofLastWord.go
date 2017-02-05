
/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * For example, Given s = "Hello World", return 5.
 */
func lengthOfLastWord(s string) int {
    n := len(s) - 1;
    if n == -1 {
        return 0;
    }
    c_space := " "[0]
    for n >= 0 && s[n] == c_space {
        n -= 1
    }
    size := n + 1
    for ; n >= 0; n-- {
        if s[n] == c_space {
            return size - n - 1
        }
    }
    return size
}
