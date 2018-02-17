
/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example, Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 *
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int = 0) {
 *     var next: ListNode? = null
 * }
 */
 class SwapNodesinPairs {
 	fun swapPairs(head: ListNode?): ListNode? {
 		if (head == null) return null
 		val second = head.next ?: return head
 		head.next = swapPairs(second.next)
 		second.next = head
 		return second
 	}
 }
