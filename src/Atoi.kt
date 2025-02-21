import kotlin.math.absoluteValue

class Solution {
    fun myAtoi(s: String): Int {
        var n = 0
        var i = 0
        var flag = true
        while (i < s.length && s[i] == ' ') {
            i++
        }
        if (i < s.length && (s[i] == '-' || s[i] == '+')) {
            if (s[i] == '-') {
                flag = false
            }
            i++
        }
        while (i < s.length && s[i] == '0') {
            i++
        }
        while (i < s.length && s[i] >= '0' && s[i] <= '9') {
            if (n > Int.MAX_VALUE / 10 || n < Int.MIN_VALUE / 10 || (n >= Int.MAX_VALUE / 10 && s[i].digitToInt() > Int.MAX_VALUE % 10) || (n <= Int.MIN_VALUE / 10 && s[i].digitToInt() < Int.MIN_VALUE.absoluteValue % 10)) {
                if (flag == true) {
                    return Int.MAX_VALUE
                }
                return Int.MIN_VALUE
            }
            n *= 10
            n += s[i].digitToInt()
            i++
        }
        if (!flag) {
            n = -n
        }
        return n
    }
}

fun main() {
    val solution = Solution()
    println(solution.myAtoi("-91283472332"))
    println(solution.myAtoi("    00000123das"))
    println(solution.myAtoi("    -00000123das"))
}