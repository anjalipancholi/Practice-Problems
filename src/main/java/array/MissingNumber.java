package array;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) return i;
            System.out.println(i);
        }


        return -1;
    }

    public static void main(String[] args) {
        new MissingNumber().missingNumber(new int[]{3, 0, 1});
    }
}
