
// Implement strStr(). Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
class Solution {
    func strStr(_ haystack: String, _ needle: String) -> Int {
        var n = haystack.characters.count, m = needle.characters.count
        if m > n {return -1} else if m == 0 {return 0}
        var astr:[UInt8] = []
        for i in haystack.utf8 {astr.append(i)}

        for i in 0...n-m {
            var tag = true, b = i
            for s in needle.utf8 {
                if s != astr[b] {
                    tag = false
                    break
                }
                b += 1
            }
            if tag {return i}
        }
        return -1
    }
}
