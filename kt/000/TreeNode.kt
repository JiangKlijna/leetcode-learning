
class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null

    companion object {

        fun getTreeNode(vararg `is`: Int): TreeNode {
            val tns = Array(`is`.size, {
                TreeNode(`is`[it])
            })
            for (i in tns.indices) {
                val left = 2 * i + 1
                val right = left + 1
                if (left >= tns.size) break
                tns[i].left = tns[left]
                if (right >= tns.size) break
                tns[i].right = tns[right]
            }
            return tns[0]
        }

        fun printTreeNode(vararg tns: TreeNode) {
            for (tn in tns) {
                print(tn)
                println()
            }
        }

        private fun print(tn: TreeNode?) {
            if (tn == null) return
            print('[')
            print(tn.left)
            print(tn.`val`)
            print(tn.right)
            print(']')
        }
    }
}
