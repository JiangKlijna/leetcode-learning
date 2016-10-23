
/**
 * 本题题意：给出一个字符串，该字符串会通过Z字形排列，然后给出Z字形排列的顺序读取结果。
 */
public class ZigZagConversion{
  public String convert(String s, int numRows) {
    if (numRows == 1) {
			return s;
		}
		int x = 2 * numRows - 2;
		StringBuilder[] sbs = new StringBuilder[numRows];
		for (int i = 0; i < numRows; i++) {
			sbs[i] = new StringBuilder();
		}

		boolean isFront = true;
		for (int i = 0, j = 0; i < s.length(); i++) {
			if ((i % x) == 0) {
				isFront = true;
			} else if ((i % x) == numRows - 1) {
				isFront = false;
			}
			sbs[isFront ? j++ : j--].append(s.charAt(i));
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			sb.append(sbs[i]);
		}
		return sb.toString();
  }
}
