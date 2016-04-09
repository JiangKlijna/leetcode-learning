// Source : https://leetcode.com/problems/add-digits/
// Author : jiangKlijna
/**
*Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
*For example:
*Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
*Follow up:
*Could you do it without any loop/recursion in O(1) runtime?
*/

public class AddDigits {
    public static void main(String[] args){
	System.err.println(addDigits(38));
    }

    public static int addDigits(int num) {
	if (num < 10) {
	    return num;
	}
	int sum = 0;
	for (int i : ("" + num).toCharArray()) {
	    sum += (i - '0');
	}
	return addDigits(sum);
    }
}
