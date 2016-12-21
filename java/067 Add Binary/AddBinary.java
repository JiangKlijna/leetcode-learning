
/**
  * eval("0b"+a+"+0b"+b).toString(2);
  * Given two binary strings, return their sum (also a binary string).
  */

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int al = a.length(), bl = b.length();
        byte pre = 0;
        for (int j = 0; j < al || j < bl; j++) {
            int ai = al - j - 1, bi = bl - j - 1;
            int re = ((j >= bl) ? a.charAt(ai) : (j >= al) ? b.charAt(bi) : (a.charAt(ai) + b.charAt(bi) - '0')) - '0' + pre;
            if (re == 2) {
                pre = 1;
                re = 0;
            } else if (re == 3) {
                pre = 1;
                re = 1;
            } else {
                pre = 0;
            }
            sb.insert(0, re + "");
        }
        if (pre == 1)
            sb.insert(0, pre + "");
        return sb.toString();
    }
}
