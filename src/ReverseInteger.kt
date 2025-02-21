class Solution {
    fun reverse(x: Int): Int {
        var n = 0
        var x1 = x
        while (x1 != 0) {
            if (n > Int.MAX_VALUE / 10 || n < Int.MIN_VALUE / 10) {
                return 0
            }
            n *= 10
            n += x1 % 10
            x1 /= 10
        }
        return n
    }
}

fun main() {
    val solution = Solution()
    println(solution.reverse(-2147483648))
    println(solution.reverse(-123))
    println(solution.reverse(120))
    println(solution.reverse(100))
}