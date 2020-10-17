package array;

import java.util.Arrays;

// this code is used if there are no duplicates
public class KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        if(k < 0) return 0;
        Arrays.sort(nums);
        int left = 0, right = 1, count = 0;
        while(right < nums.length){
            if(nums[right] - nums[left] > k){
                left++;
            }else if(nums[right] - nums[left] < k || right == left){
                right++;
            }else{
                count++;
                left++;
                right++;
                while(right < nums.length && nums[right] == nums[right - 1]) right++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        new KdiffPairsInAnArray().findPairs(new int[]{3, 1, 4, 1, 5}, 2);
    }
}

