
/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 */
func countAndSay(n int) string {
    if 1 == n {
        return "1"
    }
    s, sb := []byte{1}, make([]byte, 0)
    for k := 1; k < n; k++ {
        pre, i := s[0], byte(1)
        for j, count := 1, len(s); j < count; j++ {
            c := s[j]
            if (c == pre) {
                i++
            } else {
                sb = append(sb, i)
                sb = append(sb, pre)
                i = 1
            }
            pre = c
        }
        sb = append(sb, i)
        sb = append(sb, pre)
        s = sb
        sb = make([]byte, 0)
        //sb = sb[:0]
    }
    for i, count := 0, len(s); i < count; i++ {
        s[i] += 48
    }
    return string(s)
}
