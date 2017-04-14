
//Implement strStr(). Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        if (m > n) return -1;
        if (m == 0) return 0;
        for (int i = 0; i <= n - m; i++) {
            boolean tag = true;
            for (int a = 0, b = i; a < m; ) {
                if (haystack.charAt(b++) != needle.charAt(a++)) {
                    tag = false;
                    break;
                }
            }
            if (tag) return i;
        }
        return -1;
    }
}
