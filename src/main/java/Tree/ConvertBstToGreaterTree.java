package Tree;

public class ConvertBstToGreaterTree {

  int sum = 0;

  public TreeNode convertBST(TreeNode root) {
    if (root != null) {
      convertBST(root.right);
      sum += root.val;
      root.val = sum;
      convertBST(root.left);
    }
    return root;
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
