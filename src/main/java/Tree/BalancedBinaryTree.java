package Tree;

public class BalancedBinaryTree {

  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    int l = helper(root.left), r = helper(root.right);
    if (Math.abs(l - r) > 1) {
      return false;
    }
    return isBalanced(root.left) && isBalanced(root.right);
  }

  public int helper(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int lheight = helper(root.left);
    int rheight = helper(root.right);
    return Math.max(lheight, rheight) + 1;
  }

  public class TreeNode {

    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int x) {
      val = x;
    }
  }
}