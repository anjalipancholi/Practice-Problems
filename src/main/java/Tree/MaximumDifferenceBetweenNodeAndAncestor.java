package Tree;

public class MaximumDifferenceBetweenNodeAndAncestor {

  int maxDiffernce = Integer.MIN_VALUE;

  public int maxAncestorDiff(TreeNode root) {
    helper(root, root.val, root.val);
    return maxDiffernce;
  }

  public void helper(TreeNode root, int min, int max) {
    if (root == null) {
      return;
    }
    min = Math.min(min, root.val);
    max = Math.max(max, root.val);
    maxDiffernce = Math.max(maxDiffernce, max - min);
    helper(root.left, min, max);
    helper(root.right, min, max);
  }
}
