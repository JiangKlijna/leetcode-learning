
/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
 /**
  * @param {ListNode} head
  * @param {number} n
  * @return {ListNode}
  */
var removeNthFromEnd = function(head, n) {
    if (head.next == null)
        return null;
    let q = head, p = head;
    while (n-- > 0)
        p = p.next;
    if (p == null)
        return head.next;
    while (p.next != null) {
        p = p.next;
        q = q.next;
    }
    q.next = q.next.next;
    return head;
};
