
//Write a function to find the longest common prefix string amongst an array of strings.
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0)
            return "";
        if (n == 1)
            return strs[0];
        char[] common = strs[0].toCharArray();
        int valid = common.length();
        for (int i = 1; i < n; i++) {
            String s = strs[i];
            int j = 0, s_count = s.length() < valid ? s.length() : valid;
            while (j < s_count) {
                if (common[j] != s.charAt(j))
                    break;
                j++;
            }
            valid = j;
        }
        return new String(common, 0, valid);
    }
}
