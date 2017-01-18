
//Write a function to find the longest common prefix string amongst an array of strings.
class Solution {
    func longestCommonPrefix(_ strs: [String]) -> String {
        var n = strs.count
        if (n == 0) {return ""}
        if (n == 1) {return strs[0]}
        var common = strs[0], valid = common.count
        for i in 1..<n {
            var s = strs[i], j = 0
            var s_count = s.count
            while (j < s_count) {
                if (common[j] != s[j])
                    break
                j++
            }
            valid = j
        }
        return valid == common.length ? common : common[0:valid]
    }
}
