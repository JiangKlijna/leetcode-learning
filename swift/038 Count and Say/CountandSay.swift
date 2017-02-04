
/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 */
class Solution {
    func countAndSay(_ n: Int) -> String {
        if 1 == n {
            return "1"
        }
        var s: [Int] = [1], sb: [Int] = []
        for _ in 1..<n {
            var pre = s[0], i = 1
            for j in 1..<s.count {
                var c = s[j]
                if (c == pre) {
                    i += 1
                } else {
                    sb.append(i)
                    sb.append(pre)
                    i = 1
                }
                pre = c
            }
            sb.append(i)
            sb.append(pre)
            s = sb
            sb = []
        }
        var cs: [Character] = []
        for i in 0..<s.count {
            cs.append(Character(UnicodeScalar(s[i] + 48)!))
        }
        return String(cs)
    }
}
