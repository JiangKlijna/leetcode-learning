
/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example: Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */
 /**
  * @param {number} num
  * @return {number}
  */
var addDigits = function(num) {
    let sum = 0;
    while (num >= 10) {
        sum += parseInt(num % 10);
        num = parseInt(num / 10);
        if (num < 10) {
            num += sum;
            if (num < 10) {
                return num;
            }
            sum = 0;
        }
    }
    return num;
};
