package trees;

import javax.swing.tree.TreeNode;

public class diameterOfBT {
    static int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
       
    diameter = 0;
    height(root);
    return diameter;
    }
    public static int height(TreeNode root) {

    if (root == null) {
        return 0;
    }

    int leftDepth = height(root.left);
    int rightDepth = height(root.right);

    diameter = Math.max(diameter, leftDepth + rightDepth);

    return 1 + Math.max(leftDepth, rightDepth);
}
}
