
/*
* 本题题意：给出一个int，反轉整形數
*/
public class ReverseInteger{
  public int reverse(int x) {
		int y = (x < 0) ? -x : x;
		int re = 0;
		while (y > 0) {
			if (re != 0 && Integer.MAX_VALUE / re < 10)
	               return 0;
			re *= 10;
			re += y % 10;
			y /= 10;
		}
		return (x < 0) ? -re : re;
	}
}
