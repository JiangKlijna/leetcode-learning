
/**
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    t1, t2, reNode, pre := l1, l2, &ListNode{0, nil}, 0
    temp := reNode
    for {
        var re int
        if t1 != nil && t2 != nil {
            re = pre + t1.Val + t2.Val
            t1 = t1.Next
            t2 = t2.Next
        } else if t2 != nil {
            re = pre + t2.Val
            t2 = t2.Next
        } else if t1 != nil {
            re = pre + t1.Val
            t1 = t1.Next
        } else {
            break
        }
        if re >= 10 {
            pre = 1
            re = re % 10
        } else {
            pre = 0
        }
        temp.Next = &ListNode{re, nil}
        temp = temp.Next
    }
    if pre == 1 {
        temp.Next = &ListNode{pre, nil}
    }
    return reNode.Next
}
