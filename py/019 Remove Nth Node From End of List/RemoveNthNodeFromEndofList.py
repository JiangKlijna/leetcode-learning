
# Given a linked list, remove the nth node from the end of list and return its head.
# Given linked list: 1->2->3->4->5, and n = 2.
# After removing the second node from the end, the linked list becomes 1->2->3->5.
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        if head.next == None :
            return None
        q, p = head, head
        while n > 0 :
            p = p.next
            n -= 1
        if p == None :
            return head.next
        while p.next != None :
            p = p.next
            q = q.next
        q.next = q.next.next
        return head
