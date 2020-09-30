package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftVAlue {
    public int findBottomLeftValue(TreeNode root) {
        int result = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            for (int i = 0; i <= queue.size(); i++){
                TreeNode current = queue.poll();
                if(i == 0) {
                    result = current.val;
                }
                if(current.left != null) {
                    queue.add(current.left);
                }
                if(current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        return result;
    }
}
