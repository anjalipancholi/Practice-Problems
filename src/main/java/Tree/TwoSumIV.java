package Tree;

import java.util.HashMap;

public class TwoSumIV {

  HashMap<Integer, Integer> twoSum = new HashMap<>();

  public boolean findTarget(TreeNode root, int k) {

    return twoSum(root, k);
  }

  public boolean twoSum(TreeNode root, int k) {
    if (root == null) {
      return false;
    }

    if (twoSum.containsKey(k - root.val)) {
      return true;
    } else {
      twoSum.put(root.val, root.val);
    }

    return twoSum(root.left, k) || twoSum(root.right, k);
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



