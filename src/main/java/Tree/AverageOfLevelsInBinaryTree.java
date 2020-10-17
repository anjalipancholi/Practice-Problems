package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {

  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> list = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();
    if (root != null) {
      q.add(root);
      while (!q.isEmpty()) {
        long count = 0;
        long sum = 0;
        Queue<TreeNode> temp = new LinkedList<>();
        while (!q.isEmpty()) {
          TreeNode n = q.remove();
          sum += n.val;
          count++;
          if (n.left != null) {
            temp.add(n.left);
          }
          if (n.right != null) {
            temp.add(n.right);
          }
        }
        q = temp;
        list.add(sum * 1.0 / count);
      }
    }
    return list;
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