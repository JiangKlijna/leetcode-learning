
/**
 * Implement atoi to convert a string to an integer.
 */
public class StringtoInteger {
    public int myAtoi(String str) {
        int i = 0, n = str.length();
        if (n == 0) {
            return 0;
        }
        while (i < n && str.charAt(i) == ' ')
            i++;
        char first = str.charAt(i);
        long re = 0;
        byte signal = 1;
        if (first == '+') {
            i++;
        } else if (first == '-') {
            i++;
            signal = -1;
        }
        for (; i < n; i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                re = re * 10 + signal * (c - '0');
            } else {
                break;
            }
            if (re > 0x7fffffff) {
                return 0x7fffffff;
            } else if (re < 0x80000000) {
                return 0x80000000;
            }
        }
        return (int) re;
    }
}
