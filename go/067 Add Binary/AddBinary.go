
/**
  * eval("0b"+a+"+0b"+b).toString(2);
  * Given two binary strings, return their sum (also a binary string).
  */
import "bytes"
func addBinary(a string, b string) string {
    al, bl, pre, sb, zero := len(a), len(b), byte(0), bytes.Buffer{}, "0"[0]
    for j := 0; j < al || j < bl; j++ {
        var re byte
        ai, bi := al - j - 1, bl - j - 1;
        if j >= bl {
            re = a[ai] - zero + pre
        } else if j >= al {
            re = b[bi] - zero + pre
        } else {
            re = a[ai] + b[bi] - zero - zero + pre
        }
        if re == 2 {
            pre, re = 1, 0
        } else if re == 3 {
            pre, re = 1, 1
        } else {
            pre = 0
        }
        sb.WriteByte(re + zero)
    }
    if pre == 1 {
        sb.WriteByte(pre + zero)
    }
    var src []byte = sb.Bytes()
    l := len(src)
    for i, n := 0, l / 2; i < n; i++ {
        src[i], src[l - 1 - i] = src[l - 1 - i], src[i]
    }
    return string(src)
}
