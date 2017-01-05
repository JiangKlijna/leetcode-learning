
# You are given two linked lists representing two non-negative numbers.
# The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
# Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
# Output: 7 -> 0 -> 8
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        t1, t2, reNode, pre = l1, l2, ListNode(0), 0
        temp = reNode
        while True:
            if t1 != None and t2 != None :
                re = pre + t1.val + t2.val
                t1 = t1.next
                t2 = t2.next
            elif t2 != None :
                re = pre + t2.val
                t2 = t2.next
            elif t1 != None :
                re = pre + t1.val
                t1 = t1.next
            else :
                break
            if re >= 10 :
                pre = 1
                re = re % 10
            else :
                pre = 0
            temp.next = ListNode(re)
            temp = temp.next
        if pre == 1 :
            temp.next = ListNode(pre)
        return reNode.next
