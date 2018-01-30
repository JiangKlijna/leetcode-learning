
fun main(args: Array<String>) {
    ListNode.printListNode(ListNode.getListNode(1, 5, 6, 2), ListNode.getListNode(7, 8, 6, 2))
}

class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null

    companion object {
        fun getListNode(vararg `is`: Int): ListNode {
            val re = ListNode(`is`[0])
            var prev = re
            for (i in 1 until `is`.size) {
                prev.next = ListNode(`is`[i])
                prev = prev.next!!
            }
            return re
        }

        fun printListNode(vararg lns: ListNode?) {
            for (ln in lns) {
                var tmp :ListNode?= ln
                while (tmp != null) {
                    print(tmp.`val`.toString() + "\t")
                    tmp = tmp.next
                }
                print('\n')
            }
        }
    }
}
