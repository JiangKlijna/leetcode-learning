
/**
 * Implement atoi to convert a string to an integer.
 * @param {string} str
 * @return {number}
 */
var myAtoi = function(str) {
    let i = 0, n = str.length;
    if (n == 0) {
        return 0;
    }
    const c_space = " ".charCodeAt(0), c_0 = "0".charCodeAt(0), c_9 = "9".charCodeAt(0)
    while (i < n && str.charCodeAt(i) == c_space)
        i++;

    let first = str[i], signal = 1, re = 0;
    if (first == '+') {
        i++;
    } else if (first == '-') {
        i++;
        signal = -1;
    }
    for (; i < n; i++) {
        let c = str.charCodeAt(i);
        if (c >= c_0 && c <= c_9) {
            re = re * 10 + signal * (c - c_0);
        } else {
            break;
        }
        if (re > 0x7fffffff) {
            return 0x7fffffff;
        } else if (re < -0x80000000) {
            return -0x80000000;
        }
    }
    return re;
};
