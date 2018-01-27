
/*
* 本题题意：给出一个int，反轉整形數
*/
class ReverseInteger {
    fun reverse(x: Int): Int {
        var y = if (x < 0) -x else x
        var re = 0
        while (y > 0) {
            if (re != 0 && Integer.MAX_VALUE / re < 10)
                return 0
            re *= 10
            re += y % 10
            y /= 10
        }
        return if (x < 0) -re else re
    }
}
