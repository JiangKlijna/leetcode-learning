
/**
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1, t2 = l2, reNode = new ListNode(0), temp = reNode;
        int pre = 0, re;
        while (true) {
            if (t1 != null && t2 != null) {
                re = pre + t1.val + t2.val;
                t1 = t1.next;
                t2 = t2.next;
            } else if (t2 != null) {
                re = pre + t2.val;
                t2 = t2.next;
            } else if (t1 != null) {
                re = pre + t1.val;
                t1 = t1.next;
            } else {
                break;
            }
            if (re >= 10) {
                pre = re / 10;
                re = re % 10;
            } else {
                pre = 0;
            }
            temp = temp.next = new ListNode(re);
        }
        if (pre > 0) {
            temp.next = new ListNode(pre);
        }
        return reNode.next;
    }
}
