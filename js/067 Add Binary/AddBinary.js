
/**
  * eval("0b"+a+"+0b"+b).toString(2);
  * Given two binary strings, return their sum (also a binary string).
  */
/**
* @param {string} a
* @param {string} b
* @return {string}
*/
var addBinary = function(a, b) {
    let al = a.length, bl = b.length, pre = 0, sb = [], zero = 48;
    for (let j = 0; j < al || j < bl; j++) {
        let ai = al - j - 1, bi = bl - j - 1;
        let re = ((j >= bl) ? a.charCodeAt(ai) : (j >= al) ? b.charCodeAt(bi) : (a.charCodeAt(ai) + b.charCodeAt(bi) - zero)) - zero + pre;
        if (re == 2) {
            pre = 1;
            re = 0;
        } else if (re == 3) {
            pre = 1;
            re = 1;
        } else {
            pre = 0;
        }
        sb.push(re);
    }
    if (pre == 1)
        sb.push(pre);
    return sb.reverse().join('');
};
