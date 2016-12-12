
/**
* Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
* The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/
/**
* @param {string} s
* @return {boolean}
*/
var isValid = function(s) {
    let stack = [];
    for (var i = 0; i < s.length; i++) {
        let c = s[i];
        if (c == ']' || c == ')' || c == '}') {// ])}
            if (stack.length == 0) {
                return false;
            }
            let v = c.charCodeAt(0) - stack[stack.length - 1];
            if (v > 2 || v < 0) {
                return false;
            } else {
                stack.pop();
            }
        } else {
            stack.push(c.charCodeAt(0));
        }
    }
    return stack.length == 0;
};
