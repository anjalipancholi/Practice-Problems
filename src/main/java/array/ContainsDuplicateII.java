package array;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && j - i <= k) return true;
                System.out.println(true);
            }
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        new ContainsDuplicateII().containsNearbyDuplicate(new int[]{1, 3, 4, 1}, 2);

    }
}
