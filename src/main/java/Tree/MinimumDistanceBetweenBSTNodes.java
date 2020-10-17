package Tree;

import java.util.ArrayList;
import java.util.List;

public class MinimumDistanceBetweenBSTNodes {

  public int minDiffInBST(TreeNode root) {
    int result = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<>();

    helper(root, list);
    for (int i = 0; i < list.size() - 1; i++) {
      result = Math.min(result, list.get(i + 1) - list.get(i));
    }
    return result;
  }

  public void helper(TreeNode node, List<Integer> vals) {
    if (node == null) {
      return;
    }
    helper(node.left, vals);
    vals.add(node.val);
    helper(node.right, vals);
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


