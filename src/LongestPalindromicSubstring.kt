class Solution {
    fun longestPalindrome(s: String): String {
        var longest = ""
        for (i in 0 until s.length) {
            for (j in i until s.length) {
                var str = ""
                var left = i
                var right = j
                while(left < right) {
                    if (s[left] != s[right]) {
                        break
                    }
                    left++
                    right--
                }
                if (left >= right) {
                    if (j - i + 1 > longest.length) {
                        for (k in i..j) {
                            str += s[k]
                        }
                        longest = str
                    }
                }
            }
        }
        return longest
    }
}

fun main() {
    val solution = Solution()
    val test1 = "bababac"
    val test2 = "arozaupalanalapuazora"
    val test3 = "arozaupa"
    val test4 = "ababbbb"
    println(test1 + " " + solution.longestPalindrome(test1))
    println(test2 + " " + solution.longestPalindrome(test2))
    println(test3 + " " + solution.longestPalindrome(test3))
    println(test4 + " " + solution.longestPalindrome(test4))
}