
// Implement strStr(). Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
func strStr(haystack string, needle string) int {
    n, m := len(haystack), len(needle)
    if m > n {return -1} else if m == 0 {return 0}
    for i := 0; i <= n - m; i++ {
        tag := true
        for a, b := 0, i; a < m;  {
            if haystack[b] != needle[a] {
                tag = false
                break
            }
            a += 1
            b += 1
        }
        if tag {return i}
    }
    return -1
}
