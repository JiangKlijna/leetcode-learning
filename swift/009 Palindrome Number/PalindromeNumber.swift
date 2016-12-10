

// 本题题意：判斷回文數字

class Solution {
    func isPalindrome(_ x: Int) -> Bool {
        let str:String = String(x)
        let length:Int = str.characters.count
        //let n:Int = length / 2
        for i in 0...(length / 2) {
          if str[str.index(str.startIndex, offsetBy: i)] != str[str.index(str.startIndex, offsetBy: (length - 1 - i))] {
            return false
          }
        }
        return true
    }
}
