
/**
  * eval("0b"+a+"+0b"+b).toString(2);
  * Given two binary strings, return their sum (also a binary string).
  */
class Solution {
    func addBinary(_ a: String, _ b: String) -> String {
        var astr:[Int] = [], bstr:[Int] = []
        for i in a.utf8 {
            astr.append(Int(i))
        }
        for i in b.utf8 {
            bstr.append(Int(i))
        }
        let al = a.characters.count, bl = b.characters.count, zero = Int(("0" as UnicodeScalar).value)
        var pre = 0, sb:[Character] = [], re:Int, loopnum:Int
        if al>bl {
            loopnum = al
        }else{
            loopnum = bl
        }
        for j in 0..<loopnum {
            let ai = al - j - 1, bi =  bl - j - 1;
            if j >= bl {
                re = astr[ai] - zero + pre
            } else if j >= al {
                re = bstr[bi] - zero + pre
            } else {
                re = astr[ai] + bstr[bi] - zero - zero + pre
            }
            if re == 2 {
                pre = 1
                re = 0
            } else if re == 3 {
                pre = 1
                re = 1
            } else {
                pre = 0
            }
            sb.append(Character(UnicodeScalar(re + zero)!))
        }
        if pre == 1 {
            sb.append(Character(UnicodeScalar(pre + zero)!))
        }
        let l = sb.count
        var temp:Character
        for i in 0..<(l/2) {
            temp = sb[i]
            sb[i] = sb[l - 1 - i]
            sb[l - 1 - i] = temp
        }
        return String(sb)
    }
}
