
//Write a function to find the longest common prefix string amongst an array of strings.
func longestCommonPrefix(strs []string) string {
    n := len(strs)
    if n == 0 {
        return ""
    }
    if n == 1 {
        return strs[0]
    }
    common := strs[0]
    valid := len(common)
    for i := 1; i < n; i++ {
        s, j := strs[i], 0
        s_count := len(s)
        for j < valid && j < s_count {
            if common[j] != s[j] {
                break
            }
            j++
        }
        valid = j
    }
    if valid == len(common) {
        return common
    } else {
        return common[0:valid]
    }
}
