package Tree;

import javax.swing.tree.TreeNode;

public class SymmetricTree {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int x) {
            val = x;
        }

        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            return helper(root.left, root.right);
        }

        public boolean helper(TreeNode a, TreeNode b) {
            if (a == null && b == null) return true;
            if (a == null || b == null) return false;
            if (a.val != b.val) return false;
            return helper(a.left, b.right) && helper(a.right, b.left);
        }
    }
}
