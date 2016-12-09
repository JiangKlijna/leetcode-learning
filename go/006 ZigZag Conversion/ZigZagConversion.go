
// 本题题意：给出一个字符串，该字符串会通过Z字形排列，然后给出Z字形排列的顺序读取结果。
import "bytes"
func convert(s string, numRows int) string {
  if numRows == 1 {
    return s
  }
  var sbs []bytes.Buffer = make([]bytes.Buffer, numRows, numRows)
  x, j, isFront := 2 * numRows - 2, 0, true
  for i, n := 0, len(s); i < n; i++ {
    if (i % x) == 0 {
      isFront = true
    } else if (i % x) == numRows - 1 {
      isFront = false
    }
    sbs[j].WriteByte(s[i])
    if isFront {j += 1} else {j -= 1}
  }
  for i := 1; i < numRows; i++ {
    sbs[0].Write(sbs[i].Bytes())
  }
  return sbs[0].String()
}
