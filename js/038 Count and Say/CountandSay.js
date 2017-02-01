
/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 */
 /**
  * @param {number} n
  * @return {string}
  */
var countAndSay = function(n) {
    if (1 == n) {
        return "1";
    }
    let s = [1], sb = [];
    for (let k = 0; k < n - 1; k++) {
        let pre = s[0], i = 1;
        for (let j = 1, count = s.length; j < count; j++) {
            let c = s[j];
            if (c == pre) {
                i++;
            } else {
                sb.push(i);
                sb.push(pre);
                i = 1;
            }
            pre = c;
        }
        sb.push(i);
        sb.push(pre);
        s = sb;
        sb = [];
        // sb.splice(0, sb.length);
    }
    return s.join('');
};
