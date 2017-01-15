
//Write a function to find the longest common prefix string amongst an array of strings.
/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    const n = strs.length;
    if (n == 0)
        return "";
    if (n == 1)
        return strs[0];
    let common = strs[0], valid = common.length;
    for (let i = 1; i < n; i++) {
        let s = strs[i], j = 0, s_count = s.length() < valid ? s.length() : valid;
        while (j < s_count) {
            if (common[j] != s[j])
                break;
            j++;
        }
        valid = j;
    }
    return valid == common.length ? common : common.substr(0, valid);
};
