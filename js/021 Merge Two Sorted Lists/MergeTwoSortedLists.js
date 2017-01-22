
/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
    if (l1 == null)
        return l2;
    if (l2 == null)
        return l1;
    let re;
    if (l1.val < l2.val) {
        re = l1;
        re.next = mergeTwoLists(l1.next, l2);
    } else {
        re = l2;
        re.next = mergeTwoLists(l1, l2.next);
    }
    return re;
};
