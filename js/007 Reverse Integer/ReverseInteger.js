

 /**
  * 本题题意：给出一个int，反轉整形數
  * @param {number} x
  * @return {number}
  */

var reverse = function(x) {
  let y = x < 0 ? -x : x, re = 0, maxint = 2147483647;
  while (y > 0) {
    if (re !== 0 && maxint / re < 10) {
      return 0;
    }
    re *= 10;
    re += parseInt(y % 10);
    y = parseInt(y / 10);
  }
  return x < 0 ? -re : re;
};
