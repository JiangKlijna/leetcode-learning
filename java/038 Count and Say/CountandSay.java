
/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 */
public class CountandSay {
    public String countAndSay(int n) {
        if (1 == n) {
            return "1";
        }
        String s = "1";
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < n - 1; k++) {
            int pre = s.charAt(0) - '0', i = 1;
            for (int j = 1, count = s.length(); j < count; j++) {
                int c = s.charAt(j) - '0';
                if (c == pre) {
                    i++;
                } else {
                    sb.append(i).append(pre);
                    i = 1;
                }
                pre = c;
            }
            s = sb.append(i).append(pre).toString();
            sb.delete(0, sb.length());
        }
        return s;
    }
}
