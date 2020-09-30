package Tree;

public class searchInABinaryTree{
    public class TreeNode {

    TreeNode right;
    TreeNode left;
    int val;
    TreeNode(int x) {
    val = x;}
    }
    public TreeNode searchBST(TreeNode root, int val) {
    if(root != null) {
        if(root.val == val) {
            return root;
        }
        if(root.val < val) {
           return searchBST(root.right,val);
        }
        if(root.val> val) {
           return searchBST(root.left, val);
        }

    }
    return null;
    }
    }

