package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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


public class NaryTreeLevelOrderTraversal {

  public List<List<Integer>> levelOrder(Node root) {
    List<List<Integer>> result = new ArrayList<>();
    Queue<Node> queue = new LinkedList<>();
    if (root == null) {
      return result;
    }
    queue.add(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        Node current = queue.poll();
        list.add(current.val);
        if (current.children.size() != 0) {
          for (int j = 0; j < current.children.size(); j++) {
            queue.add(current.children.get(j));
          }
        }
      }
      result.add(list);
    }
    return result;
  }
}