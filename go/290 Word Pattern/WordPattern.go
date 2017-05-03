
/*
 * Given a pattern and a string str, find if str follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 */
import "strings"
func wordPattern(pattern string, str string) bool {
    data := strings.Split(str, " ")
    if len(pattern) != len(data) {return false}
    MAP := make(map[byte] string)
    for i, n := 0, len(pattern); i < n; i++ {
        key := pattern[i]
        s, ok := MAP[key]
        if !ok {
            data_i := data[i]
            for _, v := range MAP {
                if v == data_i { return false }
            }
            MAP[key] = data_i
        } else if s != data[i] {
            return false
        }
    }
    return true
}
