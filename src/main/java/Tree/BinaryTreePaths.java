package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {


  public List<String> binaryTreePaths(TreeNode root) {
    List<String> list = new ArrayList<>();
    writePaths(root, list, "");
    return list;
  }

  public void writePaths(TreeNode root, List<String> list, String curr) {
    if (root == null) {
      return;
    }
    curr += root.val;
    writePaths(root.left, list, curr + "->");
    writePaths(root.right, list, curr + "->");
    if (root.left == null && root.right == null) {
      list.add(curr);
    }
  }

  public class TreeNode {

    TreeNode left, right;
    int val;

    TreeNode(int x) {
      val = x;
    }
  }
}

