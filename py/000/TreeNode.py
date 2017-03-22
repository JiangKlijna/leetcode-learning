
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

    @classmethod
    def getTreeNode(cls, *ints):
        tns = [TreeNode(e) for e in ints]
        for i in range(len(tns)):
            left, right = 2*i+1, 2*i+2
            if left >= len(tns):
                break
            tns[i].left = tns[left]
            if right >= len(tns):
                break
            tns[i].right = tns[right]
        return tns[0]

    @classmethod
    def printTreeNode(cls, *nodes):
        for node in nodes:
            print(''.join(TreeNode.p(node)))

    @classmethod
    def p(cls, tn):
        if tn is None:
            return []
        buf = []
        buf.append('[')
        buf += cls.p(tn.left)
        buf.append(str(tn.val))
        buf += cls.p(tn.right)
        buf.append(']')
        return buf

TreeNode.printTreeNode(TreeNode.getTreeNode(1,5,6,2), TreeNode.getTreeNode(7,8,6,2));
