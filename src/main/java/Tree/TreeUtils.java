package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeUtils {
    static TreeNode deserializeBinaryTree(List<Integer> serializedTree) {
        if (serializedTree == null || serializedTree.isEmpty()) {
            throw new IllegalArgumentException();
        }
        TreeNode root = new TreeNode(serializedTree.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 1; i < serializedTree.size(); i++) {
            if (queue.isEmpty()) {
                throw new IllegalArgumentException("Invalid Input Tree");
            }
            TreeNode poll = queue.poll();
            poll.left = serializedTree.get(i) != null ?
                    new TreeNode(serializedTree.get(i)) : null;
            i++;
            if (poll.left != null) {
                queue.add(poll.left);
            }
            poll.right = serializedTree.get(i) != null ?
                    new TreeNode(serializedTree.get(i)) : null;
            if (poll.right != null) {
                queue.add(poll.right);
            }
        }
        return root;
    }
}
