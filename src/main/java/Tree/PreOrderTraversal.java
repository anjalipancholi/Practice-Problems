package Tree;


import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

  private List<Integer> list;

  public class TreeNode {

    TreeNode left;
    TreeNode right;
    int val;


    TreeNode(int x) {
      val = x;

    }

    public List<Integer> postorder(TreeNode root) {
      list = new ArrayList<>();
      helper(root);

      TreeNode tree = new TreeNode(list.get(0));

      list.add(root.val);
      return list;
    }

    public void helper(TreeNode node) {
      if (node == null) {
        return;
      }

      helper(node.left);

      list.add(node.val);

      helper(node.right);
    }
  }
}


