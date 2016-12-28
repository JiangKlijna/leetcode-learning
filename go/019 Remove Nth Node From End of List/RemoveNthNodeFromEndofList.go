
/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func removeNthFromEnd(head *ListNode, n int) *ListNode {
    if head.Next == nil {
        return nil
    }
    q, p := head, head
    for n > 0 {
        p = p.Next
        n -= 1
    }
    if p == nil {
        return head.Next
    }
    for p.Next != nil {
        p = p.Next
        q = q.Next
    }
    q.Next = q.Next.Next
    return head
}
