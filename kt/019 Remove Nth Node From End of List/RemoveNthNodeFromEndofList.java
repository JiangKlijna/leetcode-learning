
/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int = 0) {
 *     var next: ListNode? = null
 * }
 */
 class RemoveNthNodeFromEndofList {
 	fun removeNthFromEnd(head: ListNode, n: Int): ListNode? {
 		var n = n
 		if (head?.next == null)
 			return null
 		var q: ListNode? = head
 		var p: ListNode? = head
 		while (n-- > 0)
 			p = p!!.next
 		if (p == null)
 			return head!!.next
 		while (p!!.next != null) {
 			p = p.next
 			q = q!!.next
 		}
 		q!!.next = q.next!!.next
 		return head
 	}
 }
