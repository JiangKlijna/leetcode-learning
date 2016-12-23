
public class ListNode {
    public var val: Int
    public var next: ListNode?
    public init(_ val: Int) {
        self.val = val
        self.next = nil
    }

    class func getListNode(ints: Int...) -> ListNode {
        let re = ListNode(ints[0])
        var prev: ListNode = re
        for i in 1..<ints.count {
            prev.next = ListNode(ints[i])
            prev = prev.next!
        }
        return re
    }

    class func printListNode(nodes: ListNode...) {
        var bytes: [Character] = []
        for node in nodes {
            var nl: ListNode? = node
            while nl != nil {
                bytes.append(Character(UnicodeScalar((nl!.val) + 48)))
                bytes.append("\t")
                nl = nl!.next
            }
            bytes.append("\n")
        }
        print(String(bytes))
    }
}

ListNode.printListNode(ListNode.getListNode(1, 5, 6, 2), ListNode.getListNode(7, 8, 6, 2));
