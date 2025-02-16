/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val root = ListNode(0)
        var cur = root
        var cur_l1 = l1
        var cur_l2 = l2
        while (cur_l1 != null && cur_l2 != null) {
            cur.`val` += cur_l1.`val` + cur_l2.`val`
            cur_l1 = cur_l1.next
            cur_l2 = cur_l2.next
            if (cur_l1 != null || cur_l2 != null || cur.`val` > 9) {
                var item = 0
                if (cur.`val` > 9) {
                    item =  cur.`val` / 10
                    cur.`val` %= 10
                }
                cur.next = ListNode(item)
                cur = cur.next!!
            }
        }
        while (cur_l1 != null) {
            cur.`val` += cur_l1.`val`
            cur_l1 = cur_l1.next
            if (cur_l1 != null || cur.`val` > 9) {
                var item = 0
                if (cur.`val` > 9) {
                    item =  cur.`val` / 10
                    cur.`val` %= 10
                }
                cur.next = ListNode(item)
                cur = cur.next!!
            }
        }
        while (cur_l2 != null) {
            cur.`val` += cur_l2.`val`
            cur_l2 = cur_l2.next
            if (cur_l2 != null || cur.`val` > 9) {
                var item = 0
                if (cur.`val` > 9) {
                    item =  cur.`val` / 10
                    cur.`val` %= 10
                }
                cur.next = ListNode(item)
                cur = cur.next!!
            }
        }
        return root
    }
}

fun main() {
    var l1 = ListNode(0)
//    l1.next = ListNode( 4)
//    l1.next!!.next = ListNode( 3)
    var l2 = ListNode(7)
    l2.next = ListNode( 3)
//    l2.next!!.next = ListNode( 4)

    var result = Solution()
    var res_l = result.addTwoNumbers(l1, l2)
    var cur = res_l
    while(cur != null) {
        print(cur.`val`)
        if (cur.next != null) {
            print(" ")
        }
        cur = cur.next
    }
}