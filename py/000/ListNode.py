
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

    @classmethod
    def getListNode(cls, *ints):
        re = ListNode(ints[0])
        prev = re
        for i in range(1, len(ints)):
            prev.next = ListNode(ints[i])
            prev = prev.next
        return re

    @classmethod
    def printListNode(cls, *nodes):
        bytes = []
        for ln in nodes:
            while ln != None:
                bytes.append(str(ln.val) + '\t')
                ln = ln.next
            bytes.append('\n')
        print(''.join(bytes))

ListNode.printListNode(ListNode.getListNode(1,5,6,2), ListNode.getListNode(7,8,6,2))
