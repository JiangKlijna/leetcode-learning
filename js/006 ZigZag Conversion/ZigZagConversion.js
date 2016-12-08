
/**
 * 本题题意：给出一个字符串，该字符串会通过Z字形排列，然后给出Z字形排列的顺序读取结果。
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
  if (numRows == 1) {
    return s;
  }
  let x = 2 * numRows - 2;
  let sbs = [];
  for (let i = 0; i < numRows; i++) {
    sbs[i] = '';
  }

  let isFront = true;
  for (let i = 0, j = 0; i < s.length; i++) {
    if ((i % x) == 0) {
      isFront = true;
    } else if ((i % x) == numRows - 1) {
      isFront = false;
    }
    print(j, i, x, (i % x))
    sbs[isFront ? j++ : j--] += s[i];
  }
  return sbs.join('');
};
