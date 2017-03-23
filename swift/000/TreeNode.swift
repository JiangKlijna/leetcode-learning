
public class TreeNode {
    public var val: Int
    public var left: TreeNode?
    public var right: TreeNode?

    public init(_ val: Int) {
        self.val = val
        self.left = nil
        self.right = nil
    }

    class func getTreeNode(ints: Int...) -> TreeNode {
        var tns: [TreeNode] = []
        for var i = 0; i < ints.count; i++ {
            tns.append(TreeNode(ints[i]))
        }
        for var i = 0; i < tns.count; i++ {
            let left = 2 * i + 1, right = left + 1
            if (left >= tns.count) {break}
            tns[i].left = tns[left]
            if (right >= tns.count) {break}
            tns[i].right = tns[right]
        }
        return tns[0]
    }

    class func printTreeNode(tns: TreeNode...) {
        for tn in tns {
            print(String(p(tn)))
        }
    }

    class func p(tn: TreeNode?) -> [Character] {
        if tn == nil {return []}
        var bytes: [Character] = []
        bytes.append("[")
        bytes += p(tn!.left)
        bytes.append(Character(UnicodeScalar((tn!.val) + 48)))
        bytes += p(tn!.right)
        bytes.append("]")
        return bytes
    }
}

TreeNode.printTreeNode(TreeNode.getTreeNode(1, 5, 6, 2), TreeNode.getTreeNode(7, 8, 6, 2))
