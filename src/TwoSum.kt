class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    val a = IntArray(2)
                    a[0] = i
                    a[1] = j
                    return a
                }
            }
        }
        return IntArray(2){-1; -1}
    }
}