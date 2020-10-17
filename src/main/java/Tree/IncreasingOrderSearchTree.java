package Tree;


import java.util.Arrays;

public class IncreasingOrderSearchTree {

  TreeNode current;

  public static void main(String[] args) {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.right = new TreeNode(6);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.left.left.left = new TreeNode(1);
    root.right.right = new TreeNode(8);
    root.right.right.left = new TreeNode(7);
    root.right.right.right = new TreeNode(9);
    TreeNode root2 = TreeUtils
        .deserializeBinaryTree(Arrays.asList(5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9));
    System.out.println(new IncreasingOrderSearchTree().increasingBST(root));
  }

  public TreeNode increasingBST(TreeNode root) {
    helper(root);
    return root;
  }

  public void helper(TreeNode root) {
    if (root == null) {
      return;
    }

    helper(root.left);
    current.right = root;
    root.left = null;
    helper(root.right);
  }
}
