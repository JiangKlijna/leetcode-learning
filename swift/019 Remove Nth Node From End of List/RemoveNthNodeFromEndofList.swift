
/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     public var val: Int
 *     public var next: ListNode?
 *     public init(_ val: Int) {
 *         self.val = val
 *         self.next = nil
 *     }
 * }
 */
class Solution {
    func removeNthFromEnd(_ head: ListNode?, _ n: Int) -> ListNode? {
        if head!.next == nil {
            return nil
        }
        var q = head, p = head, len = n
        while len > 0 {
            p = p!.next
            len -= 1
        }
        if p == nil {
            return head!.next
        }
        while p!.next != nil {
            p = p!.next
            q = q!.next
        }
        q!.next = q!.next!.next
        return head
    }
}
