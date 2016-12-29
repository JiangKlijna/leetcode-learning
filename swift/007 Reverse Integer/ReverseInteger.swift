
// 本题题意：给出一个int，反轉整形數
class Solution {
    func reverse(_ x: Int) -> Int {
        var re = 0, maxint = 2147483647, y = x < 0 ? -x : x
        while y > 0 {
            if re != 0 && maxint / re < 10{
                return 0
            }
            re *= 10
            re += y%10
            y /= 10
        }
        return x < 0 ? -re : re
    }
}
