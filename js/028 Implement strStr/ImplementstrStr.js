
//Implement strStr(). Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    const n = haystack.length, m = needle.length;
    if (m > n) return -1;
    if (m == 0) return 0;
    for (let i = 0; i <= n - m; i++) {
        let tag = true;
        for (let a = 0, b = i; a < m; ) {
            if (haystack[b++] != needle[a++]) {
                tag = false;
                break;
            }
        }
        if (tag) return i;
    }
    return -1;
};
