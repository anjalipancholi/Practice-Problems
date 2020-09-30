package Tree;

public class BineryTreeTilt {
    int tilt =0;
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;


        TreeNode(int x) {
            val = x;

        }

    }

    public int findTilt(TreeNode root) {

        int left_sum =0;
        int right_sum =0;
        left_sum +=findTilt(root.left);
        right_sum += findTilt(root.right);
        tilt = Math.abs(right_sum - left_sum);
        return tilt;

    }



}

