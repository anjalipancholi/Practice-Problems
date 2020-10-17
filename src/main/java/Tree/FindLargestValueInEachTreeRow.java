package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachTreeRow {

  public List<Integer> largestValues(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    List<Integer> list = new ArrayList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < size; i++) {
        TreeNode currentLevel = queue.poll();
        max = Math.max(max, currentLevel.val);
        if (currentLevel.left != null) {
          queue.add(currentLevel.left);
        }
        if (currentLevel.right != null) {
          queue.add(currentLevel.right);
        }
      }
      list.add(max);
    }
    return list;
  }
}
