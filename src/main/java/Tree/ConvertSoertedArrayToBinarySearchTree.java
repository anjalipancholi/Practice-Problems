package Tree;

public class ConvertSoertedArrayToBinarySearchTree {

  public TreeNode sortedArrayToBST(int[] nums) {
    return helper(nums, 0, nums.length - 1);
  }

  private TreeNode helper(int[] nums, int start, int end) {
    int mid = (start + end) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = helper(nums, start, mid - 1);
    root.right = helper(nums, mid + 1, end);
    return root;
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
