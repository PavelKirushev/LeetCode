class Solution {
    fun convert(s: String, numRows: Int): String {
        var result = ""
        val map = mutableMapOf(0 to "")
        var i = 0
        while (i < s.length) {
            map[i] = s[i].toString()
            result += s[i]
            i += numRows + 1
        }
        i = 1
        while (i < s.length) {
            map[i] = s[i].toString()
            result += s[i]
            i += 2
        }
        for (i in 0 until s.length) {
            if (map[i] == null) {
                result += s[i]
            }
        }
        return result
    }
}

fun main() {
    val solution = Solution()
    val test1 = "PAYPALISHIRING"
    println(solution.convert(test1, 3)) // expected: "PAHNAPLSIIGYIR"
}