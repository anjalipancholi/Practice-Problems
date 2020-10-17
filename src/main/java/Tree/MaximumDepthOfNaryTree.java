package Tree;


import java.util.List;

public class MaximumDepthOfNaryTree {

  public int maxDepth(Node root) {
    if (root == null) {
      return 0;
    } else {
      int max = 0;
      if (root.children != null) {
        for (Node child : root.children) {
          max = Math.max(max, maxDepth(child));
        }
      }

      return 1 + max;
    }
  }

  class Node {

    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  }
}

