
// Implement atoi to convert a string to an integer.
func myAtoi(str string) int {
    i, n := 0, len(str)
    if n == 0 {
        return 0
    }
    c_space, c_0, c_9 := " "[0], int("0"[0]), int("9"[0])
    for i < n && str[i] == c_space {
        i += 1
    }
    first, signal, re := str[i], 1, 0
    if first == '+' {
        i += 1
    } else if first == '-' {
        i += 1
        signal = -1
    }
    for i < n {
        c := int(str[i])
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
