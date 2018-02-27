
/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int = 0) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head ?: return head
        var ln = head
        while (ln != null) {
            if (current.`val` < ln.`val`) {
                current.next = ln
                current = ln
            }
            ln = ln.next
        }
        if (current != null) current.next = null
        return head
    }
}
