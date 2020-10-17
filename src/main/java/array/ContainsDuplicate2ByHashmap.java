package array;

import java.util.HashMap;

public class ContainsDuplicate2ByHashmap {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], i);
            else {
                if (i - map.get(nums[i]) <= k) return true;
                else map.put(nums[i], i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        new ContainsDuplicate2ByHashmap().containsNearbyDuplicate(new int[]{1, 3, 4, 1}, 2);

    }
}
