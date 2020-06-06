package array;

import java.util.Arrays;

// this code is used if there are no duplicates
public class KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] - nums[i] == k)
                    count++;

            }
        }

        return count;


    }

    public static void main(String[] args) {
        new KdiffPairsInAnArray().findPairs(new int[]{3, 1, 4, 1, 5}, 2);
    }
}

