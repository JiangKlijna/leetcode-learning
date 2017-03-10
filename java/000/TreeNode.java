
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode getTreeNode(int... is) {
        TreeNode[] tns = new TreeNode[is.length];
        for (int i = 0; i < tns.length; i++)
            tns[i] = new TreeNode(is[i]);
        for (int i = 0; i < tns.length; i++) {
            int left = 2 * i + 1, right = left + 1;
            if (left >= tns.length) break;
            tns[i].left = tns[left];
            if (right >= tns.length) break;
            tns[i].right = tns[right];
        }
        return tns[0];
    }

    public static void printTreeNode(TreeNode... tns) {
        for (TreeNode tn : tns) {
            print(tn);
            System.out.println();
        }
    }

    private static void print(TreeNode tn) {
        if (tn == null) return;
        System.out.print('[');
        print(tn.left);
        System.out.print(tn.val);
        print(tn.right);
        System.out.print(']');
    }
}
