package Tree;

public class UnivaluedBinerytree {
   public class TreeNode {
       TreeNode left;
       TreeNode right;
       int val;

   TreeNode (int x){ val = x;}
   }

    public boolean isUnivalTree(TreeNode root) {


        boolean left = (root.left == null || root.val == root.left.val && isUnivalTree(root.left));
        boolean right = (root.right == null || root.val == root.right.val && isUnivalTree(root.right));
        return left && right;

    }
}

