
function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

// int... is -> TreeNode
TreeNode.getTreeNode = function () {
    let tns = new Array(arguments.length);
    for (let i = 0; i < tns.length; i++)
        tns[i] = new TreeNode(arguments[i]);
    for (let i = 0; i < tns.length; i++) {
        let left = 2 * i + 1, right = left + 1;
        if (left >= tns.length) break;
        tns[i].left = tns[left];
        if (right >= tns.length) break;
        tns[i].right = tns[right];
    }
    return tns[0];
}

// TreeNode... tns
TreeNode.printTreeNode = function () {
    for (let tn of arguments)
        console.log(TreeNode.print(tn).join(''));
}

TreeNode.print = function (tn) {
    if (tn == null) return;
    let buf = [];
    buf.push('[');
    Array.prototype.push.apply(buf, TreeNode.print(tn.left));
    buf.push(tn.val);
    Array.prototype.push.apply(buf, TreeNode.print(tn.right));
    buf.push(']');
    return buf;
}

TreeNode.printTreeNode(TreeNode.getTreeNode(1,5,6,2), TreeNode.getTreeNode(7,8,6,2));
