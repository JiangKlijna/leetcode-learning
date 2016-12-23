
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static void main(String[] args) {
        printListNode(getListNode(1, 5, 6, 2), getListNode(7, 8, 6, 2));
    }

    public static ListNode getListNode(int... is) {
        ListNode re = new ListNode(is[0]), prev = re;
        for (int i = 1; i < is.length; i++)
            prev = prev.next = new ListNode(is[i]);
        return re;
    }

    public static void printListNode(ListNode... lns) {
        for (ListNode ln : lns) {
            while (ln != null) {
                System.out.print(ln.val + "\t");
                ln = ln.next;
            }
            System.out.print('\n');
        }
    }
}
