
function ListNode(val) {
    this.val = val;
    this.next = null;
}

// int... is -> ListNode
ListNode.getListNode = function() {
    let re = new ListNode(arguments[0]), prev = re;
    for (let i = 1; i < arguments.length; i++)
        prev = prev.next = new ListNode(arguments[i]);
    return re;
}

// ListNode... lns
ListNode.printListNode = function() {
    let bytes = [];
    for (let ln of arguments) {
        while (ln != null) {
            bytes.push(ln.val + '\t');
            ln = ln.next;
        }
        bytes.push('\n');
    }
    console.log(bytes.join(''));
}

ListNode.printListNode(ListNode.getListNode(1,5,6,2), ListNode.getListNode(7,8,6,2));
