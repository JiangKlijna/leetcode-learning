
/**
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
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
    func addTwoNumbers(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
        var t1 = l1, t2 = l2, reNode = ListNode(0), temp = reNode, pre = 0
        while true {
            var re: Int
            if t1 != nil && t2 != nil {
                re = pre + t1!.val + t2!.val
                t1 = t1!.next
                t2 = t2!.next
            } else if t2 != nil {
                re = pre + t2!.val
                t2 = t2!.next
            } else if t1 != nil {
                re = pre + t1!.val
                t1 = t1!.next
            } else {
                break
            }
            if re >= 10 {
                pre = 1
                re = re % 10
            } else {
                pre = 0
            }
            temp.next = ListNode(re)
            temp = temp.next!
        }
        if pre == 1 {
            temp.next = ListNode(pre)
        }
        return reNode.next
    }
}
