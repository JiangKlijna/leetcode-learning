
/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * For example, Given s = "Hello World", return 5.
 */
/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    let n = s.length - 1;
    if (n == -1)
        return 0;
    const c_space = ' '.charCodeAt(0);
    while (n >= 0 && s.charCodeAt(n) == c_space)
        n--;
    const size = n + 1;
    for (; n >= 0; n--)
        if (s.charCodeAt(n) == c_space)
            return size - n - 1;
    return size;
};
