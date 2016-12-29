
// Implement atoi to convert a string to an integer.
class Solution {
    func myAtoi(_ str: String) -> Int {
        let n = str.characters.count
        if n == 0 {
            return 0
        }
        var istr: [Int] = []
        for i in str.utf8 {
            istr.append(Int(i))
        }
        let c_add = 43, c_minus = 45, c_space = 32, c_0 = 48, c_9 = 57
        var i = 0, signal = 1, re = 0
        while i < n && istr[i] == c_space {
            i += 1
        }
        if istr[i] == c_add {
            i += 1
        } else if istr[i] == c_minus {
            i += 1
            signal = -1
        }
        while i < n {
            let c = istr[i]
            if c >= c_0 && c <= c_9 {
                re = re * 10 + signal * (c - c_0)
            } else {
                break
            }
            if re > 0x7fffffff {
                return 0x7fffffff
            } else if re < -0x80000000 {
                return -0x80000000
            }
            i += 1
        }
        return re
    }
}
