
/**
 * 本题题意：判斷回文數字
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
  for (let i = 0, str = x + "", n = parseInt(str.length / 2); i < n; i++) {
    if (str[i] != str[str.length - 1 - i]) {
      return false;
    }
  }
  return true;
};
