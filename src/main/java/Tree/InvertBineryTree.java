package Tree;

public class InvertBineryTree {

  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }
    TreeNode left = invertTree(root.left);
    TreeNode right = invertTree(root.right);
    root.left = right;
    root.right = left;
    return root;

  }

  public class TreeNode {

    TreeNode left;
    TreeNode right;
  }
}
