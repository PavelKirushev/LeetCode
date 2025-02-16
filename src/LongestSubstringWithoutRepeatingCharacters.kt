class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var longest = 0
        for (i in 0 until s.length) {
            var count = 0
            var str = ""
            var flag = true
            for (j in i until s.length) {
                for (k in 0 until str.length) {
                    if (s[j] == str[k]) {
                        count = str.length
                        flag = false
                        break
                    }
                }
                if (!flag) {
                    break
                }
                count++
                str += s[j]
            }
            if (longest < count) {
                longest = count
            }
        }
        if (longest == 0) {
            longest = s.length
        }
        return longest
    }
}

fun main() {
    val solution = Solution()
    println(solution.lengthOfLongestSubstring("abcabcbb")) // expected 3
    println(solution.lengthOfLongestSubstring("bbbbb")) // expected 1
    println(solution.lengthOfLongestSubstring("pwwkew")) // expected 3
    println(solution.lengthOfLongestSubstring("abcdef")) // expected 6
    println(solution.lengthOfLongestSubstring("aab")) // expected 2
}