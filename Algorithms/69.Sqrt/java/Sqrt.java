// Source : https://leetcode.com/problems/sqrtx/
// Author : jiangKlijna
/*
*Implement int sqrt(int x).
*Compute and return the square root of x.
*Subscribe to see which companies asked this question
*/
public class Sqrt{

	public static int sqrt(int num) {
		if (num == 2) {
			return 1;
		}
		for (int i = 1; i < num; i++) {
			long cheng = (long) i * i;
			if (num < cheng) {
				return (int) (i - 1);
			} else if (num == cheng) {
				return (int) i;
			}
		}
		return num;
	}

}