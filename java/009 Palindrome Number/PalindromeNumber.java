
/*
* 本题题意：判斷回文數字
*/
public class PalindromeNumber{
  public boolean isPalindrome(int x) {
		String str = x + "";
		int length = str.length();
		for (int i = 0, n = length / 2; i < n; i++) {
			if (str.charAt(i) != str.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
