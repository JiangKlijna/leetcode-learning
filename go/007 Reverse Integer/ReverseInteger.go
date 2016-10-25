package main
/**
 *本题题意：给出一个int，反轉整形數
 */

func reverse(x int) int {
  var(
    y int
    re int = 0
    maxint int = 2147483647
  )
  if x < 0{
     y = -x
  } else {
     y = x
  }
  for y > 0{
    if re != 0 &&  maxint / re < 10{
      return 0
    }
    re *= 10
    re += y%10
    y /= 10
  }
  if x < 0{
    return -re
  }
  return re
}
